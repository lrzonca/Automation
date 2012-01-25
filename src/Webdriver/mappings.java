package Webdriver;
import org.testng.annotations.Test;

public class mappings {
  
  public interface signUp {
	  public static final String JOIN_NOW_LINK = ".tc-register-url";
	  public static final String REGISTER_EMAIL = "sgRegMail";
	  public static final String REGISTER_EMAIL_VALID = "email_validationCorrectImage";
	  public static final String REGISTER_USERNAME = "sgRegUsername";
	  public static final String REGISTER_USERNAME_VALID = "username_validationCorrectImage";
	  public static final String REGISTER_PASSWORD = "sgRegPassword";
	  public static final String REGISTER_PASSWORD_VALID = "password_validationCorrectImage";
	  public static final String REGISTER_AGE = "sgRegAge";
	  public static final String REGISTER_AGE_VALID = "age_validationCorrectImage";
	  public static final String REGISTER_SIGNMEUP = ".sg-reg-save-btn";
	  public static final String REGISTER_WELCOME_TEXT = ".reg-confirm-user";
	  public static final String REGISTER_WELCOME_CLOSE_BTN = ".socialClose";
	  
  }
  public interface topBar {
	  public static final String USERNAME_LINK = ".tc-username-cnt";
  }
  
  public interface hyves {
	  public static final String USERNAME_FIELD = "#auth_username";
	  public static final String PASSWORD_FIELD = "#auth_password";
	  public static final String LOGIN_BUTTON = "#login-btn";
	  public static final String GAMES_LINK = "li#menu-games a.sub-menu-title";
	  public static final String SOCIAL_LINK = "a#social_link";
	  public static final String SEARCH_FIELD = "#searchInput";
	  public static final String SEARCH_BUTTON = "#searchButton";
	  public static final String SEARCH_BOX_TITLE = ".box";
	  public static final String SEARCHED_ELEMENT = ".box";
  }
}
