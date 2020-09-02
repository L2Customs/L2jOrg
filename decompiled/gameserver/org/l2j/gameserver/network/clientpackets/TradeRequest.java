// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.network.clientpackets;

import org.l2j.gameserver.network.serverpackets.AbstractMessagePacket;
import java.util.Iterator;
import org.l2j.gameserver.model.skills.BuffInfo;
import org.l2j.gameserver.model.actor.instance.Player;
import org.l2j.gameserver.network.serverpackets.SendTradeRequest;
import org.l2j.gameserver.model.interfaces.ILocational;
import org.l2j.gameserver.util.MathUtil;
import org.l2j.gameserver.model.BlockList;
import org.l2j.gameserver.enums.PrivateStoreType;
import org.l2j.gameserver.Config;
import org.l2j.gameserver.network.serverpackets.SystemMessage;
import org.l2j.gameserver.util.GameUtils;
import org.l2j.gameserver.model.WorldObject;
import org.l2j.gameserver.world.World;
import org.l2j.gameserver.network.SystemMessageId;
import org.l2j.gameserver.model.effects.AbstractEffect;
import org.l2j.gameserver.model.skills.AbnormalType;
import org.l2j.gameserver.network.serverpackets.ServerPacket;
import org.l2j.gameserver.network.serverpackets.ActionFailed;
import java.util.Objects;
import org.l2j.gameserver.network.GameClient;

public final class TradeRequest extends ClientPacket
{
    private int objectId;
    
    public void readImpl() {
        this.objectId = this.readInt();
    }
    
    public void runImpl() {
        final Player player = ((GameClient)this.client).getPlayer();
        if (Objects.isNull(player)) {
            return;
        }
        if (!player.getAccessLevel().allowTransaction()) {
            player.sendMessage("Transactions are disabled for your current Access Level.");
            ((GameClient)this.client).sendPacket(ActionFailed.STATIC_PACKET);
            return;
        }
        BuffInfo info = player.getEffectList().getFirstBuffInfoByAbnormalType(AbnormalType.BOT_PENALTY);
        if (Objects.nonNull(info)) {
            for (final AbstractEffect effect : info.getEffects()) {
                if (!effect.checkCondition(-2)) {
                    ((GameClient)this.client).sendPacket(SystemMessageId.YOU_HAVE_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_SO_YOUR_ACTIONS_HAVE_BEEN_RESTRICTED);
                    ((GameClient)this.client).sendPacket(ActionFailed.STATIC_PACKET);
                    return;
                }
            }
        }
        final Player partner = World.getInstance().findPlayer(this.objectId);
        if (Objects.isNull(partner) || !player.isInSurroundingRegion(partner) || partner.getInstanceWorld() != player.getInstanceWorld()) {
            return;
        }
        if (partner.equals(player)) {
            ((GameClient)this.client).sendPacket(SystemMessageId.THAT_IS_AN_INCORRECT_TARGET);
            return;
        }
        if (!GameUtils.isPlayer(partner)) {
            ((GameClient)this.client).sendPacket(SystemMessageId.INVALID_TARGET);
            return;
        }
        if (partner.isInOlympiadMode() || player.isInOlympiadMode()) {
            player.sendPacket(SystemMessageId.CANNOT_TRADE_ITEMS_WITH_THE_TARGETED_USER);
            return;
        }
        info = partner.getEffectList().getFirstBuffInfoByAbnormalType(AbnormalType.BOT_PENALTY);
        if (Objects.nonNull(info)) {
            for (final AbstractEffect effect2 : info.getEffects()) {
                if (!effect2.checkCondition(-2)) {
                    final SystemMessage sm = SystemMessage.getSystemMessage(SystemMessageId.C1_HAS_BEEN_REPORTED_AS_AN_ILLEGAL_PROGRAM_USER_AND_IS_CURRENTLY_BEING_INVESTIGATED);
                    sm.addString(partner.getName());
                    ((GameClient)this.client).sendPacket(sm);
                    ((GameClient)this.client).sendPacket(ActionFailed.STATIC_PACKET);
                    return;
                }
            }
        }
        if (!Config.ALT_GAME_KARMA_PLAYER_CAN_TRADE && player.getReputation() < 0) {
            player.sendMessage("You cannot trade while you are in a chaotic state.");
            return;
        }
        if (!Config.ALT_GAME_KARMA_PLAYER_CAN_TRADE && partner.getReputation() < 0) {
            player.sendMessage("You cannot request a trade while your target is in a chaotic state.");
            return;
        }
        if (Config.JAIL_DISABLE_TRANSACTION && (player.isJailed() || partner.isJailed())) {
            player.sendMessage("You cannot trade while you are in in Jail.");
            return;
        }
        if (player.getPrivateStoreType() != PrivateStoreType.NONE || partner.getPrivateStoreType() != PrivateStoreType.NONE) {
            ((GameClient)this.client).sendPacket(SystemMessageId.WHILE_OPERATING_A_PRIVATE_STORE_OR_WORKSHOP_YOU_CANNOT_DISCARD_DESTROY_OR_TRADE_AN_ITEM);
            return;
        }
        if (player.isProcessingTransaction()) {
            ((GameClient)this.client).sendPacket(SystemMessageId.YOU_ARE_ALREADY_TRADING_WITH_SOMEONE);
            return;
        }
        if (partner.isProcessingRequest() || partner.isProcessingTransaction()) {
            ((GameClient)this.client).sendPacket(((AbstractMessagePacket<ServerPacket>)SystemMessage.getSystemMessage(SystemMessageId.C1_IS_ON_ANOTHER_TASK_PLEASE_TRY_AGAIN_LATER)).addString(partner.getName()));
            return;
        }
        if (partner.isTradeRefusing()) {
            player.sendMessage("That person is in trade refusal mode.");
            return;
        }
        if (BlockList.isBlocked(partner, player)) {
            ((GameClient)this.client).sendPacket(((AbstractMessagePacket<ServerPacket>)SystemMessage.getSystemMessage(SystemMessageId.C1_HAS_PLACED_YOU_ON_HIS_HER_IGNORE_LIST)).addString(partner.getName()));
            return;
        }
        if (!MathUtil.isInsideRadius3D(player, partner, 150)) {
            ((GameClient)this.client).sendPacket(SystemMessageId.YOU_ARE_TOO_FAR_WAY_TO_TRADE);
            return;
        }
        player.onTransactionRequest(partner);
        partner.sendPacket(new SendTradeRequest(player.getObjectId()));
        ((GameClient)this.client).sendPacket(((AbstractMessagePacket<ServerPacket>)SystemMessage.getSystemMessage(SystemMessageId.YOU_HAVE_REQUESTED_A_TRADE_WITH_C1)).addString(partner.getName()));
    }
}
