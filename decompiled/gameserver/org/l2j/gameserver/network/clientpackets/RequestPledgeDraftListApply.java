// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.network.clientpackets;

import org.l2j.gameserver.model.actor.instance.Player;
import org.l2j.gameserver.network.serverpackets.ServerPacket;
import org.l2j.gameserver.network.serverpackets.SystemMessage;
import org.l2j.gameserver.model.clan.entry.PledgeWaitingInfo;
import org.l2j.gameserver.instancemanager.ClanEntryManager;
import org.l2j.gameserver.network.SystemMessageId;
import org.l2j.gameserver.network.GameClient;

public class RequestPledgeDraftListApply extends ClientPacket
{
    private int _applyType;
    private int _karma;
    
    public void readImpl() {
        this._applyType = this.readInt();
        this._karma = this.readInt();
    }
    
    public void runImpl() {
        final Player activeChar = ((GameClient)this.client).getPlayer();
        if (activeChar == null || activeChar.getClan() != null) {
            return;
        }
        if (activeChar.getClan() != null) {
            ((GameClient)this.client).sendPacket(SystemMessageId.ONLY_THE_CLAN_LEADER_OR_SOMEONE_WITH_RANK_MANAGEMENT_AUTHORITY_MAY_REGISTER_THE_CLAN);
            return;
        }
        switch (this._applyType) {
            case 0: {
                if (ClanEntryManager.getInstance().removeFromWaitingList(activeChar.getObjectId())) {
                    ((GameClient)this.client).sendPacket(SystemMessageId.ENTRY_APPLICATION_CANCELLED_YOU_MAY_APPLY_TO_A_NEW_CLAN_AFTER_5_MINUTES);
                    break;
                }
                break;
            }
            case 1: {
                final PledgeWaitingInfo pledgeDraftList = new PledgeWaitingInfo(activeChar.getObjectId(), activeChar.getLevel(), this._karma, activeChar.getClassId().getId(), activeChar.getName());
                if (ClanEntryManager.getInstance().addToWaitingList(activeChar.getObjectId(), pledgeDraftList)) {
                    ((GameClient)this.client).sendPacket(SystemMessageId.ENTERED_INTO_WAITING_LIST_NAME_IS_AUTOMATICALLY_DELETED_AFTER_30_DAYS_IF_DELETE_FROM_WAITING_LIST_IS_USED_YOU_CANNOT_ENTER_NAMES_INTO_THE_WAITING_LIST_FOR_5_MINUTES);
                    break;
                }
                final SystemMessage sm = SystemMessage.getSystemMessage(SystemMessageId.YOU_MAY_APPLY_FOR_ENTRY_AFTER_S1_MINUTE_S_DUE_TO_CANCELLING_YOUR_APPLICATION);
                sm.addLong(ClanEntryManager.getInstance().getPlayerLockTime(activeChar.getObjectId()));
                ((GameClient)this.client).sendPacket(sm);
                break;
            }
        }
    }
}
