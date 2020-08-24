/*
 * Copyright © 2019-2020 L2JOrg
 *
 * This file is part of the L2JOrg project.
 *
 * L2JOrg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * L2JOrg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package handlers.skillconditionhandlers;

import org.l2j.gameserver.engine.skill.api.Skill;
import org.l2j.gameserver.engine.skill.api.SkillCondition;
import org.l2j.gameserver.engine.skill.api.SkillConditionFactory;
import org.l2j.gameserver.model.WorldObject;
import org.l2j.gameserver.model.actor.Creature;
import org.l2j.gameserver.network.SystemMessageId;
import org.w3c.dom.Node;

/**
 * @author UnAfraid
 * @author JoeAlisson
 */
public class OpEnergyMaxSkillCondition implements SkillCondition {

	public final int charges;

	private OpEnergyMaxSkillCondition(int charges) {
		this.charges = charges;
	}

	@Override
	public boolean canUse(Creature caster, Skill skill, WorldObject target) {
		if (caster.getActingPlayer().getCharges() >= charges) {
			caster.sendPacket(SystemMessageId.YOUR_FORCE_HAS_REACHED_MAXIMUM_CAPACITY);
			return false;
		}
		return true;
	}

	public static final class Factory extends SkillConditionFactory {

		@Override
		public SkillCondition create(Node xmlNode) {
			return new OpEnergyMaxSkillCondition(parseInt(xmlNode.getAttributes(), "charges"));
		}

		@Override
		public String conditionName() {
			return "energy-max";
		}
	}
}