/*
 * This file is part of packetevents - https://github.com/retrooper/packetevents
 * Copyright (C) 2022 retrooper and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.retrooper.packetevents.protocol.packettype.clientbound;

public enum ClientboundPacketType_1_13 {
    SPAWN_ENTITY,
    SPAWN_EXPERIENCE_ORB,
    SPAWN_WEATHER_ENTITY,
    SPAWN_LIVING_ENTITY,
    SPAWN_PAINTING,
    SPAWN_PLAYER,
    ENTITY_ANIMATION,
    STATISTICS,
    BLOCK_BREAK_ANIMATION,
    BLOCK_ENTITY_DATA,
    BLOCK_ACTION,
    BLOCK_CHANGE,
    BOSS_BAR,
    SERVER_DIFFICULTY,
    CHAT_MESSAGE,
    MULTI_BLOCK_CHANGE,
    TAB_COMPLETE,

    //This packet was added
    DECLARE_COMMANDS,

    WINDOW_CONFIRMATION,
    CLOSE_WINDOW,
    OPEN_WINDOW,
    WINDOW_ITEMS,
    WINDOW_PROPERTY,
    SET_SLOT,
    SET_COOLDOWN,
    PLUGIN_MESSAGE,
    NAMED_SOUND_EFFECT,
    DISCONNECT,
    ENTITY_STATUS,

    //This packet was added
    NBT_QUERY_RESPONSE,

    EXPLOSION,
    UNLOAD_CHUNK,
    CHANGE_GAME_STATE,
    KEEP_ALIVE,
    CHUNK_DATA,
    EFFECT,
    PARTICLE,
    JOIN_GAME,
    MAP_DATA,
    ENTITY_MOVEMENT,
    ENTITY_RELATIVE_MOVE,
    ENTITY_RELATIVE_MOVE_AND_ROTATION,
    ENTITY_ROTATION,
    VEHICLE_MOVE,
    OPEN_SIGN_EDITOR,
    CRAFT_RECIPE_RESPONSE,
    PLAYER_ABILITIES,
    COMBAT_EVENT,
    PLAYER_INFO,

    //This packet was added
    FACE_PLAYER,

    PLAYER_POSITION_AND_LOOK,
    USE_BED,
    UNLOCK_RECIPES,
    DESTROY_ENTITIES,
    REMOVE_ENTITY_EFFECT,
    RESOURCE_PACK_SEND,
    RESPAWN,
    ENTITY_HEAD_LOOK,
    SELECT_ADVANCEMENTS_TAB,
    WORLD_BORDER,
    CAMERA,
    HELD_ITEM_CHANGE,
    DISPLAY_SCOREBOARD,
    ENTITY_METADATA,
    ATTACH_ENTITY,
    ENTITY_VELOCITY,
    ENTITY_EQUIPMENT,
    SET_EXPERIENCE,
    UPDATE_HEALTH,
    SCOREBOARD_OBJECTIVE,
    SET_PASSENGERS,
    TEAMS,
    UPDATE_SCORE,
    SPAWN_POSITION,
    TIME_UPDATE,
    TITLE,

    //This packet was added
    STOP_SOUND,

    SOUND_EFFECT,
    PLAYER_LIST_HEADER_AND_FOOTER,
    COLLECT_ITEM,
    ENTITY_TELEPORT,
    UPDATE_ADVANCEMENTS,
    ENTITY_PROPERTIES,
    ENTITY_EFFECT,

    //These two packets were added
    DECLARE_RECIPES,
    TAGS
}
