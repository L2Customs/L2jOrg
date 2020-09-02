// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.scripts.handlers.effecthandlers;

import org.l2j.gameserver.engine.skill.api.SkillEffectFactory;
import org.l2j.gameserver.model.skills.BuffInfo;
import org.l2j.commons.util.Rnd;
import java.util.Objects;
import org.l2j.gameserver.model.item.instance.Item;
import org.l2j.gameserver.engine.skill.api.Skill;
import org.l2j.gameserver.model.actor.Creature;
import org.l2j.gameserver.model.effects.EffectType;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Arrays;
import org.l2j.gameserver.model.StatsSet;
import org.l2j.gameserver.model.skills.AbnormalType;
import java.util.Set;
import org.l2j.gameserver.model.effects.AbstractEffect;

public final class DispelBySlotProbability extends AbstractEffect
{
    private final Set<AbnormalType> dispelAbnormals;
    private final int power;
    
    private DispelBySlotProbability(final StatsSet params) {
        this.dispelAbnormals = Arrays.stream(params.getString("abnormals").split(" ")).map((Function<? super String, ?>)AbnormalType::valueOf).collect((Collector<? super Object, ?, Set<AbnormalType>>)Collectors.toSet());
        this.power = params.getInt("power", 100);
    }
    
    public EffectType getEffectType() {
        return EffectType.DISPEL;
    }
    
    public boolean isInstant() {
        return true;
    }
    
    public void instant(final Creature effector, final Creature effected, final Skill skill, final Item item) {
        if (Objects.isNull(effected)) {
            return;
        }
        effected.getEffectList().stopEffects(info -> !info.getSkill().isIrreplacableBuff() && Rnd.get(100) < this.power && this.dispelAbnormals.contains(info.getSkill().getAbnormalType()), true, true);
    }
    
    public static class Factory implements SkillEffectFactory
    {
        public AbstractEffect create(final StatsSet data) {
            return new DispelBySlotProbability(data);
        }
        
        public String effectName() {
            return "dispel-probability";
        }
    }
}
