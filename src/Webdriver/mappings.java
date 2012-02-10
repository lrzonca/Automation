package Webdriver;
class CssSelector {
    private String selector;
    public String toString() {
        return selector;
    }
    CssSelector(String s) {
        selector = s;
    }
}

class SelectorFactory {
    public static CssSelector createCssSelector(String s) {
        return new CssSelector(s);
    }
}
public interface mappings {

	public interface signUp {
		public static final CssSelector JOIN_NOW_LINK = SelectorFactory.createCssSelector(".tc-register-url");
		public static final String REGISTER_EMAIL = "sgRegMail";
		public static final String REGISTER_EMAIL_VALID = "email_validationCorrectImage";
		public static final String REGISTER_EMAIL_NOT_VALID= "email_validationErrorImage";
		public static final String REGISTER_USERNAME = "sgRegUsername";
		public static final String REGISTER_USERNAME_VALID = "username_validationCorrectImage";
		public static final String REGISTER_USERNAME_NOT_VALID = "username_validationErrorImage";
		public static final String REGISTER_PASSWORD = "sgRegPassword";
		public static final String REGISTER_PASSWORD_VALID = "password_validationCorrectImage";
		public static final String REGISTER_PASSWORD_NOT_VALID = "password_validationErrorImage";
		public static final String REGISTER_AGE = "sgRegAge";
		public static final String HOW_OLD_ARE_YOU = ".sg-reg-form-caption";
		public static final String REGISTER_AGE_VALID = "age_validationCorrectImage";
		public static final String REGISTER_AGE_NOT_VALID = "age_validationErrorImage";
		public static final String REGISTER_SIGNMEUP = ".sg-reg-save-btn";
		public static final String REGISTER_WELCOME_TEXT = ".reg-confirm-user";
		public static final String REGISTER_WELCOME_CLOSE_BTN = ".socialClose";
		  }
		  
		  public interface signIn {
		public static final CssSelector SIGN_IN_LINK = SelectorFactory.createCssSelector(".tc-login-url");
		public static final CssSelector USERNAME = SelectorFactory.createCssSelector(".tc-username-text");
		public static final CssSelector PASSWORD = SelectorFactory.createCssSelector(".tc-password-text");
		public static final CssSelector SIGN_IN_BUTTON = SelectorFactory.createCssSelector(".login_button a");
		public static final CssSelector LOGGED_USERNAME = SelectorFactory.createCssSelector(".tc-username-cnt");
		public static final String WHOLE_POPUP = "fb_loginbox_main";
		public static final String ERROR_MESSAGE = ".tc-error-message-notauth";
		public static final CssSelector REMEMBER_CHECKBOX = SelectorFactory.createCssSelector(".tc-remember-check");
		public static final String LOGOUT_LINK = ".tc-logout-url";
		  }
		  
		  public interface leftNavi {
		public static final String ADVENTURE_GAMES = ".tc_ln_category_458";
		public static final String FIRST_AVAILABLE_GAME_CATEGORY_LEFT_NAVI_LINK = ".leftNavigation ul:nth-child(3) li:nth-child(6) a";
		public static final String SECOND_AVAILABLE_GAME_CATEGORY_LEFT_NAVI_LINK = ".leftNavigation ul:nth-child(3) li:nth-child(8) a";
		public static final String HIGHSCORE_LEFT_NAVI_LINK = ".leftNavigation ul:nth-child(3) li:nth-child(3) a"; // should be added a unique class
		public static final String GAMES_FOR_GIRLS_NAVI_LINK = ".leftNavigation ul:nth-child(1) li:nth-child(2) a"; // should be added a unique class
		public static final String POPULAR_GAMES_NAVI_LINK = ".leftNavigation ul:nth-child(1) li:nth-child(3) a"; // should be added a unique class
		public static final String AWARD_GAMES_LEFT_NAVI_LINK = ".leftNavigation ul:nth-child(3) li:nth-child(1) a"; // should be added a unique class
		  }
		  
