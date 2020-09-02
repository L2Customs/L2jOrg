// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.scripts.handlers.effecthandlers;

import org.l2j.gameserver.model.StatsSet;
import org.l2j.gameserver.engine.skill.api.SkillEffectFactory;
import org.l2j.gameserver.model.effects.EffectFlag;
import org.l2j.gameserver.model.effects.AbstractEffect;

public class BlockEscape extends AbstractEffect
{
    private BlockEscape() {
    }
    
    public long getEffectFlags() {
        return EffectFlag.CANNOT_ESCAPE.getMask();
    }
    
    public static class Factory implements SkillEffectFactory
    {
        private static final BlockEscape INSTANCE;
        
        public AbstractEffect create(final StatsSet data) {
            return Factory.INSTANCE;
        }
        
        public String effectName() {
            return "BlockEscape";
        }
        
        static {
            INSTANCE = new BlockEscape();
        }
    }
}
