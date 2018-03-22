/**
 * This file is part of Aion-Lightning <aion-lightning.org>.
 *
 *  Aion-Lightning is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Aion-Lightning is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details. *
 *  You should have received a copy of the GNU General Public License
 *  along with Aion-Lightning.
 *  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aionemu.gameserver.services.thedevils.ffa;

import com.aionemu.gameserver.configs.main.SempakConfig;
import com.aionemu.gameserver.model.gameobjects.player.Player;
import java.util.concurrent.ScheduledFuture;

/**
 * @author Kill3r
 */
public interface FFaStruct {

	int worldId = SempakConfig.EVENTSYSTEM_FFAMAP;

	ScheduledFuture<?> announceTask(int delayInMinutes);

	int getPlayerCount();

	boolean isEnemy(Player effector, Player effected);

}