		  public interface categoryPage {
		public static final String SUBCATEGORY_GAME_LIST = "subcatList";
		public static final String FIRST_AVAILABLE_SUBCATEGORY_LINK = ".gameStack:nth-child(1) a";
		public static final String TOP_HOME_PAGE_LINK = ".categoryBreadcrumb a:nth-child(1)";
		public static final String TOP_CATEGORY_LINK = ".categoryBreadcrumb a:nth-child(2)";
		public static final String TOP_ACTIVE_PAGE = ".categoryBreadcrumb span";
		public static final String FIRST_AVAILABLE_GAME_LINK = ".one-game-category a";

		public static final String CATEGORY_TAG_BOX = "tagsBoxContainer";
		public static final String CATEGORY_TAG_GIRLS_IMG = "tagsGirls";
		public static final String CATEGORY_TAG_TITLE = ".tagsBox div:nth-child(2) h3";
		public static final String FIRST_AVAILABLE_TAG_LINK = ".tagsContent ul li:nth-child(1) a";
		  }
		  
		  public interface subcategoryPage {
		public static final String FIRST_AVAILABLE_GAME_LINK = ".gameList li:nth-child(1) div:nth-child(2) a";
		public static final String SUBCATEGORY_SORT_GAMES_BY_TEXT = ".sortingBarSearch ul li:first-child";
		public static final String SUBCATEGORY_SORT_GAMES_BY_COOLEST_LINK = "sort_by_2";
		public static final String SUBCATEGORY_SORT_GAMES_BY_MOST_POPULAR_LINK = "sort_by_1";
		public static final String SUBCATEGORY_SORT_GAMES_BY_NEWEST_LINK = "sort_by_3";
		public static final String SUBCATEGORY_GRID_LINK = "gridButton";
		public static final String SUBCATEGORY_DETAIL_LINK = "detailButton";
		public static final String SUBCATEGORY_PAGING_TOP_BOX = "pagination_top";
		public static final String SUBCATEGORY_PAGING_BOTTOM_BOX = ".subcategory_pagination_bottom";
		public static final String SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON = ".pagination span.paginationButtonPrev a";
		public static final String SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON = ".pagination span.paginationButtonNext a";
		public static final String SUBCATEGORY_GAMES_FIRST_GAME_NAME_TEXT = ".gameList li:nth-child(1) div.gameThumb a span span.gameTitle";
		public static final String SUBCATEGORY_PAGING_BOTTOM_PREVIOUS_ACTIVE_BUTTON = ".subcategory_pagination_bottom div.pagination span.paginationButtonPrev a";
		public static final String SUBCATEGORY_GAMES_FIRST_GAME_NAME_DETAIL_VIEW_TEXT = ".gameList li:nth-child(1) div.gameTextsList div.gametitle a";
		  }
		  
