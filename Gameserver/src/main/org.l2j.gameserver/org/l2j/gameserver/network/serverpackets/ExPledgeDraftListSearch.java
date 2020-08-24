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
package org.l2j.gameserver.network.serverpackets;

import org.l2j.gameserver.model.clan.entry.PledgeWaitingInfo;
import org.l2j.gameserver.network.GameClient;
import org.l2j.gameserver.network.ServerExPacketId;

import java.util.List;

/**
 * @author Sdw
 */
public class ExPledgeDraftListSearch extends ServerPacket {
    final List<PledgeWaitingInfo> _pledgeRecruitList;

    public ExPledgeDraftListSearch(List<PledgeWaitingInfo> pledgeRecruitList) {
        _pledgeRecruitList = pledgeRecruitList;
    }

    @Override
    public void writeImpl(GameClient client) {
        writeId(ServerExPacketId.EX_PLEDGE_DRAFT_LIST_SEARCH);

        writeInt(_pledgeRecruitList.size());
        for (PledgeWaitingInfo prl : _pledgeRecruitList) {
            writeInt(prl.getPlayerId());
            writeString(prl.getPlayerName());
            writeInt(prl.getKarma());
            writeInt(prl.getPlayerClassId());
            writeInt(prl.getPlayerLvl());
        }
    }

}