// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.network.serverpackets;

import org.l2j.gameserver.network.ServerPacketId;
import org.l2j.gameserver.network.GameClient;

public class AcquireSkillDone extends ServerPacket
{
    public void writeImpl(final GameClient client) {
        this.writeId(ServerPacketId.ACQUIRE_SKILL_DONE);
    }
}