		  public interface social {
		public static final String SOCIAL_GAME_BOX = "socialgame";
		public static final String SOCIAL_GAME_GS_BOX = "easyXDM_default2487_provider";
		public static final String SOCIAL_GAME = "container";
		public static final String SOCIAL_GAME_HEADER_TEXT = "promobar";
		public static final String SOCIAL_GAME_PLAY_BUTTON = "button1";
		public static final String SOCIAL_GAME_INVITE_BUTTON = "button2";
		public static final String SOCIAL_GAME_GET_SAPPHIRES_BUTTON = "button5";
		public static final String SOCIAL_GAME_HELP_BUTTON = "button6";
		public static final String SOCIAL_GAME_USER_ID_TEXT = "useridtext";
		public static final String SIGN_UP_BOX = "socialgameRegister";
		public static final String HEADER_CLOSE_BUTTON = "div.sg-register a.socialClose p.socialCloseButton";
		public static final String HEADER_CLOSE_BUTTON2 = ".socialCloseButton";
		public static final String HEADER_GS_CLOSE_BUTTON = ".cancel";
		public static final String HARVESTING_POPUP = "sg_harvesting_popup";
		public static final String HEADER_TITLE_TEXT = ".socialTop h1 div.text";
		public static final String ON_SITE_TAB = "onsite";
		public static final String ON_SITE_FIRST_FRIEND_AVATAR_BOX = "li:nth-child(1) .avatar a";
		public static final String ON_SITE_FIRST_FRIEND_AVATAR_IMG = "li:nth-child(1) .avatar a img";
		public static final String ON_SITE_FIRST_FRIEND_BOX = "myfr_0";
		public static final String ON_SITE_FIRST_FRIEND_CHECKBOX = "li:nth-child(1) .check-invite input";
		public static final String ON_SITE_FIRST_FRIEND_INFO_NAME_TEXT = "li:nth-child(1) .givenname";
		public static final String ON_SITE_FIRST_FRIEND_INFO_USERNAME_LINK = "li:nth-child(1) .usernameHolder a";
		public static final String ON_SITE_HEADER_TEXT = ".onsite-top";
		public static final String ON_SITE_INVITE_BUTTON = ".popup_blue_button";
		public static final String ON_SITE_SEARCH_YOUR_FRIEND_BUTTON = ".search-icon";
		public static final String ON_SITE_SEARCH_YOUR_FRIEND_TEXTFIELD = "friends_search_social";
		public static final String ON_SITE_SELECT_ALL_CHECKBOX = "onsite_selectall";
		public static final String ON_SITE_SELECT_ALL_LINK = "onsite_selectall_a";
		public static final String FROM_EMAIL_TAB = "fromemail";
		public static final String FROM_EMAIL_BOTTOM_DESCRIPTION_TEXT = ".harvestFirstStepProvacy";
		public static final String FROM_EMAIL_GMAIL_BUTTON = ".gmail div";
		public static final String FROM_EMAIL_SELECT_PROVIDER_TEXT = ".harvestFirstAccounts p";
		public static final String FROM_EMAIL_TOP_DESCRIPTION_TEXT = ".harvestFirstDescription p";
		public static final String FROM_EMAIL_TOP_TITLE_TEXT = ".harvestFirstDescription h3";
		public static final String FROM_EMAIL_WINDOWS_LIVE_BUTTON = ".live div";
		public static final String FROM_EMAIL_YAHOO_BUTTON = ".yahoo div";
		public static final String ON_SITE_TOTAL_FRIENDS_NUMBER_TEXT = ".my_friends_total_extern";
		public static final String ON_SITE_SELECTED_FRIENDS_TEXT = ".selected";
		public static final String harvesting_onsite_container = "harvesting_onsite_container";
		public static final String SIGN_UP_CLOSE_BUTTON = ".socialCloseButton";
		public static final String SIGN_UP_CLOSE_LINK = "a.socialClose";
		public static final String SIGN_UP_WHITE_BOX = ".whitebox-main";
		public static final String SIGN_UP_PINK_BOX = ".pinkbox-main";
		public static final String SIGN_UP_WB_IMG = ".sg-image";
		public static final String HARVESTING_NO_CONTRACT_MESSAGE = ".harvestFinalHolder div.noContactsMessage";
		public static final String HARVESTING_SUCCESSFULLY_INVITED_TEXT = ".successMessage";
		public static final String HARVESTING_NO_PLAYING_CONTRACTS_TEXT = ".harvestEmail";
		public static final String HARVESTING_CONTRACTS_BOX_TEXT = ".harvestNewList table tbody tr";

