// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.world.zone.type;

import org.l2j.gameserver.world.zone.ZoneType;
import org.l2j.gameserver.model.WorldObject;
import org.l2j.gameserver.util.GameUtils;
import org.l2j.gameserver.model.actor.Creature;
import org.l2j.gameserver.world.zone.Zone;

public class DerbyTrackZone extends Zone
{
    public DerbyTrackZone(final int id) {
        super(id);
    }
    
    @Override
    protected void onEnter(final Creature creature) {
        if (GameUtils.isPlayable(creature)) {
            creature.setInsideZone(ZoneType.MONSTER_TRACK, true);
        }
    }
    
    @Override
    protected void onExit(final Creature creature) {
        if (GameUtils.isPlayable(creature)) {
            creature.setInsideZone(ZoneType.MONSTER_TRACK, false);
        }
    }
}
