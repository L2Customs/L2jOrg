// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.network.clientpackets;

import org.l2j.gameserver.model.Clan;
import org.l2j.gameserver.model.actor.instance.Player;
import org.l2j.gameserver.data.database.data.CrestData;
import org.l2j.gameserver.data.sql.impl.CrestTable;
import org.l2j.gameserver.data.sql.impl.ClanTable;
import org.l2j.gameserver.network.SystemMessageId;
import org.l2j.gameserver.network.GameClient;
import org.l2j.gameserver.network.InvalidDataPacketException;

public final class RequestSetAllyCrest extends ClientPacket
{
    private int _length;
    private byte[] _data;
    
    public RequestSetAllyCrest() {
        this._data = null;
    }
    
    public void readImpl() throws InvalidDataPacketException {
        this._length = this.readInt();
        if (this._length > 192) {
            throw new InvalidDataPacketException();
        }
        this.readBytes(this._data = new byte[this._length]);
    }
    
    public void runImpl() {
        final Player activeChar = ((GameClient)this.client).getPlayer();
        if (activeChar == null) {
            return;
        }
        if (this._length < 0) {
            activeChar.sendMessage("File transfer error.");
            return;
        }
        if (this._length > 192) {
            activeChar.sendPacket(SystemMessageId.PLEASE_ADJUST_THE_IMAGE_SIZE_TO_8X12);
            return;
        }
        if (activeChar.getAllyId() == 0) {
            activeChar.sendPacket(SystemMessageId.THIS_FEATURE_IS_ONLY_AVAILABLE_TO_ALLIANCE_LEADERS);
            return;
        }
        final Clan leaderClan = ClanTable.getInstance().getClan(activeChar.getAllyId());
        if (activeChar.getClanId() != leaderClan.getId() || !activeChar.isClanLeader()) {
            activeChar.sendPacket(SystemMessageId.THIS_FEATURE_IS_ONLY_AVAILABLE_TO_ALLIANCE_LEADERS);
            return;
        }
        if (this._length == 0) {
            if (leaderClan.getAllyCrestId() != 0) {
                leaderClan.changeAllyCrest(0, false);
            }
        }
        else {
            final CrestData crest = CrestTable.getInstance().createCrest(this._data, CrestData.CrestType.ALLY);
            if (crest != null) {
                leaderClan.changeAllyCrest(crest.getId(), false);
                activeChar.sendPacket(SystemMessageId.THE_CREST_WAS_SUCCESSFULLY_REGISTERED);
            }
        }
    }
}