		public static final String SIGN_UP_WB_LIST_TEXT = ".sg-bullets";
		public static final String SIGN_UP_PB_TITLE_TEXT = ".pinkbox-top h1:nth-child(1)";
		public static final String SIGN_UP_PB_CREATED_PARRENTS_TITLE_TEXT = ".pinkbox-top h1:nth-child(3)";
		public static final String SIGN_UP_PB_EMAIL_TITLE_TEXT = ".sg-registration-step1 div:nth-child(1) div.sg-reg-form-caption";
		public static final String SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT = ".sg-registration-step1 div:nth-child(1) div.sg-reg-form-help a";
		public static final String SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TOOLTIP_TEXT = ".sg-registration-step1 div:nth-child(1) div.sg-reg-form-help span";
		public static final String SIGN_UP_PB_EMAIL_TEXTFIELD = "sgRegMail";
		public static final String SIGN_UP_PB_EMAIL_CORRECT_ICON = "email_validationCorrectImage";
		public static final String SIGN_UP_PB_EMAIL_ERROR_ICON = "email_validationErrorImage";
		public static final String SIGN_UP_PB_EMAIL_ERROR_EMAIL_TAKEN_TEXT = "error_email_already_taken";
		public static final String SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT = "error_incorrect_email";
		public static final String SIGN_UP_PB_USERNAME_TITLE_TEXT = ".sg-registration-step1 div:nth-child(2) div.sg-reg-form-caption";
		public static final String SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT = ".sg-registration-step1 div:nth-child(2) div.sg-reg-form-help a";
		public static final String SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TOOLTIP_TEXT = ".sg-registration-step1 div:nth-child(2) div.sg-reg-form-help span";
		public static final String SIGN_UP_PB_USERNAME_TEXTFIELD = "sgRegUsername";
		public static final String SIGN_UP_PB_USERNAME_CORRECT_ICON = "username_validationCorrectImage";
		public static final String SIGN_UP_PB_USERNAME_ERROR_ICON = "username_validationErrorImage";
		public static final String SIGN_UP_PB_USERNAME_ERROR_USERNAME_TAKEN_TEXT = "error_username_taken";
		public static final String SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT = "error_username_too_short";
		public static final String SIGN_UP_PB_USERNAME_ERROR_USERNAME_INCORECT_TEXT = "error_incorrect_username";
		public static final String SIGN_UP_PB_USERNAME_ERROR_USERNAME_PROFANITY_TEXT = "error_profanity_username";
		public static final String SIGN_UP_PB_PASSWORD_TITLE_TEXT = ".sg-registration-step1 div:nth-child(3) div.sg-reg-form-caption";
		public static final String SIGN_UP_PB_PASSWORD_TEXTFIELD = "sgRegPassword";
		public static final String SIGN_UP_PB_PASSWORD_CORRECT_ICON = "password_validationCorrectImage";
		public static final String SIGN_UP_PB_PASSWORD_ERROR_ICON = "password_validationErrorImage";
		public static final String SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT = "error_password_too_short";
		public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT = ".sg-registration-step1 div.sg-reg-howold-line span";
		public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD = "sgRegAge";
		public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_CORRECT_ICON = "age_validationCorrectImage";
		public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON = "age_validationErrorImage";
		public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT = "error_age_not_numeric";
		public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_TOO_YOUNG_TEXT = "error_too_young";
		public static final String SIGN_UP_PB_LINE = ".sg-registration-step1 .hsep";
		public static final String SIGN_UP_PB_PARENTS_EMAIL_TITLE_TEXT = ".sg-registration-step1 div:nth-child(6) div.sg-reg-form-caption";
		public static final String SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TEXT = ".sg-registration-step1 div:nth-child(6) div.sg-reg-form-help a";
		public static final String SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TOOLTIP_TEXT = ".sg-registration-step1 div:nth-child(6) div.sg-reg-form-help span";
		public static final String SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD = "sgRegParentsMail";
		public static final String SIGN_UP_PB_PARENTS_EMAIL_CORRECT_ICON = "parents_validationCorrectImage";
		public static final String SIGN_UP_PB_PARENTS_EMAIL_ERROR_ICON = "parents_validationErrorImage";
		public static final String SIGN_UP_PB_PARENTS_EMAIL_ERROR_PARENTS_EMAIL_WRONG_TEXT = "parent_error_incorrect_email";
		public static final String SIGN_UP_PB_TERMS_OF_USE_TEXT = ".sg-reg-terms";
		public static final String SIGN_UP_PB_NEWSLETTER = "sgRegNewsletterAuto";
		public static final String SIGN_UP_PB_SIGN_ME_UP_BUTTON = ".sg-reg-save-btn";
		public static final String SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT = ".sg-reg-bottom-text";
		public static final String SIGN_UP_PB_SIGN_IN_BOTTOM_LINK = ".sg-reg-bottom-text a";

		public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_ICON = ".tick-icon";
		public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_TITLE_TEXT = ".sg-registration-step2-normal h2.txt-normal";
		public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_TITLE_TEXT = ".sg-registration-step2-normal h2.txt-child";
		public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_TEXT = ".sg-registration-step2-normal div.txt-normal";
		public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_TEXT = ".sg-registration-step2-normal div.txt-child";
		public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CONTINUE_PLAYING_BUTTON = "sgRegContinueBtn";
		// public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_CONTINUE_PLAYING_BUTTON = "css=sgRegChildContinueBtn";
		public static final String SIGN_UP_WB_SIGN_IN_SUCCESS_CHILD_HEADER_TEXT = ".parents-girl-text";
		public static final String SIGN_UP_WB_SIGN_IN_SUCCESS_CHILD_GIRL_ICON = ".parents-girl";
		public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_GIRL_ICON = ".girl";
		public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_ERROR_ICON = "terms_validationErrorImage";
		public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_ERROR_TEXT = ".finish-child-info";
		public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_FINISH_TEXT = ".finish-text";
		public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_CONTINUE_PLAYING_BUTTON = ".sg-reg-parent-continue-btn span.label";

		  }
		  
