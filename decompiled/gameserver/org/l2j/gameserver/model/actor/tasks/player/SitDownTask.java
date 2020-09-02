// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.model.actor.tasks.player;

import org.l2j.gameserver.model.actor.instance.Player;

public class SitDownTask implements Runnable
{
    private final Player _player;
    
    public SitDownTask(final Player player) {
        this._player = player;
    }
    
    @Override
    public void run() {
        if (this._player != null) {
            this._player.setBlockActions(false);
        }
    }
}
