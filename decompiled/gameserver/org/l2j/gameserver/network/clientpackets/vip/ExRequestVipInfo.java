// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.network.clientpackets.vip;

import org.l2j.gameserver.network.serverpackets.ServerPacket;
import org.l2j.gameserver.network.serverpackets.vip.ReceiveVipInfo;
import org.l2j.gameserver.network.GameClient;
import org.l2j.gameserver.network.clientpackets.ClientPacket;

public class ExRequestVipInfo extends ClientPacket
{
    @Override
    protected void readImpl() throws Exception {
    }
    
    @Override
    protected void runImpl() {
        ((GameClient)this.client).sendPacket(new ReceiveVipInfo());
    }
}