		  public interface popularGames {
		public static final String POPULAR_GAMES_TITLE_CATEGORY_PAGE = ".categorySubcategoryTitleHolder h3";
		  }
		  
		  public interface gamepage {
		public static final String GAME_CONTAINTER_SHOCKWAVE = "flashobj_mc";
		public static final String GAME_CONTAINTER_IFRAME = "gameiframe_js";
		public static final String ALL_COMMENTS_BOX = "commentsHolder";
		
			public static final String ZOOM_SCALABLE_BAR = "zoom";
			public static final CssSelector ZOOM_OUT_LINK = SelectorFactory.createCssSelector(".zoom-out");
			public static final String ZOOM_SLIDER = "zoomSlider";
			public static final CssSelector ZOOM_IN_LINK = SelectorFactory.createCssSelector(".zoom-in");
			public static final CssSelector ZOOM_RESET_LINK = SelectorFactory.createCssSelector(".zoom-reset");
		  }
		  
		  public interface topBar {
		public static final String USERNAME_LINK = ".tc-username-cnt";
		public static final String MY_PROFILE_LINK = ".tc-un_myprofile";
		public static final String AVATAR_ICO = "avatarnormal";
		public static final String EDIT_SETTINGS_LINK = ".userinfo-box table tbody tr:nth-child(3) td a";
		public static final String SEND_FRIEND_REQUEST_BUTTON = ".friends_profilePanel_actionlink";
		public static final String FRIEND_REQUEST_ACCEPTED_TEXT = ".dbtnRequestAccepted";
		  }

		public interface OVERVIEW_TAB{
		public static final String TAB_OVERVIEW = "css=#tab_overview a";
		public static final String LATEST_ACTIVITES_TEXT = "css=.fill-username";
		public static final String WHAT_ARE_YOU_UP_TO_TEXT = "css=#messageWall-form div h4";
		public static final String POST_TEXT = "css=.frameBody";
		public static final String FIRST_EMO_ICON = "css=#emoHolder ul li:nth-child(1) a img";
		public static final String POST_BUTTON = "css=.dbtnSimple a";
		public static final String LATEST_FRIENDS_BOX = "css=#latestFriends";
		public static final String LAST_FRIEND_NAME_LINK = "css=.friends_latest_list ul li:nth-child(1) a span.lf-username";
		public static final String LAST_FRIEND_AVATAR_LINK = "css=.friends_latest_list ul li:nth-child(1) a span.lf-avatar";
		public static final String MESSAGES_BOX = "css=.messages";
		public static final String LAST_MESSAGE_BOX = "css=.messages ul li:nth-child(1) div.activity-container";
		public static final String LAST_MESSAGE_AVATAR_LINK = "css=.messages ul li:nth-child(1) div.activity-container div.activity-avatar";
		public static final String LAST_MESSAGE_HEADER_TEXT = "css=.messages ul li:nth-child(1) div.activity-container div.activity-content div.persons";
		public static final String LAST_MESSAGE_CONTAINER = "css=.messages ul li:nth-child(1) div.activity-container";
		public static final String LAST_MESSAGE_HEADER_TEXT_AVATAR_CHANGES = "css=.messages ul li:nth-child(1) div.activity-container div.activity-content div.activity-summary";
		public static final String LAST_MESSAGE_COMMENT_TEXT = "css=.messages ul li:nth-child(1) div.activity-container div.activity-content div div.comment";
		public static final String LAST_MESSAGE_COMMENT_GAME_ICON_LINK = "css=.messages ul li:nth-child(1) div.activity-container div.activity-gameinfo div a span.activity-gamecomment-icon";
		public static final String LAST_MESSAGE_COMMENT_GAME_NAME_LINK = "css=.messages ul li:nth-child(1) div.activity-container div.activity-gameinfo div a span.activity-gamecomment-title";
		public static final String LAST_MESSAGE_TIMEINFO_TEXT = "css=.messages ul li:nth-child(1) div.activity-container div.activity-tools span.activity-timeinfo";
		public static final String LAST_MESSAGE_DELETE_COMMENT_LINK = "css=.messages ul li:nth-child(1) div.activity-container div.activity-content div div.comment";
		// public static final String LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON = "css=.menu a:nth-child(1) span";
		// public static final String LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON = "css=.menu a:nth-child(2) span";
		// public static final String LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON = "css=.menu a:nth-child(3) span";
		public static final String LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON = "css=.tc_all_activities";
		public static final String LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON = "css=.tc_my_activities";
		public static final String LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON = "css=.tc_wall_messages";
		public static final String NEW_EMAIL_TEXT = "css=#f_email";
		public static final String SAVE_EMAIL_BUTTON = "css=#saveEmail div a";
		public static final String CONFIRM_PASSWORD_TEXT = "css=#changeemailconfirm table tbody tr td input#confirmPass";
		public static final String SAVE_CONFIRM_PASSWORD_BUTTON = "css=#changeemailconfirm div#saveEmailConfirm div a";
		public static final String EDIT_SETTINGS_PRIVATE_RADIO = "UserPrivacyPrivate";
		public static final String EDIT_SETTINGS_PUBLIC_RADIO = "UserPrivacyPublic";
		public static final String EDIT_SETTINGS_SAVE_BUTTON = "savePrivacy";

		}
		  
