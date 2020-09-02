// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.network.serverpackets;

import org.l2j.gameserver.network.ServerPacketId;
import org.l2j.gameserver.network.GameClient;
import org.l2j.gameserver.model.Location;

public class ObservationMode extends ServerPacket
{
    private final Location _loc;
    
    public ObservationMode(final Location loc) {
        this._loc = loc;
    }
    
    public void writeImpl(final GameClient client) {
        this.writeId(ServerPacketId.OBSERVER_START);
        this.writeInt(this._loc.getX());
        this.writeInt(this._loc.getY());
        this.writeInt(this._loc.getZ());
        this.writeInt(0);
        this.writeInt(192);
    }
}
