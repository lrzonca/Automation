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
			public static final String JOIN_NOW_LINK = ".tc-register-url";
			public static final String SIGN_UP_POPUP = "#socialgameRegister";
			public static final String REGISTER_EMAIL = "#sgRegMail";
			public static final String REGISTER_EMAIL_VALID = "#email_validationCorrectImage";
			public static final String REGISTER_EMAIL_NOT_VALID= "#email_validationErrorImage";
			public static final String REGISTER_USERNAME = "#sgRegUsername";
			public static final String REGISTER_USERNAME_VALID = "#username_validationCorrectImage";
			public static final String REGISTER_USERNAME_NOT_VALID = "#username_validationErrorImage";
			public static final String REGISTER_PASSWORD = "#sgRegPassword";
			public static final String REGISTER_PASSWORD_VALID = "#password_validationCorrectImage";
			public static final String REGISTER_PASSWORD_NOT_VALID = "#password_validationErrorImage";
			public static final String REGISTER_AGE = "#sgRegAge";
			public static final String REGISTER_DOB_MONTH = "#f_dob_month";
			public static final String REGISTER_DOB_DAY = "#f_dob_day";
			public static final String REGISTER_DOB_YEAR = "#f_dob_year";
			public static final String HOW_OLD_ARE_YOU = ".sg-reg-form-caption";
			public static final String REGISTER_AGE_VALID = "#age_validationCorrectImage";
			public static final String REGISTER_DOB_VALID = "#dob_validationCorrectImage";
			public static final String REGISTER_AGE_NOT_VALID = "#age_validationErrorImage";
			public static final String REGISTER_DOB_NOT_VALID = "#dob_validationErrorImage";
			
			public static final String REGISTER_SIGNMEUP = ".sg-reg-save-btn";
			public static final String REGISTER_WELCOME_TEXT = ".reg-confirm-user";
			public static final String REGISTER_WELCOME_CLOSE_BTN = ".socialClose";
			public static final String REGISTER_SIGN_IN_LINK = ".sg-reg-bottom-text a";
			public static final String REGISTER_PRIVACY_POLICY_LINK = ".sg-reg-terms span a:nth-child(1)";
			public static final String REGISTER_TERMS_OF_USE_LINK = ".sg-reg-terms span a:nth-child(2)";
			public static final String REGISTER_MORE_INFO = ".more-link a";
		}
		  
		public interface signIn {
			public static final String SIGN_IN_LINK = ".tc-login-url";
			public static final String SIGN_IN_POPUP = "#fb_loginbox_main";
			public static final String USERNAME = ".tc-username-text";
			public static final String PASSWORD = ".tc-password-text";
			public static final String SIGN_IN_BUTTON = ".login_button a";
			public static final String LOGGED_USERNAME = ".tc-username-cnt";
			public static final String ERROR_MESSAGE = ".tc-error-message-notauth";
			public static final String REMEMBER_CHECKBOX = ".tc-remember-check";
			public static final String LOGOUT_LINK = ".tc-logout-url";
			public static final String FORGOT_YOUR_PASSWORD_LINK = ".f_forgotten a";
			public static final String BECOME_A_MEMBER_LINK = ".loginPink a";
			public static final String REGISTER_LINK = "#registration_link";
			public static final String SIGN_IN_BOX = "#fb_loginbox_main";
		}
		  
		public interface leftNavi {
			public static final String ADVENTURE_GAMES = ".tc_ln_category_458";
			public static final String POPULAR_GAMES = ".tc_ln_popular";
			public static final String FIRST_AVAILABLE_GAME_CATEGORY_LEFT_NAVI_LINK = ".leftNavigation ul:nth-child(3) li:nth-child(6) a";
			public static final String SECOND_AVAILABLE_GAME_CATEGORY_LEFT_NAVI_LINK = ".leftNavigation ul:nth-child(3) li:nth-child(8) a";
			public static final String HIGHSCORE_LEFT_NAVI_LINK = ".leftNavigation ul:nth-child(3) li:nth-child(3) a"; // should be added a unique class
			public static final String GAMES_FOR_GIRLS_NAVI_LINK = ".leftNavigation ul:nth-child(1) li:nth-child(2) a"; // should be added a unique class
			public static final String AWARD_GAMES_LEFT_NAVI_LINK = ".leftNavigation ul:nth-child(3) li:nth-child(1) a"; // should be added a unique class
		}
		  
		public interface categoryPage {
			public static final String SUBCATEGORY_GAME_LIST = "#subcatList";
			public static final String FIRST_AVAILABLE_SUBCATEGORY_LINK = ".gameStack:nth-child(1) a";
			public static final String TOP_HOME_PAGE_LINK = ".categoryBreadcrumb a:nth-child(1)";
			public static final String TOP_CATEGORY_LINK = ".categoryBreadcrumb a:nth-child(2)";
			public static final String TOP_ACTIVE_PAGE = ".categoryBreadcrumb span";
			public static final String FIRST_AVAILABLE_GAME_LINK = ".one-game-category a";
			public static final String CATEGORY_TAG_BOX = "#tagsBoxContainer";
			public static final String CATEGORY_TAG_GIRLS_IMG = "#tagsGirls";
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
		  
		public interface forgotPassword {
			public static final String FORGOT_EMAIL_BOX = "#emailPrompt";
			public static final String FORGOT_EMAIL_GIRL = "#forgotPasswordGirl img";
			public static final String FORGOT_EMAIL_TEXTFIELD = "#fpEmail";
			public static final String FORGOT_EMAIL_TITLE_TEXT = "#emailPrompt div.title";
			public static final String FORGOT_EMAIL_TEXT = "#emailPrompt div.text";
			public static final String FORGOT_EMAIL_SEND_BUTTON = ".itemWithButton div.button";			  
		}
		  
		public interface social {
			public static final String SOCIAL_GAME_BOX = "socialgame";
			public static final String SOCIAL_GAME_GS_BOX = "#easyXDM_default2487_provider";
			public static final String SOCIAL_GAME = "#container";
			public static final String SOCIAL_GAME_HEADER_TEXT = "#promobar";
			public static final String SOCIAL_GAME_PLAY_BUTTON = "#button1";
			public static final String SOCIAL_GAME_INVITE_BUTTON = "#button2";
			public static final String SOCIAL_GAME_GET_SAPPHIRES_BUTTON = "#button5";
			public static final String SOCIAL_GAME_HELP_BUTTON = "#button6";
			public static final String SOCIAL_GAME_USER_ID_TEXT = "#useridtext";
			public static final String SIGN_UP_BOX = "#socialgameRegister";
			public static final String HEADER_CLOSE_BUTTON = "div.sg-register a.socialClose p.socialCloseButton";
			public static final String HEADER_CLOSE_BUTTON2 = ".socialCloseButton";
			public static final String HEADER_CLOSE_BUTTON3 = "#sg_harvesting_popup div div a.socialClose p.socialCloseButton";
			public static final String HEADER_GS_CLOSE_BUTTON = "#pss_close a";
			public static final String HARVESTING_POPUP = "#sg_harvesting_popup";
			public static final String HEADER_TITLE_TEXT = ".socialTop h1 div.text";
			public static final String ON_SITE_TAB = "#onsite";
			public static final String ON_SITE_FIRST_FRIEND_AVATAR_BOX = "li:nth-child(1) .avatar a";
			public static final String ON_SITE_FIRST_FRIEND_AVATAR_IMG = "li:nth-child(1) .avatar a img";
			public static final String ON_SITE_FIRST_FRIEND_BOX = "#myfr_0";
			public static final String ON_SITE_FIRST_FRIEND_CHECKBOX = "li:nth-child(1) .check-invite input";
			public static final String ON_SITE_FIRST_FRIEND_INFO_NAME_TEXT = "li:nth-child(1) .givenname";
			public static final String ON_SITE_FIRST_FRIEND_INFO_USERNAME_LINK = "li:nth-child(1) .usernameHolder a";
			public static final String ON_SITE_HEADER_TEXT = ".onsite-top";
			public static final String ON_SITE_INVITE_BUTTON = ".popup_blue_button";
			public static final String ON_SITE_SEARCH_YOUR_FRIEND_BUTTON = ".search-icon";
			public static final String ON_SITE_SEARCH_YOUR_FRIEND_TEXTFIELD = "#friends_search_social";
			public static final String ON_SITE_SELECT_ALL_CHECKBOX = "#onsite_selectall";
			public static final String ON_SITE_SELECT_ALL_LINK = "#onsite_selectall_a";
			public static final String FROM_EMAIL_TAB = "#fromemail";
			public static final String FROM_EMAIL_BOTTOM_DESCRIPTION_TEXT = ".harvestFirstStepProvacy";
			public static final String FROM_EMAIL_GMAIL_BUTTON = ".gmail div";
			public static final String FROM_EMAIL_SELECT_PROVIDER_TEXT = ".harvestFirstAccounts p";
			public static final String FROM_EMAIL_TOP_DESCRIPTION_TEXT = ".harvestFirstDescription p";
			public static final String FROM_EMAIL_TOP_TITLE_TEXT = ".harvestFirstDescription h3";
			public static final String FROM_EMAIL_WINDOWS_LIVE_BUTTON = ".live div";
			public static final String FROM_EMAIL_YAHOO_BUTTON = ".yahoo div";
			public static final String ON_SITE_TOTAL_FRIENDS_NUMBER_TEXT = ".my_friends_total_extern";
			public static final String ON_SITE_SELECTED_FRIENDS_TEXT = ".selected";
			public static final String harvesting_onsite_container = "#harvesting_onsite_container";
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
			public static final String SIGN_UP_PB_EMAIL_TEXTFIELD = "#sgRegMail";
			public static final String SIGN_UP_PB_EMAIL_CORRECT_ICON = "#email_validationCorrectImage";
			public static final String SIGN_UP_PB_EMAIL_ERROR_ICON = "#email_validationErrorImage";
			public static final String SIGN_UP_PB_EMAIL_ERROR_EMAIL_TAKEN_TEXT = "#error_email_already_taken";
			public static final String SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT = "#error_incorrect_email";
			public static final String SIGN_UP_PB_USERNAME_TITLE_TEXT = ".sg-registration-step1 div:nth-child(2) div.sg-reg-form-caption";
			public static final String SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT = ".sg-registration-step1 div:nth-child(2) div.sg-reg-form-help a";
			public static final String SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TOOLTIP_TEXT = ".sg-registration-step1 div:nth-child(2) div.sg-reg-form-help span";
			public static final String SIGN_UP_PB_USERNAME_TEXTFIELD = "#sgRegUsername";
			public static final String SIGN_UP_PB_USERNAME_CORRECT_ICON = "#username_validationCorrectImage";
			public static final String SIGN_UP_PB_USERNAME_ERROR_ICON = "#username_validationErrorImage";
			public static final String SIGN_UP_PB_USERNAME_ERROR_USERNAME_TAKEN_TEXT = "#error_username_taken";
			public static final String SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT = "#error_username_too_short";
			public static final String SIGN_UP_PB_USERNAME_ERROR_USERNAME_INCORECT_TEXT = "#error_incorrect_username";
			public static final String SIGN_UP_PB_USERNAME_ERROR_USERNAME_PROFANITY_TEXT = "#error_profanity_username";
			public static final String SIGN_UP_PB_PASSWORD_TITLE_TEXT = ".sg-registration-step1 div:nth-child(3) div.sg-reg-form-caption";
			public static final String SIGN_UP_PB_PASSWORD_TEXTFIELD = "#sgRegPassword";
			public static final String SIGN_UP_PB_PASSWORD_CORRECT_ICON = "#password_validationCorrectImage";
			public static final String SIGN_UP_PB_PASSWORD_ERROR_ICON = "#password_validationErrorImage";
			public static final String SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT = "#error_password_too_short";
			public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT = ".sg-registration-step1 div.sg-reg-howold-line span";
			public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD = "#sgRegAge";
			public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_CORRECT_ICON = "#age_validationCorrectImage";
			public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON = "#age_validationErrorImage";
			public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT = "#error_age_not_numeric";
			public static final String SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_TOO_YOUNG_TEXT = "#error_too_young";
			
			public static final String SIGN_UP_PB_DOB_BOX = ".sg-reg-form-input";
			public static final String SIGN_UP_PB_DOB_MONTH = "#f_dob_month";
			public static final String SIGN_UP_PB_DOB_DAY = "#f_dob_day";
			public static final String SIGN_UP_PB_DOB_YEAR = "#f_dob_year";
			public static final String SIGN_UP_DOB_VALID = "#dob_validationCorrectImage";
			public static final String SIGN_UP_DOB_NOT_VALID = "#dob_validationErrorImage";
			public static final String SIGN_UP_PB_DOB_NOT_VALID = "#error_dob_not_valid";
			
			public static final String SIGN_UP_PB_LINE = ".sg-registration-step1 .hsep";
			public static final String SIGN_UP_PB_PARENTS_EMAIL_TITLE_TEXT = ".sg-registration-step1 div:nth-child(5) div.sg-reg-form-caption";
			public static final String SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TEXT = ".sg-registration-step1 div:nth-child(5) div.sg-reg-form-help a";
			public static final String SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TOOLTIP_TEXT = ".sg-registration-step1 div:nth-child(5) div.sg-reg-form-help a";
			public static final String SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD = "#sgRegParentsMail";
			public static final String SIGN_UP_PB_PARENTS_EMAIL_CORRECT_ICON = "#parents_validationCorrectImage";
			public static final String SIGN_UP_PB_PARENTS_EMAIL_ERROR_ICON = "#parents_validationErrorImage";
			public static final String SIGN_UP_PB_PARENTS_EMAIL_ERROR_PARENTS_EMAIL_WRONG_TEXT = "#parent_error_incorrect_email";
			public static final String SIGN_UP_PB_TERMS_OF_USE_TEXT = ".sg-reg-terms";
			public static final String SIGN_UP_PB_NEWSLETTER = "#sgRegNewsletterAuto";
			public static final String SIGN_UP_PB_SIGN_ME_UP_BUTTON = ".sg-reg-save-btn";
			public static final String SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT = ".sg-reg-bottom-text";
			public static final String SIGN_UP_PB_SIGN_IN_BOTTOM_LINK = ".sg-reg-bottom-text a";			
			public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_ICON = ".tick-icon";
			public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_TITLE_TEXT = ".sg-registration-step2-normal h2.txt-normal";
			public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_TITLE_TEXT = ".sg-registration-step2-normal h2.txt-child";
			public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_TEXT = ".sg-registration-step2-normal div.txt-normal";
			public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_TEXT = ".sg-registration-step2-normal div.txt-child";
			public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CONTINUE_PLAYING_BUTTON = "#sgRegContinueBtn";
			// public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_CONTINUE_PLAYING_BUTTON = "css=sgRegChildContinueBtn";
			public static final String SIGN_UP_WB_SIGN_IN_SUCCESS_CHILD_HEADER_TEXT = ".parents-girl-text";
			public static final String SIGN_UP_WB_SIGN_IN_SUCCESS_CHILD_GIRL_ICON = ".parents-girl";
			public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_GIRL_ICON = ".girl";
			public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_ERROR_ICON = "terms_validationErrorImage";
			public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_ERROR_TEXT = ".finish-child-info";
			public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_FINISH_TEXT = ".finish-text";
			public static final String SIGN_UP_PB_SIGN_IN_SUCCESS_CHILD_CONTINUE_PLAYING_BUTTON = ".sg-reg-parent-continue-btn span.label";
		}
		  
		public interface gamepage {
			public static final String GAME_CONTAINTER_SHOCKWAVE = "#flashobj_mc";
			public static final String GAME_CONTAINTER_IFRAME = "#gameiframe_js";
			public static final String ALL_COMMENTS_BOX = "#commentsHolder";		
			public static final String ZOOM_SCALABLE_BAR = "#zoom";
			public static final String ZOOM_OUT_LINK = ".zoom-out";
			public static final String ZOOM_SLIDER = "#zoomSlider";
			public static final String ZOOM_IN_LINK = ".zoom-in";
			public static final String ZOOM_RESET_LINK = ".zoom-reset";
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
			public static final String LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON = ".tc_all_activities";
			public static final String LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON = ".tc_my_activities";
			public static final String LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON = ".tc_wall_messages";
			public static final String NEW_EMAIL_TEXT = "#f_email";
			public static final String SAVE_EMAIL_BUTTON = "#saveEmail div a";
			public static final String CONFIRM_PASSWORD_TEXT = "#changeemailconfirm table tbody tr td input#confirmPass";
			public static final String SAVE_CONFIRM_PASSWORD_BUTTON = "css=#changeemailconfirm div#saveEmailConfirm div a";
			public static final String EDIT_SETTINGS_PRIVATE_RADIO = "UserPrivacyPrivate";
			public static final String EDIT_SETTINGS_PUBLIC_RADIO = "UserPrivacyPublic";
			public static final String EDIT_SETTINGS_SAVE_BUTTON = "savePrivacy";
		}
		  
		public interface footer {
			public static final String TERMS_OF_USE = ".middleWaveLinks a:nth-child(1)";
			public static final String PRIVACY_POLICY = ".middleWaveLinks a:nth-child(2)";
			public static final String PRIVACY_POLICY_KIDS_PARENTS = ".middleWaveLinks a:nth-child(3)";
			public static final String INFORMATION_FOR_PARRENTS = ".middleWaveLinks a:nth-child(4)";
			public static final String SITEMAP = ".middleWaveLinks a:nth-child(5)";
			public static final String ABOUT_US = ".middleWaveLinks a:nth-child(7)";
			public static final String ADVERTISE = ".middleWaveLinks a:nth-child(8)";
			public static final String SUBMIT_A_GAME = ".middleWaveLinks a:nth-child(9)";
			public static final String GET_FREE_GAMES = ".middleWaveLinks a:nth-child(10)";
			public static final String HELP_AND_CONTENT = ".middleWaveLinks a:nth-child(11)";
			public static final String POPULAR_GAMES_BOX = ".footer-top div.bottomLinks:nth-child(1)";
			public static final String POPULAR_GAMES_TITLE = ".footer-top div.bottomLinks:nth-child(1) h4";
			public static final String POPULAR_GAMES_EMPTY_LINE = ".footer-top div.bottomLinks:nth-child(1) hr";
			public static final String POPULAR_GAMES_LINKS_BOX = ".footer-top div.bottomLinks:nth-child(1) ul";
			public static final String POPULAR_GAMES_FIRST_LINK_LINK = ".footer-top div.bottomLinks:nth-child(1) ul li:nth-child(1) a";			
			public static final String OTHER_SITES_BOX = ".footer-top div.bottomLinks:nth-child(2)";
			public static final String OTHER_SITES_TITLE = ".footer-top div.bottomLinks:nth-child(2) h4";
			public static final String OTHER_SITES_EMPTY_LINE = ".footer-top div.bottomLinks:nth-child(2) hr";
			public static final String OTHER_SITES_LINKS_BOX = ".footer-top div.bottomLinks:nth-child(2) ul";
			public static final String OTHER_SITES_FIRST_LINK_LINK = ".footer-top div.bottomLinks:nth-child(2) ul li:nth-child(1) a";			
			public static final String PARTNERS_BOX = ".footer-top div.bottomLinks:nth-child(3)";
			public static final String PARTNERS_TITLE = ".footer-top div.bottomLinks:nth-child(3) h4";
			public static final String PARTNERS_EMPTY_LINE = ".footer-top div.bottomLinks:nth-child(3) hr";
			public static final String PARTNERS_LINKS_BOX = ".footer-top div.bottomLinks:nth-child(3) ul";
			public static final String PARTNERS_LINKS_FIRST_LINK_LINK = ".footer-top div.bottomLinks:nth-child(3) ul li:nth-child(1) a";					
			public static final String LANGUAGES_BOX = ".footer-top div.bottomLanguages";
			public static final String LANGUAGES_TITLE = ".footer-top div.bottomLanguages h4";
			public static final String LANGUAGES_EMPTY_LINE = ".footer-top div.bottomLanguages hr";
			public static final String LANGUAGES_LINKS_LEFT_BOX = ".footer-top div.bottomLanguages ul:nth-child(3)";
			public static final String LANGUAGES_LINKS_RIGHT_BOX = ".footer-top div.bottomLanguages ul:nth-child(4)";
			
			public static final String LANGUAGES_ARGENTINA_LINK = ".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(1) a";
			public static final String LANGUAGES_BRASIL_LINK = ".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(2) a";
			public static final String LANGUAGES_CHILE_LINK = ".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(3) a";
			public static final String LANGUAGES_COLOMBIA_LINK = ".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(4) a";
			public static final String LANGUAGES_DEUTSCHLAND_LINK = ".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(5) a";
			public static final String LANGUAGES_ESPANA_LINK = ".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(6) a";
			public static final String LANGUAGES_FRANCE_LINK = ".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(7) a";
			public static final String LANGUAGES_INDONESIA_LINK = ".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(8) a";
			public static final String LANGUAGES_ITALIA_LINK = ".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(9) a";
			public static final String LANGUAGES_MEXICO_LINK = ".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(1) a";
			public static final String LANGUAGES_NEDERLAND_LINK = ".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(2) a";
			public static final String LANGUAGES_POLSKA_LINK = ".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(3) a";
			public static final String LANGUAGES_RUSSIA_LINK = ".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(4) a";
			public static final String LANGUAGES_SVERIGE_LINK = ".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(5) a";
			public static final String LANGUAGES_TURKIYE_LINK = ".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(6) a";
			public static final String LANGUAGES_UK_LINK = ".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(7) a";
			public static final String LANGUAGES_USA_LINK = ".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(8) a";
			public static final String LANGUAGES_VENEZUELA_LINK = ".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(9) a";
		}
		  
		public interface myProfile {
			public static final String TOP_TITLE = ".topTitle";
			public static final String LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON = ".tc_all_activities";
			public static final String LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON = ".tc_my_activities";
			public static final String LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON = ".tc_wall_messages";
			public static final String LAST_MESSAGE_CONTAINER = ".messages ul li:nth-child(1) div.activity-container";
			public static final String AVATAR_ICO = "userAvatar";
			public static final String DELETE_FRIEND_BUTTON = ".delete-friend-user-profile-button";
			public static final String DELETE_FRIEND_YES_BUTTON = ".popup_bottom_button";
			public static final String FRIEND_REQUEST_SENT_TEXT = ".dbtnRequestPending";
			public static final String ACTIVITIES_BOX = ".activitiesBlock";
			public static final String MY_FRIENDS_BOX = "#latestFriends";
			public static final String MY_FAVE_GAMES_BOX = "#myFavGamesBox";
			public static final String LAST_CREATIONS_BOX = "#lastImages";
			public static final String MY_AWARDS_BOX = "#myAwardsBox";
			public static final String HIGH_SCORES_BOX = "#myhighscores";
			
			public static final String ACTIVITIES_ICON = ".activitiesBlock span.icon";
			public static final String ACTIVITIES_TITLE = ".activitiesBlock h2.fill-username";
			public static final String ACTIVITIES_POST_TITLE = ".container h4";
			public static final String ACTIVITIES_POST_TEXTFIELD_BOX = "#wall_post_new_message iframe#wall_post_txt";
			public static final String ACTIVITIES_POST_ICONS_BOX = "#emoHolder";
			public static final String ACTIVITIES_POST_BTN = ".buttons .dbtnSimple a";
			public static final String ACTIVITIES_POST_LETTER_LEFT_TEXT = ".maxchars";
			public static final String ACTIVITIES_POST_TEXT = ".frameBody";
			
			public static final String MY_FRIENDS_TITLE = ".tc-latestFriendsTitle";
			public static final String MY_FRIENDS_NO_FRIENDS_BOX = ".friends_friendlist_nofriends";
			public static final String MY_FRIENDS_NO_FRIENDS_BTN = ".friends_friendlist_nofriends div div div a";
			public static final String MY_FRIENDS_FIRST_FRIENDS_BOX = ".friends_latest_list ul li:nth-child(1)";
			public static final String MY_FRIENDS_FIRST_FRIENDS_AVATAR = ".friends_latest_list ul li:nth-child(1) a span.lf-avatar";
			public static final String MY_FRIENDS_FIRST_FRIENDS_NAME = ".friends_latest_list ul li:nth-child(1) a span.lf-username";
			public static final String MY_FRIENDS_SEE_ALL_FRIENDS_LINK = ".friends_latest_list div.total a";
			
			public static final String MY_FAVE_GAMES_TITLE = ".tc-favoriteTitle";
			public static final String MY_FAVE_GAMES_FIRST_GAME_BOX = ".tc-favorites-list li:nth-child(1) a.profileGameItem";
			public static final String MY_FAVE_GAMES_FIRST_GAME_DELETE_BTN = ".tc-favorites-list li:nth-child(1) a.gameDelete";
			public static final String MY_FAVE_GAMES_SEE_ALL_FAVE_GAMES_LINK = "#privateMorelinkGame";
			
			public static final String MY_LATEST_CREATIONS_TITLE = ".tc-creationsTitle";
			public static final String MY_LATEST_CREATIONS_FIRST_CREATION_BOX = ".tc-creations-list li:nth-child(1) div span a";
			public static final String MY_LATEST_CREATIONS_FIRST_DELETE_BTN = ".tc-creations-list li:nth-child(1) a.imageDelete";
			public static final String MY_LATEST_CREATIONS_VIEW_ALBUM_LINK = ".tc-morecreations-url";
			
			public static final String MY_AWARDS_TITLE = ".tc-awardsTitle";
			public static final String MY_AWARDS_FIRST_AWARD_BOX = "#awards ul li:nth-child(1) span img";
			public static final String MY_AWARDS_FIRST_AWARD_LINK = "#awards ul li:nth-child(1) a";
			public static final String MY_AWARDS_SEE_ALL_AWARDS_LINK = "#moreAwards a";			
			
			public static final String HIGH_SCORES_TITLE = "#myhighscores span.boxheader";
			public static final String HIGH_SCORES_NO_HIGH_SCORES_BOX = "#myhighscores div.noresults";
			public static final String HIGH_SCORES_HIGH_SCORES_BOX = "#userhighscores";
			public static final String HIGH_SCORES_FIRST_HIGH_SCORES_BOX = "#userhighscores ul li:nth-child(1) div.gamedata div a";
		}
		  
		public interface notifications{
			public static final String TAB_NOTIFICATIONS = "#tab_inbox";
			public static final String ACCEPT_FRIEND_REQUEST_BUTTON = ".accept";
			public static final String REJECT_FRIEND_REQUEST_BUTTON = ".reject";
			public static final String REJECTED_MESSAGE = ".rejected";
			public static final String REMOVE_MESSAGE = ".friendrequestaccepted div div.cloud div a";
			public static final String CLOUD_BOX = ".cloud";
			public static final String NOTIFICATION_FIRST_MESSAGE_BOX = ".messages li:nth-child(1) div div.cloud";
			public static final String NOTIFICATIONS_FIRST_AVATAR_LINK = ".messages li:nth-child(1) div.message div.avatar-container a";
			public static final String NOTIFICATIONS_TOP_LINK = "#un_mynotifications";
			public static final String NOTIFICATIONS_TOP_INFO_TEXT = ".user-alert-functional-2 div.noMessagesNotice";
			public static final String NOTIFICATIONS_NO_NOTIFICATIONS_BOX = "#inboxLayout div.main div.content div:nth-child(2) div.noMessagesNotice";
			public static final String NOTIFICATIONS_NOTIFICATIONS_BOX = "#inboxLayout div.main div.content div:nth-child(2) ul.messages";
			public static final String NOTIFICATIONS_ALL_BTN = ".//*[@id='inboxLayout']/div/div/div[2]/div[1]/a[1]/span";
			public static final String NOTIFICATIONS_FRIEND_REQUESTS_BTN = ".//*[@id='inboxLayout']/div/div/div[2]/div[1]/a[2]/span";
			public static final String NOTIFICATIONS_GIRLSGOGAMES_BTN = ".//*[@id='inboxLayout']/div/div/div[2]/div[1]/a[3]/span";
			public static final String NOTIFICATIONS_FRIEND_REQUEST_ACCEPTED_MSG_BOX = ".messages li.friendrequestaccepted";
			public static final String NOTIFICATIONS_WELCOME_MSG_BOX = ".messages li.welcome";
			public static final String NOTIFICATIONS_NEXT_BTN = ".pagers div:nth-child(1) div ul.pager li.next";
		}
		
		public interface favoriteGames{
			public static final String TAB_FAVORITE_GAMES = "#tab_favorites";
			public static final String FAVORITE_GAMES_TOP_LINK = "#un_mygames";
			public static final String FAVORITE_GAMES_FIRST_GAME_BOX = "#favorite-list-myprofile li#mygame_0_1 a";
		}	
		
		public interface album{
			public static final String TAB_ALBUM = "#tab_gallery";
			public static final String ALBUM_FIRST_CREATION_BOX = ".gallery-items-list li:nth-child(1) div span a";
		}
		
		public interface awards{
			public static final String TAB_AWARDS = "#tab_awards";
			public static final String AWARDS_FIRST_AWARD_BOX = ".results ul li:nth-child(1) span a span.awardicon img";
			public static final String AWARDS_FIRST_EMPTY_AWARD_BOX = ".noresults ul li:nth-child(1) span span.awardicon img";
		}

		public interface FRIENDS{
			public static final String TAB_FRIENDS = "#tab_friends";
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
			public static final String TAB_AVATAR = "#tab_avatar";
			public static final String ANY_AVATAR_BOX = "#avatar_"; // add parameter on end
			public static final String FIRST_AVATAR_BOX = "#avatar_0";
			public static final String SECOND_AVATAR_BOX = "#avatar_1";
			public static final String FIRST_AVATAR_ICO = "#avatar_0 a.avatar img";
			public static final String SECOND_AVATAR_ICO = "#avatar_1 a.avatar img";
			public static final String FIRST_AVATAR_WANT_IT_BUTTON = "#avatar_0 a.avatar div.button_group";
			public static final String SECOND_AVATAR_WANT_IT_BUTTON = "#avatar_1 a.avatar div.button_group";
			public static final String AVATAR_TITLE_TEXT = "#picker_top_left";
			public static final String CREATE_AVATAR_GIRL_ICO = "#picker_girl";
			public static final String CREATE_AVATAR_HEADER_TEXT = "#picker_more_fun";
			public static final String CREATE_AVATAR_BUTTON = "#picker_build_button";
		}
		  
		public interface flatPage {
			public static final String FLAT_PAGE = "#flatpage";
			public static final String FLAT_PAGE_CONTAINER = "#staticContainer";
			public static final String FLAT_PAGE_HEADER = ".categoryHeader";
			public static final String FLAT_PAGE_ADVERT = ".newSkyContainer";
		}
		  
		public interface HARVESTING{
			public static final String EMAIL_TEXTBOX = "#Email";
			public static final String PASSWORD_TEXTBOX = "#Passwd";
			public static final String LOGIN_BUTTON = "#signIn";
			public static final String ALLOW_BUTTON = "#allow";
			public static final String LOGOUT_ARROW_MENU = ".gbma";
			public static final String LOGOUT_BUTTON = "#gb_71";
			public static final String HARVESTING_GET_STARTED_BUTTON = ".beginHarvest a.beginHarvest";
			public static final String HARVESTING_GMAIL_BUTTON = ".gmail div";
			public static final String HARVESTING_SIGN_IN_BUTTON = ".harvestLogin";
			public static final String HARVESTING_SELECT_ALL_CHECKBOX = "#markAllForHarvest";
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
		
		public interface header {
			public static final String LOGO = "#logo-img-90";
			public static final String SLOGAN = ".slogan h1 a";
			public static final String GGG_TAB = ".tabtext";
			public static final String SEARCH_TEXTFIELD = "#searchtext";
			public static final String SEARCH_BUTTON = ".tc_search_button";
		}
		
		public interface homepage {
			public static final String GAME_LIST = ".gameList";				
		}		
		
		public interface searchpage {
			public static final String WHOLE_SEARCH_LIST = "#nsearch_results_container_1";
			public static final String SEARCH_LIST = "ul#gl";
			public static final String PREVIOUS_BUTTON = ".paginationtop span.paginationButtonPreviousPage";
			public static final String NEXT_BUTTON = ".paginationtop span.paginationButtonNextPage";
			public static final String FIRST_GAME_NAME = "ul#gl li:nth-child(1) div.gameThumb a span.overflowElement span.gameTitle";
			public static final String NO_RESULTS_TEXT = ".no-results";
			public static final String NO_RESULTS_SEARCH_TEXTBOX = "#search3";
			public static final String NO_RESULTS_SUGGESTION = ".suggestions";
			public static final String NO_RESULTS_BOX = "#nsearch_results_container_1";
			public static final String NO_RESULTS_TITLE = "#nsearch_results_container_1 .topTitle";
			public static final String NO_RESULTS_GAMELIST = "#nsearch_results_container_1 .gameList";
		}	
		
		public interface hotbox {
			public static final String HOTBOX_BOX = ".newhotbox ";
			public static final String HOTBOX_ROTATOR = "#hotboxRotator";
			public static final String HOTBOX_ROTATOR_FIRST_GAME = "#hotboxRotator li:nth-child(1)";
			public static final String HOTBOX_ROTATOR_SECOND_GAME = "#hotboxRotator li:nth-child(2)";
			public static final String HOTBOX_ROTATOR_THIRD_GAME = "#hotboxRotator li:nth-child(3)";
			public static final String HOTBOX_FIRST_BUTTON = ".rotatorButtons li:nth-child(1)";
			public static final String HOTBOX_SECOND_BUTTON = ".rotatorButtons li:nth-child(2)";
			public static final String HOTBOX_THIRD_BUTTON = ".rotatorButtons li:nth-child(3)";
			public static final String HOTBOX_PLAYNOW_BUTTON = ".rotatorButtonsHolder a.hbplayleft";
		}		
		
		public interface populargames {
			public static final String POPULAR_GAMES_TITLE_CATEGORY_PAGE = ".categorySubcategoryTitleHolder h3";
			public static final String POPULAR_GAMES_TITLE = ".popularbox h3.topTitle a";
			public static final String POPULAR_GAMES_SHOW_TOOLTIP = "#dtooltip";
			public static final String POPULAR_GAMES_SHOW_TOOLTIP_IMG = "#dtooltip div div img.dtooltip2";
			public static final String POPULAR_GAMES_SHOW_TOOLTIP_TITLE = "#dtooltip div div span.tooltipOverflow span";
			public static final String POPULAR_GAMES_FIRST_GAME_LINK = ".popularbox ul li:nth-child(1) div.overflowElement a";
		}	
		
		public interface recommendedgames {
			public static final String RECOMMENDED_GAMES_TITLE = ".tipsbox h3.topTitle";
			public static final String RECOMMENDED_GAMES_SHOW_TOOLTIP = "#dtooltip";
			public static final String RECOMMENDED_GAMES_SHOW_TOOLTIP_IMG = "#dtooltip div div img.dtooltip2";
			public static final String RECOMMENDED_GAMES_SHOW_TOOLTIP_TITLE = "#dtooltip div div span.tooltipOverflow span";
			public static final String RECOMMENDED_GAMES_FIRST_GAME_LINK = ".tipsbox ul li:nth-child(1) div.overflowElement a";
		}	
		
		public interface virtualbox {
			public static final String VIRTUAL_BOX_TITLE = ".virtualbox h2.virtualgamestitle";
			public static final String VIRTUAL_BOX_FIRST_GAME_BOX = ".virtualbox ul li:nth-child(1) div a";
			public static final String VIRTUAL_BOX_SECOND_GAME_BOX = ".virtualbox ul li:nth-child(2) div a";
			public static final String VIRTUAL_BOX_FIRST_GAME_IMG = ".virtualbox ul li:nth-child(1) div a img.thumb";
			public static final String VIRTUAL_BOX_FIRST_GAME_TEXT_LINK = ".virtualbox ul li:nth-child(1) div a span.overflowElement span";
			public static final String VIRTUAL_BOX_SECOND_GAME_TEXT_LINK = ".virtualbox ul li:nth-child(2) div a span.overflowElement span";
			public static final String VIRTUAL_BOX_LEFT_TOOLTIP_BOX = "#tltleft";
			public static final String VIRTUAL_BOX_LEFT_TOOLTIP_TEXT = "#tltleft div.tltcenter div span.dtooltipDescription";
			public static final String VIRTUAL_BOX_RIGHT_TOOLTIP_BOX = "#tltright";
			public static final String VIRTUAL_BOX_RIGHT_TOOLTIP_TEXT = "#tltright div.tltcenter div span.dtooltipDescription";
		}		
		
		public interface activebox {
			public static final String ACTIVE_BOX_BOX = ".latestActivitiesBox";
			public static final String ACTIVE_BOX_TITLE = ".latestActivitiesBox h3.topTitle a";
			public static final String ACTIVE_BOX_EVERYONE_TAB_BOX = "#act_everyone";
			public static final String ACTIVE_BOX_EVERYONE_TAB_TEXT = "#act_everyone span";
			public static final String ACTIVE_BOX_FRIENDS_TAB_BOX = "#act_friends";
			public static final String ACTIVE_BOX_FRIENDS_TAB_TEXT = "#act_friends span";
			public static final String ACTIVE_BOX_UNLOGGED_CONTENT_BOX = "#mcs_container";			
			public static final String ACTIVE_BOX_UNLOGGED_USER_BOX = "#activitiesBox-login";
			public static final String ACTIVE_BOX_UNLOGGED_USER_TILTE = "#activitiesBox-login div.activities-join";
			public static final String ACTIVE_BOX_UNLOGGED_SIGNUP_BTN = "#activitiesBox-login div.login-row-outer div div.sign-in-button";
			public static final String ACTIVE_BOX_UNLOGGED_LOGIN_LINK = "#activitiesBox-login div.login-row-outer div div.or-login";
			public static final String ACTIVE_BOX_UNLOGGED_JOIN_US_BOX = ".latestActivitiesBox span.not-logged";
			public static final String ACTIVE_BOX_UNLOGGED_JOIN_US_LINK = ".latestActivitiesBox span.not-logged a";
			
			public static final String ACTIVE_BOX_LOGGED_CONTENT_BOX = "#mcs_container_logged";
			public static final String ACTIVE_BOX_LOGGED_FRIENDS_MOVING_MSG_BOX = "#mcs_container_logged div.customScrollBox div.hpActivityContainer div ul";
			public static final String ACTIVE_BOX_LOGGED_FRIENDS_MOVING_FIRST_MSG_BOX = "#mcs_container_logged div.customScrollBox div.hpActivityContainer div ul li:nth-child(1) div.liContent";
			public static final String ACTIVE_BOX_LOGGED_EVERYONE_MOVING_MSG_BOX = "#mcs_container div.customScrollBox div.hpActivityContainer div ul";
			public static final String ACTIVE_BOX_LOGGED_EVERYONE_MOVING_FIRST_MSG_BOX = "#mcs_container div.customScrollBox div.hpActivityContainer div ul li:nth-child(1) div.liContent";
			public static final String ACTIVE_BOX_LOGGED_NO_FRIENDS_BOX = "#mcs_container_logged div div.activity-no-friends";
			public static final String ACTIVE_BOX_LOGGED_NO_FRIENDS_INVITE_BTN = "#mcs_container_logged div div.activity-no-friends div.link a";
			public static final String ACTIVE_BOX_LOGGED_JOIN_US_BOX = ".latestActivitiesBox span.logged";
			public static final String ACTIVE_BOX_LOGGED_VISIT_YOUR_PROFILE_LINK = ".latestActivitiesBox span.logged a";			
		}		
		
		public interface gamelist {
			public static final String GAME_LIST_TITLE = ".indexFirstColumn h2.topTitle";
			public static final String GAME_LIST_BOX = ".indexFirstColumn ul.gameList";
			public static final String GAME_LIST_FIRST_GAME_BOX = ".indexFirstColumn ul li:nth-child(1) div.gameThumb";
			public static final String GAME_LIST_MORE_NEW_GAMES_LINK = ".indexFirstColumn span.more-link a";
			public static final String GAME_LIST_LEFT_TOOLTIP_BOX = "#tltleft";
			public static final String GAME_LIST_LEFT_TOOLTIP_TEXT = "#tltleft div.tltcenter div span.dtooltipDescription";
			public static final String GAME_LIST_LEFT_TOOLTIP_CATEGORY_TEXT = "#tltleft div.tltcenter div span.dtooltip";
			public static final String GAME_LIST_RIGHT_TOOLTIP_BOX = "#tltright";
			public static final String GAME_LIST_RIGHT_TOOLTIP_TEXT = "#tltright div.tltcenter div span.dtooltipDescription";
			public static final String GAME_LIST_RIGHT_TOOLTIP_CATEGORY_TEXT = "#tltright div.tltcenter div span.dtooltip";
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
	  public static final String SEARCH_BOX_TITLE = ".box";
	  public static final String SEARCHED_ELEMENT = ".box";
  }
}