		  public interface footer {
		public static final String TERMS_OF_USE = ".middleWaveLinks a:nth-child(1)";
		  }
		  
		  public interface myProfile {
		public static final String LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON = ".tc_all_activities";
		public static final String LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON = ".tc_my_activities";
		public static final String LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON = ".tc_wall_messages";
		public static final String LAST_MESSAGE_CONTAINER = ".messages ul li:nth-child(1) div.activity-container";
		public static final String AVATAR_ICO = "userAvatar";
		public static final String DELETE_FRIEND_BUTTON = ".delete-friend-user-profile-button";
		public static final String DELETE_FRIEND_YES_BUTTON = ".popup_bottom_button";
		public static final String FRIEND_REQUEST_SENT_TEXT = ".dbtnRequestPending";
		  }
		  
		public interface NOTIFICATIONS{
		public static final String TAB_NOTIFICATIONS = "tab_inbox";
		public static final String ACCEPT_FRIEND_REQUEST_BUTTON = ".accept";
		public static final String REJECT_FRIEND_REQUEST_BUTTON = ".reject";
		public static final String REJECTED_MESSAGE = ".rejected";
		public static final String REMOVE_MESSAGE = ".links div:nth-child(2) div a";
		public static final String CLOUD_BOX = ".cloud";
		}

		public interface FRIENDS{
		public static final String TAB_FRIENDS = "tab_friends";
		public static final String SEARCH_FRIEND_TEXTBOX = ".friends_search_username";
		public static final String SEARCH_BUTTON = ".friends_search_bottom_holder tbody tr td div a.submit";
		public static final String FIRST_SEARCHED_FRIEND_NAME_TEXT = ".friends_search_item_holder p.usernameHolder a";
		public static final String FIRST_SEARCHED_FRIEND_AVATAR_ICO = ".friends_search_item_holder div.avatar a";
		public static final String FIRST_SEARCHED_FRIEND_SEND_REQUEST_BUTTON = ".friends_search_item_holder div a.friends_search_result_action";
		public static final String FIRST_SEARCHED_FRIEND_AGE_TEXT = ".friends_search_item_holder p:nth-child(3)";
		public static final String FIRST_SEARCHED_FRIEND_GENDER_TEXT = ".friends_search_item_holder p:nth-child(4)";
		public static final String FIRST_SEARCHED_FRIEND_POINTS_ICO = ".icon_points";
		public static final String FIRST_SEARCHED_FRIEND_GALERY_ICO = ".icon_galery";
		public static final String FIRST_SEARCHED_FRIEND_AWARDS_ICO = ".icon_awards";
		public static final String FIRST_SEARCHED_FRIEND_FRIENDS_ICO = ".icon_friends";
		public static final String FIRST_SEARCHED_FRIEND_POINTS_TEXT = ".friends_points";
		public static final String FIRST_SEARCHED_FRIEND_GALERY_TEXT = ".friends_galery";
		public static final String FIRST_SEARCHED_FRIEND_AWARDS_TEXT = ".friends_awards";
		public static final String FIRST_SEARCHED_FRIEND_FRIENDS_TEXT = ".friends_friends";
		public static final String FIRST_SEARCHED_FRIEND_POST_ICO = ".userActionLink span:nth-child(1) a";
		public static final String FIRST_SEARCHED_FRIEND_REMOVE_ICO = ".userActionLink span:nth-child(2) a";

