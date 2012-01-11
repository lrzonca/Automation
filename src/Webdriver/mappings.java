package Webdriver;
//import org.testng.annotations.Test;

public interface mappings {
  
  public interface signUp {
	  public static final String JOIN_NOW_LINK = ".tc-register-url";
	  public static final String REGISTER_EMAIL = "sgRegMail";
	  public static final String REGISTER_EMAIL_VALID = "email_validationCorrectImage";
	  public static final String REGISTER_EMAIL_NOT_VALID= "email_validationErrorImage";
	  public static final String REGISTER_USERNAME = "sgRegUsername";
	  public static final String REGISTER_USERNAME_VALID = "username_validationCorrectImage";
	  public static final String REGISTER_USERNAME_NOT_VALID  = "username_validationErrorImage";
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
	  public static final String SIGN_IN_LINK = ".tc-login-url";
	  public static final String USERNAME = ".tc-username-text";
	  public static final String PASSWORD = ".tc-password-text";
	  public static final String SIGN_IN_BUTTON = ".login_button a";
	  public static final String LOGGED_USERNAME = ".tc-username-cnt";
	  public static final String WHOLE_POPUP = "fb_loginbox_main";
	  public static final String ERROR_MESSAGE = ".tc-error-message-notauth";
	  public static final String REMEMBER_CHECKBOX = ".tc-remember-check";
	  public static final String LOGOUT_LINK = ".tc-logout-url";
  }  
  
  public interface leftNavi {
	  public static final String ADVENTURE_GAMES = ".tc_ln_category_458";
  }  
  
  public interface categoryPage {
	  public static final String SUBCATEGORY_GAME_LIST = "subcatList";
	  public static final String FIRST_AVAILABLE_SUBCATEGORY_LINK = ".gameStack:nth-child(1) a";
	  public static final String TOP_HOME_PAGE_LINK = ".categoryBreadcrumb a:nth-child(1)";
	  public static final String TOP_CATEGORY_LINK = ".categoryBreadcrumb a:nth-child(2)";
	  public static final String TOP_ACTIVE_PAGE = ".categoryBreadcrumb span";
  } 
  
  public interface subcategoryPage {
	  public static final String FIRST_AVAILABLE_GAME_LINK = ".gameList li:nth-child(1) div:nth-child(2) a";  
  }
  
  public interface social {
	  public static final String SOCIAL_GAME_BOX = "socialgame";
	  public static final String SOCIAL_GAME = "container";
	  public static final String SOCIAL_GAME_HEADER_TEXT = "promobar";
	  public static final String SOCIAL_GAME_PLAY_BUTTON = "button1";
	  public static final String SOCIAL_GAME_INVITE_BUTTON = "button2";
	  public static final String SOCIAL_GAME_GET_SAPPHIRES_BUTTON = "button5";
	  public static final String SOCIAL_GAME_HELP_BUTTON = "button6";	 
  }
  
  public interface gamepage {
	  public static final String GAME_CONTAINTER_SHOCKWAVE = "flashobj_mc";
	  public static final String GAME_CONTAINTER_IFRAME = "gameiframe_js";
  }
  
  public interface topBar {
	  public static final String USERNAME_LINK = ".tc-username-cnt";
	  public static final String MY_PROFILE_LINK = ".tc-un_myprofile";
  }
  
  public interface footer {
	  public static final String TERMS_OF_USE = ".middleWaveLinks a:nth-child(1)";
  }
  
  public interface myProfile {
	  public static final String LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON = ".tc_all_activities";
	  public static final String LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON = ".tc_my_activities";
	  public static final String LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON = ".tc_wall_messages";
	  public static final String LAST_MESSAGE_CONTAINER = ".messages ul li:nth-child(1) div.activity-container";
  }
  
  public interface flatPage {
	  public static final String FLAT_PAGE_CONTAINER = "staticContainer";
	  public static final String FLAT_PAGE_HEADER = ".categoryHeader";
	  public static final String FLAT_PAGE_ADVERT = ".newSkyContainer";
  }
  
  public interface hyves {
	  public static final String USERNAME_FIELD = "#auth_username";
	  public static final String PASSWORD_FIELD = "#auth_password";
	  public static final String LOGIN_BUTTON = "#login-btn";
	  public static final String GAMES_LINK = "li#menu-games a.sub-menu-title";
	  public static final String SOCIAL_LINK = "a#social_link";
  }
}
