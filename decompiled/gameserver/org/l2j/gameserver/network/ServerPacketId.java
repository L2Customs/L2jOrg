// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.network;

public enum ServerPacketId
{
    DIE, 
    REVIVE, 
    ATTACK_OUT_OF_RANGE, 
    ATTACK_IN_COOLTIME, 
    ATTACK_DEAD_TARGET, 
    SPAWN_ITEM, 
    SELL_LIST, 
    BUY_LIST, 
    DELETE_OBJECT, 
    CHARACTER_SELECTION_INFO, 
    LOGIN_RESULT, 
    CHARACTER_SELECTED, 
    NPC_INFO, 
    NEW_CHARACTER_SUCCESS, 
    NEW_CHARACTER_FAIL, 
    CHARACTER_CREATE_SUCCESS, 
    CHARACTER_CREATE_FAIL, 
    ITEMLIST, 
    SUNRISE, 
    SUNSET, 
    TRADE_START, 
    TRADE_START_OK, 
    DROP_ITEM, 
    GET_ITEM, 
    STATUS_UPDATE, 
    NPC_HTML_MESSAGE, 
    TRADE_OWN_ADD, 
    TRADE_OTHER_ADD, 
    TRADE_DONE, 
    CHARACTER_DELETE_SUCCESS, 
    CHARACTER_DELETE_FAIL, 
    ACTION_FAIL, 
    SERVER_CLOSE, 
    INVENTORY_UPDATE, 
    TELEPORT_TO_LOCATION, 
    TARGET_SELECTED, 
    TARGET_UNSELECTED, 
    COMBAT_MODE_START, 
    COMBAT_MODE_FINISH, 
    SOCIAL_ACTION, 
    CHANGE_MOVE_TYPE, 
    CHANGE_WAIT_TYPE, 
    MANAGE_PLEDGE_POWER, 
    CREATE_PLEDGE, 
    ASK_JOIN_PLEDGE, 
    JOIN_PLEDGE, 
    VERSION_CHECK, 
    MOVE_TO_LOCATION, 
    NPC_SAY, 
    CHAR_INFO, 
    USER_INFO, 
    ATTACK, 
    WITHDRAWAL_PLEDGE, 
    OUST_PLEDGE_MEMBER, 
    SET_OUST_PLEDGE_MEMBER, 
    DISMISS_PLEDGE, 
    SET_DISMISS_PLEDGE, 
    ASK_JOIN_PARTY, 
    JOIN_PARTY, 
    WITHDRAWAL_PARTY, 
    OUST_PARTY_MEMBER, 
    SET_OUST_PARTY_MEMBER, 
    DISMISS_PARTY, 
    SET_DISMISS_PARTY, 
    MAGIC_SKILL_LIST, 
    WAREHOUSE_DEPOSIT_LIST, 
    WAREHOUSE_WITHDRAW_LIST, 
    WAREHOUSE_DONE, 
    SHORTCUT_REG, 
    INIT_SHORTCUT, 
    SHORTCUT_DELETE, 
    STOP_MOVE, 
    MAGIC_SKILL_USE, 
    MAGIC_SKILL_CANCELED, 
    SAY2, 
    NPC_INFO_ABNORMAL_VISUAL_EFFECT, 
    DOOR_INFO, 
    DOOR_STATUS_UPDATE, 
    PARTY_SMALL_WINDOW_ALL, 
    PARTY_SMALL_WINDOW_ADD, 
    PARTY_SMALL_WINDOW_DELETE_ALL, 
    PARTY_SMALL_WINDOW_DELETE, 
    PARTY_SMALL_WINDOW_UPDATE, 
    TRADE_PRESS_OWN_OK, 
    MAGIC_SKILL_LAUNCHED, 
    FRIEND_ADD_REQUEST_RESULT, 
    FRIEND_ADD, 
    FRIEND_REMOVE, 
    FRIEND_LIST, 
    FRIEND_STATUS, 
    PLEDGE_SHOW_MEMBER_LIST_ALL, 
    PLEDGE_SHOW_MEMBER_LIST_UPDATE, 
    PLEDGE_SHOW_MEMBER_LIST_ADD, 
    PLEDGE_SHOW_MEMBER_LIST_DELETE, 
    MAGIC_LIST, 
    SKILL_LIST, 
    VEHICLE_INFO, 
    FINISH_ROTATING, 
    SYSTEM_MSG, 
    START_PLEDGE_WAR, 
    REPLY_START_PLEDGE_WAR, 
    STOP_PLEDGE_WAR, 
    REPLY_STOP_PLEDGE_WAR, 
    SURRENDER_PLEDGE_WAR, 
    REPLY_SURRENDER_PLEDGE_WAR, 
    SET_PLEDGE_CREST, 
    PLEDGE_CREST, 
    SETUP_GAUGE, 
    VEHICLE_DEPARTURE, 
    VEHICLE_CHECK_LOCATION, 
    GETON_VEHICLE, 
    GETOFF_VEHICLE, 
    TRADE_REQUEST, 
    RESTART_RESPONSE, 
    MOVE_TO_PAWN, 
    SSQ_INFO, 
    GAMEGUARD_QUERY, 
    L2_FRIEND_LIST, 
    L2_FRIEND, 
    L2_FRIEND_STATUS, 
    L2_FRIEND_SAY, 
    VALIDATE_LOCATION, 
    START_ROTATING, 
    SHOW_BOARD, 
    CHOOSE_INVENTORY_ITEM, 
    TARGET_USER_FROM_MENU, 
    MOVE_TO_LOCATION_IN_VEHICLE, 
    STOP_MOVE_IN_VEHICLE, 
    VALIDATE_LOCATION_IN_VEHICLE, 
    TRADE_UPDATE, 
    TRADE_PRESS_OTHER_OK, 
    FRIEND_ADD_REQUEST, 
    LOGOUT_OK, 
    ABNORMAL_STATUS_UPDATE, 
    QUESTLIST, 
    ENCHANT_RESULT, 
    PLEDGE_SHOW_MEMBER_LIST_DELETE_ALL, 
    PLEDGE_INFO, 
    PLEDGE_EXTENDED_INFO, 
    SUMMON_INFO, 
    RIDE, 
    GIVE_NICKNAME, 
    PLEDGE_SHOW_INFO_UPDATE, 
    CLIENT_ACTION, 
    ACQUIRE_SKILL_LIST, 
    ACQUIRE_SKILL_INFO, 
    SERVER_OBJECT_INFO, 
    GM_HIDE, 
    ACQUIRE_SKILL_DONE, 
    GM_VIEW_CHARACTER_INFO, 
    GM_VIEW_PLEDGE_INFO, 
    GM_VIEW_SKILL_INFO, 
    GM_VIEW_MAGIC_INFO, 
    GM_VIEW_QUEST_INFO, 
    GM_VIEW_ITEMLIST, 
    GM_VIEW_WAREHOUSE_WITHDRAW_LIST, 
    LIST_PARTY_WAITING, 
    PARTY_ROOM_INFO, 
    PLAY_SOUND, 
    STATIC_OBJECT_INFO, 
    PRIVATE_STORE_MANAGE_LIST, 
    PRIVATE_STORE_LIST, 
    PRIVATE_STORE_MSG, 
    SHOW_MINIMAP, 
    REVIVE_REQ, 
    ABNORMAL_VISUAL_EFFECT, 
    TUTORIAL_SHOW_HTML, 
    SHOW_TUTORIAL_MARK, 
    TUTORIAL_ENABLE_CLIENT_EVENT, 
    TUTORIAL_CLOSE_HTML, 
    SHOW_RADAR, 
    WITHDRAW_ALLIANCE, 
    OUST_ALLIANCE_MEMBER_PLEDGE, 
    DISMISS_ALLIANCE, 
    SET_ALLIANCE_CREST, 
    ALLIANCE_CREST, 
    SERVER_CLOSE_SOCKET, 
    PET_STATUS_SHOW, 
    PET_INFO, 
    PET_ITEMLIST, 
    PET_INVENTORY_UPDATE, 
    ALLIANCE_INFO, 
    PET_STATUS_UPDATE, 
    PET_DELETE, 
    DELETE_RADAR, 
    MY_TARGET_SELECTED, 
    PARTY_MEMBER_POSITION, 
    ASK_JOIN_ALLIANCE, 
    JOIN_ALLIANCE, 
    PRIVATE_STORE_BUY_MANAGE_LIST, 
    PRIVATE_STORE_BUY_LIST, 
    PRIVATE_STORE_BUY_MSG, 
    VEHICLE_START_PACKET, 
    NPC_INFO_STATE, 
    START_ALLIANCE_WAR, 
    REPLY_START_ALLIANCE_WAR, 
    STOP_ALLIANCE_WAR, 
    REPLY_STOP_ALLIANCE_WAR, 
    SURRENDER_ALLIANCE_WAR, 
    SKILL_COOL_TIME, 
    PACKAGE_TO_LIST, 
    CASTLE_SIEGE_INFO, 
    CASTLE_SIEGE_ATTACKER_LIST, 
    CASTLE_SIEGE_DEFENDER_LIST, 
    NICKNAME_CHANGED, 
    PLEDGE_STATUS_CHANGED, 
    RELATION_CHANGED, 
    EVENT_TRIGGER, 
    MULTI_SELL_LIST, 
    SET_SUMMON_REMAIN_TIME, 
    PACKAGE_SENDABLE_LIST, 
    EARTHQUAKE, 
    FLY_TO_LOCATION, 
    BLOCK_PACKET_LIST, 
    SPECIAL_CAMERA, 
    NORMAL_CAMERA, 
    SKILL_REMAIN_SEC, 
    NET_PING, 
    DICE, 
    SNOOP, 
    RECIPE_BOOK_ITEM_LIST, 
    RECIPE_ITEM_MAKE_INFO, 
    RECIPE_SHOP_MANAGE_LIST, 
    RECIPE_SHOP_SELL_LIST, 
    RECIPE_SHOP_ITEM_INFO, 
    RECIPE_STORE_MSG, 
    SHOW_CALC, 
    MONRACE_INFO, 
    HENNA_ITEM_INFO, 
    HENNA_INFO, 
    HENNA_UNEQUIP_LIST, 
    HENNA_UNEQUIP_INFO, 
    MACRO_LIST, 
    BUY_LIST_SEED, 
    SHOW_TOWNMAP, 
    OBSERVER_START, 
    OBSERVER_END, 
    CHAIR_SIT, 
    HENNA_EQUIP_LIST, 
    SELL_LIST_PROCURE, 
    GM_HENNA_INFO, 
    RADAR_CONTROL, 
    CLIENT_SETTIME, 
    CONFIRM_DLG, 
    PARTY_SPELLED_INFO, 
    BUY_PREVIEW_LIST, 
    BUY_PREVIEW_INFO, 
    CAMERA_MODE, 
    SHOW_XMASSEAL, 
    ETC_STATUS_UPDATE, 
    SHORT_BUFF_STATUS_UPDATE, 
    SSQ_STATUS, 
    PETITION_VOTE, 
    AGIT_DECO_INFO;
    
    public int getId() {
        return this.ordinal();
    }
}