		public static final String FRIEND_REQUEST_POPUP_CLOSE_BUTTON = ".popup_blue_button";
		public static final String HARVESTING_GET_STARTED_BUTTON = ".beginHarvest a.beginHarvest";
		public static final String HARVESTING_GMAIL_BUTTON = ".gmail div";
		public static final String HARVESTING_SIGN_IN_BUTTON = ".harvestLogin";
		public static final String HARVESTING_SELECT_ALL_CHECKBOX = "markAllForHarvest";
		public static final String HARVESTING_FIRST_FRINED_CHECKBOX= ".checkboxHolder input";
		public static final String HARVESTING_SEND_INVITE_BUTTON = ".harvestSendEmailToNew div a.bluebutton";
		public static final String HARVESTING_NO_CONTRACTS_TEXT = ".harvestNoFriendsRightSide div.dbtnBubbleExclamation span.left";
		public static final String HARVESTING_NO_PLAYING_CONTRACTS_TEXT = ".harvestEmail";
		public static final String HARVESTING_NUMBER_OF_CONTRACTS_TEXT = ".harvestListInfo2 p span";
		public static final String HARVESTING_MORE_EMAIL_TEXTBOX = ".emailList li input";
		public static final String HARVESTING_MORE_ADD_MORE_EMAIL_LINK = ".addMoreEmails";
		public static final String HARVESTING_MORE_SEND_INVITE_BUTTON = ".harvestSendEmail div a";
		public static final String HARVESTING_MORE_EMAIL_WRONG_TEXT = ".harvestingEmailError";
		public static final String HARVESTING_MORE_EMAIL_CONFIRM_TEXT = ".harvestEmailSecondBubbleContent";
		public static final String HARVESTING_SKIP_REGISTERED_FRIEND_LINK = ".harvestInviteRegistered a.secondBlue";

		public static final String SEARCH_FOR_FRIEND_HEADER_TEXT = ".myFriendsTitle";
		public static final String SEARCH_FOR_FRIEND_DESCRIPTION_TEXT = ".myFriendsDescription";
		public static final String SEARCH_GIRLS_ICO = ".search_girls";
		public static final String HARVESTING_HEADER_TEXT = ".friendsHarvestTitle";
		public static final String HARVESTING_DESCRIPTION_TEXT = ".myHarvestDescription";
		public static final String YAHOO_ICO = ".account_yahoo";
		public static final String GMAIL_ICO = ".account_gmail";
		public static final String LIVE_ICO = ".account_live";
		public static final String FRIENDS_HEADER_TEXT = ".my_friends_total_holder";
		public static final String FRIENDS_HEADER_FRIENDS_NUMBER_TEXT = ".tc-friends-counter";
		public static final String FRIENDS_SORTING_BY_USERNAME_BUTTON = ".friends-sort-by-username";
		public static final String FRIENDS_SORTING_BY_LAST_VISIT_BUTTON = ".friends-sort-by-lastvisit";
		public static final String FRIENDS_AVATAR_TOOLTIP_ICO = "tlt-avatar";
		}

