// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.scripts.handlers.targethandlers.affectobject;

import org.l2j.gameserver.model.skills.targets.AffectObject;
import org.l2j.gameserver.model.actor.Creature;
import org.l2j.gameserver.handler.IAffectObjectHandler;

public class All implements IAffectObjectHandler
{
    public boolean checkAffectedObject(final Creature activeChar, final Creature target) {
        return true;
    }
    
    public Enum<AffectObject> getAffectObjectType() {
        return (Enum<AffectObject>)AffectObject.ALL;
    }
}
