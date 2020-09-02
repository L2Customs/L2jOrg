// 
// Decompiled by Procyon v0.5.36
// 

package org.l2j.gameserver.network;

public enum ServerExPacketId
{
    EX_DUMMY, 
    EX_REGEN_MAX, 
    EX_EVENT_MATCH_USER_INFO, 
    EX_COLOSSEUM_FENCE_INFO, 
    EX_EVENT_MATCH_SPELLED_INFO, 
    EX_EVENT_MATCH_FIRECRACKER, 
    EX_EVENT_TEAM_UNLOCKED, 
    EX_EVENT_MATCH_GMTEST, 
    EX_PARTY_ROOM_MEMBER, 
    EX_DISMISS_PARTY_ROOM, 
    EX_MANAGE_PARTY_ROOM_MEMBER, 
    EX_EVENT_MATCH_LOCK_RESULT, 
    EX_AUTO_SOULSHOT, 
    EX_EVENT_MATCH_LIST, 
    EX_EVENT_MATCH_OBSERVER, 
    EX_EVENT_MATCH_MESSAGE, 
    EX_EVENT_MATCH_SCORE, 
    EX_SERVER_PRIMITIVE, 
    EX_OPEN_MPCC, 
    EX_CLOSE_MPCC, 
    EX_SHOW_CASTLE_INFO, 
    EX_SHOW_FORTRESS_INFO, 
    EX_SHOW_AGIT_INFO, 
    EX_SHOW_FORTRESS_SIEGE_INFO, 
    EX_PARTY_PET_WINDOW_ADD, 
    EX_PARTY_PET_WINDOW_UPDATE, 
    EX_ASK_JOIN_MPCC, 
    EX_PLEDGE_EMBLEM, 
    EX_EVENT_MATCH_TEAM_INFO, 
    EX_EVENT_MATCH_CREATE, 
    EX_FISHING_START, 
    EX_FISHING_END, 
    EX_SHOW_QUEST_INFO, 
    EX_SHOW_QUEST_MARK, 
    EX_SEND_MANOR_LIST, 
    EX_SHOW_SEED_INFO, 
    EX_SHOW_CROP_INFO, 
    EX_SHOW_MANOR_DEFAULT_INFO, 
    EX_SHOW_SEED_SETTING, 
    EX_FISHING_START_COMBAT, 
    EX_FISHING_HP_REGEN, 
    EX_ENCHANT_SKILL_LIST, 
    EX_ENCHANT_SKILL_INFO, 
    EX_SHOW_CROP_SETTING, 
    EX_SHOW_SELL_CROP_LIST, 
    EX_OLYMPIAD_MATCH_END, 
    EX_MAIL_ARRIVED, 
    EX_STORAGE_MAX_COUNT, 
    EX_EVENT_MATCH_MANAGE, 
    EX_MULTI_PARTY_COMMAND_CHANNEL_INFO, 
    EX_PCCAFE_POINT_INFO, 
    EX_SET_COMPASS_ZONE_CODE, 
    EX_GET_BOSS_RECORD, 
    EX_ASK_JOIN_PARTY_ROOM, 
    EX_LIST_PARTY_MATCHING_WAITING_ROOM, 
    EX_SET_MPCC_ROUTING, 
    EX_SHOW_ADVENTURER_GUIDE_BOOK, 
    EX_SHOW_SCREEN_MESSAGE, 
    EX_PLEDGE_SKILL_LIST, 
    EX_PLEDGE_SKILL_ADD, 
    EX_PLEDGE_SKILL_DELETE, 
    EX_PLEDGE_POWER_GRADE_LIST, 
    EX_VIEW_PLEDGE_POWER, 
    EX_VIEW_PLEDGE_MEMBER_INFO, 
    EX_VIEW_PLEDGE_WARLIST, 
    EX_SUBPLEDGE_UPDATED, 
    EX_REDSKY, 
    EX_UPDATE_PLEDGE_POWER, 
    EX_FLY_SELF_DESTINATION, 
    EX_PCCAFE_COUPON_SHOW_UI, 
    EX_ORC_MOVE, 
    EX_CURSED_WEAPON_LIST, 
    EX_EXISTING_CURSED_WEAPON_LOCATION, 
    EX_RESTART_CLIENT, 
    EX_REQUEST_HACK_SHIELD, 
    EX_USE_SHARED_GROUP_ITEM, 
    EX_MPCC_SHOW_PARTY_MEMBERS_INFO, 
    EX_DUEL_ASK_START, 
    EX_DUEL_READY, 
    EX_DUEL_START, 
    EX_DUEL_END, 
    EX_DUEL_UPDATE_USER_INFO, 
    EX_SHOW_VARIATION_MAKE_WINDOW, 
    EX_SHOW_VARIATION_CANCEL_WINDOW, 
    EX_PUT_ITEM_RESULT_FOR_VARIATION_MAKE, 
    EX_PUT_INTENSIVE_RESULT_FOR_VARIATION_MAKE, 
    EX_PUT_COMMISSION_RESULT_FOR_VARIATION_MAKE, 
    EX_VARIATION_RESULT, 
    EX_PUT_ITEM_RESULT_FOR_VARIATION_CANCEL, 
    EX_VARIATION_CANCEL_RESULT, 
    EX_DUEL_ENEMY_RELATION, 
    EX_PLAY_ANIMATION, 
    EX_MPCC_PARTY_INFO_UPDATE, 
    EX_PLAY_SCENE, 
    EX_SPAWN_EMITTER, 
    EX_ENCHANT_SKILL_INFO_DETAIL, 
    EX_BASIC_ACTION_LIST, 
    EX_AIRSHIP_INFO, 
    EX_ATTRIBUTE_ENCHANT_RESULT, 
    EX_CHOOSE_INVENTORY_ATTRIBUTE_ITEM, 
    EX_GETON_AIRSHIP, 
    EX_GETOFF_AIRSHIP, 
    EX_MOVE_TO_LOCATION_AIRSHIP, 
    EX_STOP_MOVE_AIRSHIP, 
    EX_SHOW_TRACE, 
    EX_ITEM_AUCTION_INFO, 
    EX_NEED_TO_CHANGE_NAME, 
    EX_PARTY_PET_WINDOW_DELETE, 
    EX_TUTORIAL_LIST, 
    EX_RP_ITEM_LINK, 
    EX_MOVE_TO_LOCATION_IN_AIRSHIP, 
    EX_STOP_MOVE_IN_AIRSHIP, 
    EX_VALIDATE_LOCATION_IN_AIRSHIP, 
    EX_UI_SETTING, 
    EX_MOVE_TO_TARGET_IN_AIRSHIP, 
    EX_ATTACK_IN_AIRSHIP, 
    EX_MAGIC_SKILL_USE_IN_AIRSHIP, 
    EX_SHOW_BASE_ATTRIBUTE_CANCEL_WINDOW, 
    EX_BASE_ATTRIBUTE_CANCEL_RESULT, 
    EX_SUBPLEDGE_SKILL_ADD, 
    EX_RESPONSE_ANTI_FREE_SERVER, 
    EX_SHOW_PROCURE_CROP_DETAIL, 
    EX_HERO_LIST, 
    EX_OLYMPIAD_USER_INFO, 
    EX_OLYMPIAD_SPELLED_INFO, 
    EX_OLYMPIAD_MODE, 
    EX_SHOW_FORTRESS_MAP_INFO, 
    EX_PVPMATCH_RECORD, 
    EX_PVPMATCH_USER_DIE, 
    EX_PRIVATE_STORE_WHOLE_MSG, 
    EX_PUT_ENCHANT_TARGET_ITEM_RESULT, 
    EX_PUT_ENCHANT_SUPPORT_ITEM_RESULT, 
    EX_CHANGE_NICKNAME_COLOR, 
    EX_USER_BOOKMARK, 
    EX_NOTIFY_PREMIUM_ITEM, 
    EX_PREMIUM_ITEM_LIST, 
    EX_PERIODIC_ITEM_LIST, 
    EX_JUMP_TO_LOCATION, 
    EX_PVPMATCH_CC_RECORD, 
    EX_PVPMATCH_CC_MY_RECORD, 
    EX_PVPMATCH_CC_RETIRE, 
    EX_SHOW_TERRITORY, 
    EX_NPC_QUEST_HTML_MESSAGE, 
    EX_SEND_UI_EVENT, 
    EX_NOTIFY_BIRTHDAY, 
    EX_SHOW_DOMINION_REGISTRY, 
    EX_REPLY_REGISTER_DOMINION, 
    EX_REPLY_DOMINION_INFO, 
    EX_SHOW_OWNTHING_POS, 
    EX_CLEFT_LIST, 
    EX_CLEFT_STATE, 
    EX_DOMINION_CHANNEL_SET, 
    EX_BLOCK_UPSET_LIST, 
    EX_BLOCK_UPSET_STATE, 
    EX_START_SCENE_PLAYER, 
    EX_AIRSHIP_TELEPORT_LIST, 
    EX_MPCC_ROOM_INFO, 
    EX_LIST_MPCC_WAITING, 
    EX_DISMISS_MPCC_ROOM, 
    EX_MANAGE_MPCC_ROOM_MEMBER, 
    EX_MPCC_ROOM_MEMBER, 
    EX_VITALITY_POINT_INFO, 
    EX_SHOW_SEED_MAP_INFO, 
    EX_MPCC_PARTYMASTER_LIST, 
    EX_DOMINION_WAR_START, 
    EX_DOMINION_WAR_END, 
    EX_SHOW_LINES, 
    EX_PARTY_MEMBER_RENAMED, 
    EX_ENCHANT_SKILL_RESULT, 
    EX_REFUND_LIST, 
    EX_NOTICE_POST_ARRIVED, 
    EX_SHOW_RECEIVED_POST_LIST, 
    EX_REPLY_RECEIVED_POST, 
    EX_SHOW_SENT_POST_LIST, 
    EX_REPLY_SENT_POST, 
    EX_RESPONSE_SHOW_STEP_ONE, 
    EX_RESPONSE_SHOW_STEP_TWO, 
    EX_RESPONSE_SHOW_CONTENTS, 
    EX_RESPONSE_SHOW_STEP_THREE, 
    EX_REPLY_POST_ITEM_LIST, 
    EX_CHANGE_POST_STATE, 
    EX_REPLY_WRITE_POST, 
    EX_INITIALIZE_SEED, 
    EX_RAID_RESERVE_RESULT, 
    EX_BUY_SELL_LIST, 
    EX_CLOSE_RAID_SOCKET, 
    EX_PRIVATE_MARKET_LIST, 
    EX_RAID_CHARACTER_SELECTED, 
    EX_ASK_COUPLE_ACTION, 
    EX_BR_BROADCAST_EVENT_STATE, 
    EX_BR_LOAD_EVENT_TOP_RANKERS_ACK, 
    EX_CHANGE_NPC_STATE, 
    EX_ASK_MODIFY_PARTY_LOOTING, 
    EX_SET_PARTY_LOOTING, 
    EX_ROTATION, 
    EX_CLIENT_EFFECT_INFO, 
    EX_ANSWER_MY_MEMBERSHIP, 
    EX_REPLY_HAND_OVER, 
    EX_QUEST_NPC_LOG_LIST, 
    EX_QUEST_ITEMLIST, 
    EX_GM_VIEW_QUEST_ITEMLIST, 
    EX_RESTART_RESPONSE, 
    EX_VOTE_SYSTEM_INFO, 
    EX_SHUTTLE_INFO, 
    EX_GETON_SHUTTLE, 
    EX_GETOFF_SHUTTLE, 
    EX_SHUTTLE_MOVE, 
    EX_MOVE_TO_LOCATION_IN_SHUTTLE, 
    EX_STOP_MOVE_LOCATION_IN_SHUTTLE, 
    EX_VALIDATE_LOCATION_IN_SHUTTLE, 
    EX_AGIT_AUCTION_CMD, 
    EX_ADD_POST_FRIEND, 
    EX_SHOW_POST_FRIEND, 
    EX_GFX_OLYMPIAD, 
    EX_BR_NOTIFY_GAME_POINT, 
    EX_BR_PRODUCT_LIST_ACK, 
    EX_BR_PRODUCT_INFO_ACK, 
    EX_BR_BUY_PRODUCT_ACK, 
    EX_BR_NOTIFY_PREMIUM_STATE, 
    EX_BR_EXTRA_USER_INFO, 
    EX_BR_BUFF_EVENT_STATE, 
    EX_BR_RECENT_PRODUCT_ACK, 
    EX_BR_MINIGAME_LOAD_SCORES_ACK, 
    EX_BR_AGATHION_ENERGY_INFO, 
    EX_SHOW_CHANNELING_EFFECT, 
    EX_RESPONSE_CRYSTALITEM_INFO, 
    EX_CRYSTALITEM_FAIL, 
    EX_NAVIT_ADVENT_POINT_INFO, 
    EX_NAVIT_ADVENT_EFFECT, 
    EX_NAVIT_ADVENT_TIME_CHANGE, 
    EX_ABNORMAL_STATUS_UPDATE_FROM_TARGET, 
    EX_STOP_SCENE_PLAYER, 
    EX_FLY_MOVE, 
    EX_DYNAMIC_QUEST, 
    EX_SUBJOB_INFO, 
    EX_CHANGE_MP_COST, 
    EX_FRIEND_DETAIL_INFO, 
    EX_BLOCK_ADD_RESULT, 
    EX_BLOCK_REMOVE_RESULT, 
    EX_BLOCK_DETAIL_INFO, 
    EX_LOAD_INZONE_PARTY_HISTORY, 
    EX_FRIEND_NOTIFY_NAME_CHANGED, 
    EX_SHOW_COMMISSION, 
    EX_RESPONSE_COMMISSION_ITEM_LIST, 
    EX_RESPONSE_COMMISSION_INFO, 
    EX_RESPONSE_COMMISSION_REGISTER, 
    EX_RESPONSE_COMMISSION_DELETE, 
    EX_RESPONSE_COMMISSION_LIST, 
    EX_RESPONSE_COMMISSION_BUY_INFO, 
    EX_RESPONSE_COMMISSION_BUY_ITEM, 
    EX_ACQUIRABLE_SKILL_LIST_BY_CLASS, 
    EX_MAGIC_ATTACK_INFO, 
    EX_ACQUIRE_SKILL_INFO, 
    EX_NEW_SKILL_TO_LEARN_BY_LEVEL_UP, 
    EX_CALL_TO_CHANGE_CLASS, 
    EX_CHANGE_TO_AWAKENED_CLASS, 
    EX_TACTICAL_SIGN, 
    EX_NOT_USED_257, 
    EX_NOT_USED_258, 
    EX_NOT_USED_259, 
    EX_REPLY_WEB_SESSION_ID, 
    EX_2ND_PASSWORD_CHECK, 
    EX_2ND_PASSWORD_VERIFY, 
    EX_2ND_PASSWORD_ACK, 
    EX_FLY_MOVE_BROADCAST, 
    EX_SEND_USM_EVENT, 
    EX_SHOW_STAT_PAGE, 
    EX_CHECK_CHAR_NAME, 
    EX_GOODS_INVENTORY_CHANGED_NOTI, 
    EX_GOODS_INVENTORY_INFO, 
    EX_GOODS_INVENTORY_RESULT, 
    EX_ALTER_SKILL_REQUEST, 
    EX_NOTIFY_FLY_MOVE_START, 
    EX_SAY2_FAIL, 
    EX_CLOSE_COMMISSION, 
    EX_CHANGE_ATTRIBUTE_ITEM_LIST, 
    EX_CHANGE_ATTRIBUTE_INFO, 
    EX_CHANGE_ATTRIBUTE_OK, 
    EX_CHANGE_ATTRIBUTE_FAIL, 
    EX_LIGHTING_CANDLE, 
    EX_VITALITY_EFFECT_INFO, 
    EX_LOGIN_VITALITY_EFFECT_INFO, 
    EX_BR_BUY_PRODUCT_GIFT_ACK, 
    EX_MENTOR_LIST, 
    EX_MENTOR_ADD, 
    EX_MENTEE_WAITING_LIST, 
    EX_INZONE_WAITING_INFO, 
    EX_CURIOUS_HOUSE_STATE, 
    EX_CURIOUS_HOUSE_ENTER, 
    EX_CURIOUS_HOUSE_LEAVE, 
    EX_CURIOUS_HOUSE_MEMBER_LIST, 
    EX_CURIOUS_HOUSE_MEMBER_UPDATE, 
    EX_CURIOUS_HOUSE_REMAIN_TIME, 
    EX_CURIOUS_HOUSE_RESULT, 
    EX_CURIOUS_HOUSE_OBSERVE_LIST, 
    EX_CURIOUS_HOUSE_OBSERVE_MODE, 
    EX_SYS_STRING, 
    EX_CHOOSE_SHAPE_SHIFTING_ITEM, 
    EX_PUT_SHAPE_SHIFTING_TARGET_ITEM_RESULT, 
    EX_PUT_SHAPE_SHIFTING_EXTRACTION_ITEM_RESULT, 
    EX_SHAPE_SHIFTING_RESULT, 
    EX_CASTLE_STATE, 
    EX_NCGUARD, 
    EX_KALIE_EVENT, 
    EX_KALIE_JACKPOT_USER, 
    EX_ABNORMAL_VISUAL_EFFECT_INFO, 
    EX_NPC_INFO_SPEED, 
    EX_SET_PLEDGE_EMBLEM_ACK, 
    EX_SHOW_BEAUTY_MENU, 
    EX_RESPONSE_BEAUTY_LIST, 
    EX_RESPONSE_BEAUTY_REGIST_RESET, 
    EX_RESPONSE_RESET_LIST, 
    EX_SHUFFLE_SEED_AND_PUBLIC_KEY, 
    EX_CHECK_SPEEDHACK, 
    EX_BR_EXIST_NEW_PRODUCT_ACK, 
    EX_EVENT_CAMPAIGN_INFO, 
    EX_UNREAD_MAIL_COUNT, 
    EX_PLEDGE_COUNT, 
    EX_ADENA_INVEN_COUNT, 
    EX_PLEDGE_RECRUIT_INFO, 
    EX_PLEDGE_RECRUIT_APPLY_INFO, 
    EX_PLEDGE_RECRUIT_BOARD_SEARCH, 
    EX_PLEDGE_RECRUIT_BOARD_DETAIL, 
    EX_PLEDGE_WAITING_LIST_APPLIED, 
    EX_PLEDGE_WAITING_LIST, 
    EX_PLEDGE_WAITING_USER, 
    EX_PLEDGE_DRAFT_LIST_SEARCH, 
    EX_PLEDGE_WAITING_LIST_ALARM, 
    EX_VALIDATE_ACTIVE_CHARACTER, 
    EX_CLOSE_COMMISSION_REGISTER, 
    EX_TELEPORT_TO_LOCATION_ACTIVATE, 
    EX_NOTIFY_WEB_PETITION_REPLY_ALARM, 
    EX_EVENT_SHOW_XMAS_WISHCARD, 
    EX_INVITATION_EVENT_UI_SETTING, 
    EX_INVITATION_EVENT_INK_ENERGY, 
    EX_CHECK_ABUSING, 
    EX_GM_VIEW_VITALITY_EFFECT_INFO, 
    EX_PATH_TO_AWAKENING_ALARM, 
    EX_PUT_ENCHANT_SCROLL_ITEM_RESULT, 
    EX_REMOVE_ENCHANT_SUPPORT_ITEM_RESULT, 
    EX_SHOW_CARD_REWARD_LIST, 
    EX_GM_VIEW_CHARACTER_INFO, 
    EX_USER_INFO_EQUIPSLOT, 
    EX_USER_INFO_CUBIC, 
    EX_USER_INFO_ABNORMAL_VISUAL_EFFECT, 
    EX_USER_INFO_FISHING, 
    EX_PARTY_SPELLED_INFO_UPDATE, 
    EX_DIVIDE_ADENA_START, 
    EX_DIVIDE_ADENA_CANCEL, 
    EX_DIVIDE_ADENA_DONE, 
    EX_PET_INFO, 
    EX_ACQUIRE_AP_SKILL_LIST, 
    EX_START_LUCKY_GAME, 
    EX_BETTING_LUCKY_GAME_RESULT, 
    EX_TRAINING_ZONE_ADMISSION, 
    EX_TRAINING_ZONE_LEAVING, 
    EX_PERIODIC_HENNA, 
    EX_SHOW_AP_LIST_WND, 
    EX_USER_INFO_INVEN_WEIGHT, 
    EX_CLOSE_AP_LIST_WND, 
    EX_ENCHANT_ONE_OK, 
    EX_ENCHANT_ONE_FAIL, 
    EX_ENCHANT_ONE_REMOVE_OK, 
    EX_ENCHANT_ONE_REMOVE_FAIL, 
    EX_ENCHANT_TWO_OK, 
    EX_ENCHANT_TWO_FAIL, 
    EX_ENCHANT_TWO_REMOVE_OK, 
    EX_ENCHANT_TWO_REMOVE_FAIL, 
    EX_ENCHANT_SUCCESS, 
    EX_ENCHANT_FAIL, 
    EX_ENCHANT_RETRY_TO_PUT_ITEMS_OK, 
    EX_ENCHANT_RETRY_TO_PUT_ITEMS_FAIL, 
    EX_ACCOUNT_ATTENDANCE_INFO, 
    EX_WORLDCHAT_CNT, 
    EX_ALCHEMY_SKILL_LIST, 
    EX_TRY_MIX_CUBE, 
    EX_REQUEST_ALCHEMY_CONVERSION, 
    EX_BEAUTY_ITEM_LIST, 
    EX_CLIENT_INI, 
    EX_AUTOFISH_AVAILABLE, 
    EX_CC_ENTER_WORLD, 
    EX_CC_PLEDGE_INFO, 
    EX_VIP_ATTENDANCE_ITEM_LIST, 
    EX_CONFIRM_VIP_ATTENDANCE_CHECK, 
    EX_SHOW_ENSOUL_WINDOW, 
    EX_ENSOUL_RESULT, 
    EX_MULTISELL_RESULT, 
    EX_CASTLEWAR_SEASON_RESULT, 
    EX_CASTLEWAR_SEASON_REWARD, 
    EX_BR_VIP_PRODUCT_LIST_ACK, 
    EX_LUCKY_GAME_INFO, 
    EX_LUCKY_GAME_ITEMLIST, 
    EX_LUCKY_GAME_BONUS_INFO, 
    EX_VIP_INFO, 
    EX_VIP_REMAIN_TIME, 
    EX_CAPTCHA_IMAGE, 
    EX_CAPTCHA_ANSWER_RESULT, 
    EX_PLEDGE_SIGNIN, 
    EX_REQUEST_MATCH_ARENA, 
    EX_COMPLETE_MATCH_ARENA, 
    EX_CONFIRM_MATCH_ARENA, 
    EX_CANCEL_MATCH_ARENA, 
    EX_START_CHOOSE_CLASS_ARENA, 
    EX_CHANGE_CLASS_ARENA, 
    EX_CONFIRM_CLASS_ARENA, 
    EX_START_BATTLE_READY_ARENA, 
    EX_BATTLE_READY_ARENA, 
    EX_DECO_NPC_INFO, 
    EX_DECO_NPC_SET, 
    EX_FACTION_INFO, 
    EX_BATTLE_RESULT_ARENA, 
    EX_CLOSING_ARENA, 
    EX_CLOSED_ARENA, 
    EX_DIE_IN_ARENA_TMP, 
    EX_REVIVE_PENALTY_END, 
    EX_ARENA_DASHBOARD, 
    EX_ARENA_UPDATE_EQUIP_SLOT, 
    EX_ARENA_KILL_INFO, 
    EX_EXIT_ARENA, 
    EX_BALTHUS_EVENT, 
    EX_BALTHUS_JACKPOT_USER, 
    EX_PARTY_MATCHING_ROOM_HISTORY, 
    EX_CONTENT_UI_EVENT, 
    EX_ARENA_CUSTOM_NOTIFICATION, 
    EX_ONE_DAY_REWARD_LIST, 
    EX_ONE_DAY_REWARD_INFO, 
    EX_TODOLIST_RECOMMAND, 
    EX_TODOLIST_INZONE, 
    EX_TODOLIST_HTML, 
    EX_QUEUE_TICKET, 
    EX_PLEDGE_BONUS_UI_OPEN, 
    EX_PLEDGE_BONUS_LIST, 
    EX_PLEDGE_ACTIVITY_MARK_RESET, 
    EX_PLEDGE_BONUS_UPDATE, 
    EX_SSO_AUTHNTOKEN, 
    EX_QUEUE_TICKET_LOGIN, 
    EX_SHOW_ENSOUL_EXTRACTION_WINDOW, 
    EX_ENSOUL_EXTRACTION_RESULT, 
    EX_FIELD_EVENT_STEP, 
    EX_FIELD_EVENT_POINT, 
    EX_FIELD_EVENT_EFFECT, 
    EX_RAID_BOSS_SPAWN_INFO, 
    EX_RAID_SERVER_INFO, 
    EX_SHOW_AGIT_SIEGE_INFO, 
    EX_ITEM_AUCTION_STATUS, 
    EX_MONSTER_BOOK, 
    EX_MONSTER_BOOK_REWARD_ICON, 
    EX_MONSTER_BOOK_ON_FACTION_UI, 
    EX_MONSTER_BOOK_OPEN_RESULT, 
    EX_MONSTER_BOOK_CLOSE_FORCE, 
    EX_FACTION_LEVEL_UP_NOTIFY, 
    EX_ITEM_AUCTION_NEXT_INFO, 
    EX_ITEM_AUCTION_UPDATED_BIDDING_INFO, 
    EX_PRIVATE_STORE_BUYING_RESULT, 
    EX_PRIVATE_STORE_SELLING_RESULT, 
    EX_ENTER_WORLD, 
    EX_MATCH_GROUP, 
    EX_MATCH_GROUP_ASK, 
    EX_MATCH_GROUP_WITHDRAW, 
    EX_MATCH_GROUP_OUST, 
    EX_ARENA_SHOW_ENEMY_PARTY_LOCATION, 
    EX_SHOW_UPGRADE_SYSTEM, 
    EX_UPGRADE_SYSTEM_RESULT, 
    EX_CARD_UPDOWN_GAME_START, 
    EX_CARD_UPDOWN_PICK_RESULT, 
    EX_CARD_UPDOWN_GAME_PREPARE_REWARD, 
    EX_CARD_UPDOWN_GAME_REWARD_REPLY, 
    EX_CARD_UPDOWN_GAME_QUIT, 
    EX_ARENA_RANK_ALL, 
    EX_ARENA_MYRANK, 
    EX_PLEDGE_CLASSIC_RAID_INFO, 
    EX_ARENA_OBSERVE, 
    EX_HTML_WITH_NPC_VIEWPORT, 
    EX_PLEDGE_CONTRIBUTION_RANK, 
    EX_PLEDGE_CONTRIBUTION_INFO, 
    EX_PLEDGE_CONTRIBUTION_REWARD, 
    EX_PLEDGE_RAID_INFO, 
    EX_PLEDGE_RAID_RANK, 
    EX_PLEDGE_LEVEL_UP, 
    EX_PLEDGE_SHOW_INFO_UPDATE, 
    EX_PLEDGE_MISSION_INFO, 
    EX_PLEDGE_MISSION_REWARD_COUNT, 
    EX_PLEDGE_MASTERY_INFO, 
    EX_PLEDGE_MASTERY_SET, 
    EX_PLEDGE_MASTERY_RESET, 
    EX_TUTORIAL_SHOW_ID, 
    EX_PLEDGE_SKILL_INFO, 
    EX_PLEDGE_SKILL_ACTIVATE, 
    EX_PLEDGE_ITEM_LIST, 
    EX_PLEDGE_ITEM_ACTIVATE, 
    EX_PLEDGE_ANNOUNCE, 
    EX_PLEDGE_ANNOUNCE_SET, 
    EX_SET_PLEDGE_EMBLEM, 
    EX_SHOW_CREATE_PLEDGE, 
    EX_PLEDGE_ITEM_INFO, 
    EX_PLEDGE_ITEM_BUY, 
    EX_ELEMENTAL_SPIRIT_INFO, 
    EX_ELEMENTAL_SPIRIT_EXTRACT_INFO, 
    EX_ELEMENTAL_SPIRIT_EVOLUTION_INFO, 
    EX_ELEMENTAL_SPIRIT_EVOLUTION, 
    EX_ELEMENTAL_SPIRIT_SET_TALENT, 
    EX_ELEMENTAL_SPIRIT_ABSORB_INFO, 
    EX_ELEMENTAL_SPIRIT_ABSORB, 
    EX_CHOOSE_LOCKED_ITEM, 
    EX_LOCKED_RESULT, 
    EX_ELEMENTAL_SPIRIT_EXTRACT, 
    EX_OLYMPIAD_INFO, 
    EX_OLYMPIAD_RECORD, 
    EX_OLYMPIAD_MATCH_INFO, 
    EX_ELEMENTAL_SPIRIT_GET_EXP, 
    EX_ITEM_ANNOUNCE, 
    EX_COMPLETED_DAILY_QUEST_LIST, 
    EX_COMPLETED_DAILY_QUEST, 
    EX_USER_BAN_INFO, 
    EX_TRY_ENCHANT_ARTIFACT_RESULT, 
    EX_SHOW_UPGRADE_SYSTEM_NORMAL, 
    EX_UPGRADE_SYSTEM_NORMAL_RESULT, 
    EX_PURCHASE_LIMIT_SHOP_ITEM_LIST, 
    EX_PURCHASE_LIMIT_SHOP_ITEM_BUY, 
    EX_BLOODY_COIN_COUNT, 
    EX_CLASS_CHANGE_SET_ALARM, 
    EX_REQUEST_CLASS_CHANGE, 
    EX_REQUEST_CLASS_CHANGE_VERIFYING, 
    EX_COSTUME_USE_ITEM, 
    EX_CHOOSE_COSTUME_ITEM, 
    EX_SEND_COSTUME_LIST, 
    EX_SEND_COSTUME_LIST_FULL, 
    EX_COSTUME_COLLECTION_SKILL_ACTIVE, 
    EX_COSTUME_EVOLUTION, 
    EX_COSTUME_EXTRACT, 
    EX_COSTUME_LOCK, 
    EX_COSTUME_SHORTCUT_LIST, 
    EX_MAGICLAMP_EXP_INFO, 
    EX_MAGICLAMP_GAME_INFO, 
    EX_MAGICLAMP_GAME_RESULT, 
    EX_SHOW_TELEPORT_UI, 
    EX_ACTIVATE_AUTO_SHORTCUT, 
    EX_PREMIUM_MANAGER_SHOW_HTML, 
    EX_ACTIVATED_CURSED_TREASURE_BOX_LOCATION, 
    EX_PAYBACK_LIST, 
    EX_PAYBACK_GIVE_REWARD, 
    EX_PAYBACK_UI_LAUNCHER, 
    EX_DIE_INFO, 
    EX_AUTOPLAY_SETTING, 
    EX_AUTOPLAY_DO_MACRO, 
    EX_OLYMPIAD_MATCH_MAKING_RESULT, 
    EX_FESTIVAL_BM_INFO, 
    EX_FESTIVAL_BM_ALL_ITEM_INFO, 
    EX_FESTIVAL_BM_TOP_ITEM_INFO, 
    EX_FESTIVAL_BM_GAME, 
    EX_GACHA_SHOP_INFO, 
    EX_GACHA_SHOP_GACHA_GROUP, 
    EX_GACHA_SHOP_GACHA_ITEM, 
    EX_TIME_RESTRICT_FIELD_LIST, 
    EX_TIME_RESTRICT_FIELD_USER_ENTER, 
    EX_TIME_RESTRICT_FIELD_USER_CHARGE_RESULT, 
    EX_TIME_RESTRICT_FIELD_USER_ALARM, 
    EX_TIME_RESTRICT_FIELD_USER_EXIT, 
    EX_RANKING_CHAR_INFO, 
    EX_RANKING_CHAR_HISTORY, 
    EX_RANKING_CHAR_RANKERS, 
    EX_BOW_ACTION_TO, 
    EX_MERCENARY_CASTLEWAR_CASTLE_INFO, 
    EX_MERCENARY_CASTLEWAR_CASTLE_SIEGE_HUD_INFO, 
    EX_MERCENARY_CASTLEWAR_CASTLE_SIEGE_INFO, 
    EX_MERCENARY_CASTLEWAR_CASTLE_SIEGE_ATTACKER_LIST, 
    EX_MERCENARY_CASTLEWAR_CASTLE_SIEGE_DEFENDER_LIST, 
    EX_PLEDGE_MERCENARY_MEMBER_LIST, 
    EX_PVPBOOK_LIST, 
    EX_PVPBOOK_KILLER_LOCATION, 
    EX_PVPBOOK_NEW_PK, 
    EX_PLEDGE_MERCENARY_MEMBER_JOIN, 
    EX_RAID_DROP_ITEM_ANNOUNCE, 
    EX_LETTER_COLLECTOR_UI_LAUNCHER, 
    EX_OLYMPIAD_MY_RANKING_INFO, 
    EX_OLYMPIAD_RANKING_INFO, 
    EX_OLYMPIAD_HERO_AND_LEGEND_INFO, 
    EX_RAID_TELEPORT_INFO, 
    EX_CRAFT_INFO, 
    EX_CRAFT_EXTRACT, 
    EX_CRAFT_RANDOM_INFO, 
    EX_CRAFT_RANDOM_LOCK_SLOT, 
    EX_CRAFT_RANDOM_REFRESH, 
    EX_CRAFT_RANDOM_MAKE, 
    EX_ITEM_ANNOUNCE_SETTING, 
    EX_USER_BOOST_STAT, 
    EX_ANTIBOT, 
    EX_DPSVR, 
    EX_SEND_CMD_LIST, 
    EX_SHANGHAI_HEALTHY_TIPS, 
    EX_ADEN_FORTRESS_SIEGE_HUD_INFO, 
    EX_PURCHASE_LIMIT_SHOP_ITEM_LIST_NEW, 
    EX_SHARED_POSITION_TELEPORT_UI, 
    EX_CHAR_INFO, 
    EX_AUTH_RECONNECT, 
    EX_SHOW_BIRTH_INFO, 
    EX_HOMUNCULUS_CREATE_START_RESULT, 
    EX_HOMUNCULUS_INSERT_RESULT, 
    EX_HOMUNCULUS_SUMMON_RESULT, 
    EX_SHOW_HOMUNCULUS_LIST, 
    EX_DELETE_HOMUNCLUS_DATA_RESULT, 
    EX_ACTIVATE_HOMUNCULUS_RESULT, 
    EX_HOMUNCULUS_GET_ENCHANT_POINT_RESULT, 
    EX_HOMUNCULUS_INIT_POINT_RESULT, 
    EX_HOMUNCULUS_POINT_INFO, 
    EX_RESET_HOMUNCULUS_SKILL_RESULT, 
    EX_ENCHANT_HOMUNCULUS_SKILL_RESULT, 
    EX_HOMUNCULUS_ENCHANT_EXP_RESULT, 
    EX_HOMUNCULUS_HPSPVP, 
    EX_HOMUNCULUS_READY, 
    EX_TELEPORT_FAVORITES_LIST, 
    EX_VITAL_EX_INFO, 
    EX_NET_LATENCY, 
    EX_MABLE_GAME_SHOW_PLAYER_STATE, 
    EX_MABLE_GAME_DICE_RESULT, 
    EX_MABLE_GAME_MOVE, 
    EX_MABLE_GAME_PRISON, 
    EX_MABLE_GAME_REWARD_ITEM, 
    EX_MABLE_GAME_SKILL_INFO, 
    EX_MABLE_GAME_MINIGAME, 
    EX_MABLE_GAME_PLAY_UNABLE, 
    EX_MABLE_GAME_UI_LAUNCHER, 
    EX_MABLE_GAME_ROLL_COUNT_RESET, 
    EX_PET_SKILL_LIST, 
    EX_ITEM_DELETION_INFO, 
    EX_PK_PENALTY_LIST, 
    EX_PK_PENALTY_LIST_ONLY_LOC;
    
    public int getId() {
        return this.ordinal();
    }
}