		  public interface avatar {
		public static final String TAB_AVATAR = "tab_avatar";
		public static final String ANY_AVATAR_BOX = "avatar_"; // add parameter on end
		public static final String FIRST_AVATAR_BOX = ".ul_container ul liavatar_0";
		public static final String SECOND_AVATAR_BOX = ".ul_container ul liavatar_1";
		public static final String FIRST_AVATAR_ICO = ".ul_container ul liavatar_0 a.avatar img";
		public static final String SECOND_AVATAR_ICO = ".ul_container ul liavatar_1 a.avatar img";
		public static final String FIRST_AVATAR_WANT_IT_BUTTON = ".ul_container ul liavatar_0 a.avatar div.button_group";
		public static final String SECOND_AVATAR_WANT_IT_BUTTON = ".ul_container ul liavatar_1 a.avatar div.button_group";
		public static final String AVATAR_TITLE_TEXT = "picker_top_left";
		public static final String CREATE_AVATAR_GIRL_ICO = "picker_girl";
		public static final String CREATE_AVATAR_HEADER_TEXT = "picker_more_fun";
		public static final String CREATE_AVATAR_BUTTON = "picker_build_button";
		  }
		  
		  public interface flatPage {
		public static final String FLAT_PAGE_CONTAINER = "staticContainer";
		public static final String FLAT_PAGE_HEADER = ".categoryHeader";
		public static final String FLAT_PAGE_ADVERT = ".newSkyContainer";
		  }
		  public interface HARVESTING{
			  public static final String EMAIL_TEXTBOX = "Email";
			  public static final String PASSWORD_TEXTBOX = "Passwd";
			  public static final String LOGIN_BUTTON = "signIn";
			  public static final String ALLOW_BUTTON = "allow";
			  public static final String LOGOUT_ARROW_MENU = ".gbma";
			  public static final String LOGOUT_BUTTON = "gb_71";

			  public static final String HARVESTING_GET_STARTED_BUTTON = ".beginHarvest a.beginHarvest";
			  public static final String HARVESTING_GMAIL_BUTTON = ".gmail div";
			  public static final String HARVESTING_SIGN_IN_BUTTON = ".harvestLogin";
			  public static final String HARVESTING_SELECT_ALL_CHECKBOX = "markAllForHarvest";
			  public static final String HARVESTING_FIRST_FRINED_CHECKBOX= ".checkboxHolder input";
			  public static final String HARVESTING_SEND_INVITE_BUTTON = ".harvestSendEmailToNew div a.bluebutton";
			  public static final String HARVESTING_NO_CONTRACTS_TEXT = ".harvestNoFriendsRightSide div.dbtnBubbleExclamation span.left";
			  public static final String HARVESTING_NO_PLAYING_CONTRACTS_TEXT = ".harvestEmail";
			  public static final String HARVESTING_NUMBER_OF_CONTRACTS_TEXT = ".harvestListInfo2 p span";
			  public static final String HARVESTING_MORE_EMAIL_TEXTBOX = ".emailList li input";
			  public static final String HARVESTING_MORE_ADD_MORE_EMAIL_LINK = ".addMoreEmails";
			  public static final String HARVESTING_MORE_SEND_INVITE_BUTTON = ".harvestSendEmail div a";
			  public static final String HARVESTING_MORE_EMAIL_WRONG_TEXT = ".harvestingEmailError";
			  public static final String HARVESTING_MORE_EMAIL_CONFIRM_TEXT = ".harvestEmailSecondBubbleContent";
			  public static final String HARVESTING_SKIP_REGISTERED_FRIEND_LINK = ".harvestInviteRegistered a.secondBlue";
			  }
  
  public interface hyves {
	  public static final String USERNAME_FIELD = "#auth_username";
	  public static final String PASSWORD_FIELD = "#auth_password";
	  public static final String LOGIN_BUTTON = "#login-btn";
	  public static final String GAMES_LINK = "li#menu-games a.sub-menu-title";
	  public static final String SOCIAL_LINK = "a#social_link";
	  public static final String MULTIPLAYER_LINK = "a#multiplayer_link";
	  public static final String SEARCH_FIELD = "#searchInput";
	  public static final String SEARCH_BUTTON = "#searchButton";
	  public static final String SEARCH_BOX_TITLE = "#catbox h1 span";
	  public static final String SEARCH_BOX_RESULTS_FOUND = "#catbox div .search-results-list-header";
	  public static final String SEARCH_BOX_NO_RESULTS = "#catbox div .search-results-noresults-header";
	  public static final String SEARCHED_ELEMENT = ".box";
  }
}
