// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.network.serverpackets.compound;

import org.l2j.gameserver.network.ServerExPacketId;
import org.l2j.gameserver.network.GameClient;
import org.l2j.gameserver.network.serverpackets.ServerPacket;

public class ExEnchantTwoRemoveOK extends ServerPacket
{
    public static final ExEnchantTwoRemoveOK STATIC_PACKET;
    
    private ExEnchantTwoRemoveOK() {
    }
    
    public void writeImpl(final GameClient client) {
        this.writeId(ServerExPacketId.EX_ENCHANT_TWO_REMOVE_OK);
    }
    
    static {
        STATIC_PACKET = new ExEnchantTwoRemoveOK();
    }
}
