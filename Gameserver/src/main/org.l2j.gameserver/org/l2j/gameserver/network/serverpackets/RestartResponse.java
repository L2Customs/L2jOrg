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

import io.github.joealisson.mmocore.StaticPacket;
import org.l2j.gameserver.network.GameClient;
import org.l2j.gameserver.network.ServerPacketId;

@StaticPacket
public final class RestartResponse extends ServerPacket {
    public static final RestartResponse TRUE = new RestartResponse(true);
    public static final RestartResponse FALSE = new RestartResponse(false);

    private final boolean _result;

    private RestartResponse(boolean result) {
        _result = result;
    }

    @Override
    public void writeImpl(GameClient client) {
        writeId(ServerPacketId.RESTART_RESPONSE);
        writeInt(_result ? 1 : 0);
    }

}