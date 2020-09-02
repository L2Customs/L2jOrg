// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.network.serverpackets;

import org.l2j.gameserver.network.ServerExPacketId;
import org.l2j.gameserver.network.GameClient;

public class ExNoticePostArrived extends ServerPacket
{
    private static final ExNoticePostArrived STATIC_PACKET_TRUE;
    private static final ExNoticePostArrived STATIC_PACKET_FALSE;
    private final boolean _showAnim;
    
    public ExNoticePostArrived(final boolean showAnimation) {
        this._showAnim = showAnimation;
    }
    
    public static ExNoticePostArrived valueOf(final boolean result) {
        return result ? ExNoticePostArrived.STATIC_PACKET_TRUE : ExNoticePostArrived.STATIC_PACKET_FALSE;
    }
    
    public void writeImpl(final GameClient client) {
        this.writeId(ServerExPacketId.EX_NOTICE_POST_ARRIVED);
        this.writeInt(this._showAnim);
    }
    
    static {
        STATIC_PACKET_TRUE = new ExNoticePostArrived(true);
        STATIC_PACKET_FALSE = new ExNoticePostArrived(false);
    }
}
