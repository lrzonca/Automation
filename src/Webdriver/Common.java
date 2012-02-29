package Webdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Parameters;

import junit.framework.TestCase;

public class Common extends TestCase implements mappings {
	public WebDriver driver;
	public static ChromeDriverService service;
	public String e, u, p, a, d, m, y;
	public String UN1 = "qwerty_friend_1";
	public String UP = "123456";
	public String UN2 = "qwerty_friend_3";	
	public Connection c, c_stg, c_event;	
	public String Game_id, Game_gid, Game_gamename_lid, Game_language_id, Game_url, Game_game_name, Game_game_description, Game_game_manual, Game_thumbnaill, Game_thumbnail2, Game_thumbnail3, Game_thumbnail_login, Game_gametype_id, Game_developer_id, Game_width, Game_height, Game_direct_on_frontpage, Game_direct_on_catpage, Game_direct_on_subcatpage, Game_downloadable, Game_highscore, Game_embedded, Game_overlay_add, Game_initial_rating, Game_active, Game_created, Game_modified, Game_onsite, Game_nice_name, Game_require_translation, Game_promotext, Game_translated_by, Game_translated_date, Game_achievements, Game_gallery, Game_using_service, Game_payments_enabled, Game_allow_links, Game_excluded, Game_scalable, Game_game_login_welcome_title, Game_login_welcome_description, Game_thumbnail_coins, Game_thumbnail_coins_show, Game_similar_box, Game_sign_in_popup_interval, siteUrl;
	
//	public WebElement findElement(String selector) throws InterruptedException {
//		return driver.findElement(By.id(selector));
//    }
    
    public WebElement findElement(String selector) throws InterruptedException {
    	return driver.findElement(By.cssSelector(selector.toString()));        
    }
     
    
//    public void clickElement(String selector) throws InterruptedException {
//    	System.out.println("Find and Click Element " + selector.toString());
//		findElement(selector).click();
//		sleep(2);
//    } 
    
    public void clickElement(String selector) throws InterruptedException {
    	System.out.println("Find and Click Element " + selector.toString());
		findElement(selector).click();
		sleep(2);
    } 
    
//    public void insertData(String selector, String data) throws InterruptedException{
//    	clickElement(selector);
//    	System.out.println("Insert data into Element " + selector.toString());
//    	findElement(selector).sendKeys(data);
//    } 
    
    public void insertData(String selector, String data) throws InterruptedException {
    	clickElement(selector);
    	System.out.println("Insert data into Element " + selector.toString());
    	findElement(selector).sendKeys(data);
    }     
    
//    public void assertIsDisplayed(CssSelector selector) throws InterruptedException {
//    	System.out.println("Assert if " + selector.toString() + " is Displayed");
//    	assertTrue(findElement(selector).isDisplayed());
//    }   
    
    public void assertIsDisplayed(String selector) throws InterruptedException {
    	System.out.println("Assert if " + selector.toString() + " is Displayed");
    	assertTrue(findElement(selector).isDisplayed());
    }   
    
//    public void assertIsNotDisplayed(CssSelector selector) throws InterruptedException {
//    	System.out.println("Assert if " + selector.toString() + " is Not Displayed");
//    	boolean check;
//    	try {
//    		findElement(selector).isDisplayed();
//    	    	check = true;
//    	} catch (Throwable e) {
//    		check = false;
//    	}    	    	
//    	assertFalse(check);
//    }   
    
    public void assertIsNotDisplayed(String selector) throws InterruptedException {
    	System.out.println("Assert if " + selector.toString() + " is Not Displayed");
    	boolean check;
    	if(findElement(selector).isDisplayed()){
    		check = true;	
    	} else {
    		check = false;	
		}    		    	
    	assertFalse(check);
    }    
    

	void assertEqualsCaseInsensitive(String expected, String actual) {
		  assertEquals(expected.toLowerCase(), actual.toLowerCase());
	  }
	
	void Wait_For_Object(int Time, Boolean Object) throws InterruptedException{
		System.out.println(Object);
		for (int i=0; i<Time; i++) {
			if(Object == false){
				Thread.sleep(1000);	
				System.out.println(i + " " + Object);
			} else {
				System.out.println("Wait Time for Object " + Object + " take " + i + " seconds.");
				break;
			}						
		}
	}
	
	void sleep(int sec) throws InterruptedException {
		System.out.println("Sleep " + sec + " sek");
		Thread.sleep(sec * 1000);
	}
	
	void Login (String UserName, String Password) throws InterruptedException{
		Logout();
		sleep(2);
		clickElement(signIn.SIGN_IN_LINK);
		insertData(signIn.USERNAME, UserName);
		insertData(signIn.PASSWORD, Password);
		sleep(2);
	    clickElement(signIn.SIGN_IN_BUTTON);	    
	    sleep(5);
	}
	
	void AssertTrue(Boolean Object) throws InterruptedException{
	    try{
	    	assertTrue(Object);
	    }
	    catch (Throwable e)
	    {
	    	e.printStackTrace();
	    	fail();
	    }		
	}

	
	public void Sign_Up(String e_1, String u_1, String p_1, String p2_1, String a_1) throws InterruptedException {
		Sign_Up_TEST(e_1, u_1, p_1, a_1);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_EMAIL_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_USERNAME_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_PASSWORD_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_AGE_VALID)).isDisplayed());
		WebElement signMeIn = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_SIGNMEUP));
		signMeIn.click();
		Thread.sleep(5000);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_WELCOME_TEXT)).isDisplayed());
		WebElement welcomeClose = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_WELCOME_CLOSE_BTN));
		welcomeClose.click();
		Thread.sleep(10000);
		assertEquals(this.u, driver.findElement(By.cssSelector(Webdriver.mappings.topBar.USERNAME_LINK)).getText());
	}

	public void Sign_Up2(String e_1, String u_1, String p_1, String p2_1, String a_1, String a_2, String a_3) throws InterruptedException {
		Sign_Up_TEST2(e_1, u_1, p_1, a_1, a_2, a_3);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_EMAIL_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_USERNAME_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_PASSWORD_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_DOB_VALID)).isDisplayed());
		WebElement signMeIn = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_SIGNMEUP));
		signMeIn.click();
		Thread.sleep(5000);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_WELCOME_TEXT)).isDisplayed());
		WebElement welcomeClose = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_WELCOME_CLOSE_BTN));
		welcomeClose.click();
		Thread.sleep(10000);
		assertEquals(this.u, driver.findElement(By.cssSelector(Webdriver.mappings.topBar.USERNAME_LINK)).getText());
	}	
	
	
	/* Description
	 * this sequence is filling data for user creation, user can be created with parameter e_1 - email, u_1 - username, p_1 - password, p2_1 - retype password, 
	 * dobd_1, dobm_1, doby_1 - date of birth, user can fill in this parameters and if this parameter are set then this data are filled in on page but also this 
	 * parameters could be leaved empty and then default values will be set on page
	 */
	public void Sign_Up_TEST(String e_1, String u_1, String p_1, String a_1) throws InterruptedException {
		Thread.sleep(8000);
		Logout();
		long timestamp = new Date().getTime();		
		if (e_1.isEmpty()){
			e = timestamp + "@google.com";
		} else {;
			if (e_1.contains("@")){
				e = e_1;
			} else {
				e = e_1 + timestamp + "@google.com";
			}
		}
		if (u_1.isEmpty()){
			u = "User" + timestamp;
		} else {
			if (u_1.equals("none")){
				u = "";
			} else {
				u = u_1;
			}			
		}	
		if (p_1.isEmpty()){
			p = "123456";
		} else { 
			p = p_1;
		}
		if (a_1.isEmpty()){
			a = "20";
		} else {
			a = a_1;
		}
		WebElement JoinNow = findElement(Webdriver.mappings.signUp.JOIN_NOW_LINK);
		JoinNow.click();
		WebElement email = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_EMAIL));
		email.sendKeys(e);
		WebElement name = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME));
		name.sendKeys(u);
		WebElement password = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_PASSWORD));
		password.sendKeys(p);	    
		WebElement age = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_AGE)); 
		age.sendKeys(a);
		WebElement AgeText = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.HOW_OLD_ARE_YOU));
		AgeText.click();
	}
	
	
	public void Sign_Up_TEST2(String e_1, String u_1, String p_1, String a_1, String a_2, String a_3) throws InterruptedException {
		Thread.sleep(8000);
		Logout();
		long timestamp = new Date().getTime();		
		if (e_1.isEmpty()){
			e = timestamp + "@google.com";
		} else {;
			if (e_1.contains("@")){
				e = e_1;
			} else {
				e = e_1 + timestamp + "@google.com";
			}
		}
		if (u_1.isEmpty()){
			u = "User" + timestamp;
		} else {
			if (u_1.equals("none")){
				u = "";
			} else {
				u = u_1;
			}			
		}	
		if (p_1.isEmpty()){
			p = "123456";
		} else { 
			p = p_1;
		}
		if (a_1.isEmpty()){
			m = "1";
		} else {
			m = a_1;
		}
		if (a_2.isEmpty()){
			d = "20";
		} else {
			d = a_2;
		}
		if (a_3.isEmpty()){
			y = "1950";
		} else {
			y = a_3;
		}			
		WebElement JoinNow = findElement(Webdriver.mappings.signUp.JOIN_NOW_LINK);
		JoinNow.click();
		WebElement email = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_EMAIL));
		email.sendKeys(e);
		WebElement name = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_USERNAME));
		name.sendKeys(u);
		WebElement password = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_PASSWORD));
		password.sendKeys(p);
		WebElement month = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_DOB_MONTH));
		month.findElement(By.cssSelector("option[value='"+ m + "']")).click();		
		WebElement day = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_DOB_DAY));
		day.findElement(By.cssSelector("option[value='"+ d + "']")).click();
		WebElement year = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_DOB_YEAR));
		year.findElement(By.cssSelector("option[value='"+ y + "']")).click();	
	}	

	
	/* Description
	 * this sequence is login out a user by clicking a Logout link but only if user is logged in
	 */
	public void Logout() throws InterruptedException {
		if (driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGOUT_LINK)).isDisplayed()){
			WebElement Logout = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGOUT_LINK));
			Logout.click();
			Thread.sleep(5000);
		} else {
		}				
//		Thread.sleep(5000);
	}
	
	
	void Open_User_X_Page (String xUrl, String u)throws InterruptedException {
		driver.get(xUrl + "/user/" + u);
	}
	
	void Friend_Request_Delete_Reject() throws InterruptedException {
		if (driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.DELETE_FRIEND_BUTTON)).getAttribute("style").equals("display: inline-block;")){
			WebElement Delete = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.DELETE_FRIEND_BUTTON));
			Delete.click();
			Thread.sleep(5000);
			WebElement Yes = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.DELETE_FRIEND_YES_BUTTON));
			Yes.click();
			Thread.sleep(2000);
		} else {
			if (driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.FRIEND_REQUEST_SENT_TEXT)).isDisplayed()){
				Logout();
				Login(UN2, UP);
			    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
			    MyProfile.click();
			    Thread.sleep(5000);
			    WebElement Notification = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.TAB_NOTIFICATIONS));
			    Notification.click();
			    Thread.sleep(5000);
			    WebElement Reject = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.REJECT_FRIEND_REQUEST_BUTTON));
			    Reject.click();
			    Thread.sleep(3000);
			    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.notifications.REJECTED_MESSAGE)).isDisplayed());
				Logout();
				Login(UN1, UP);			
			}
		}
	}
	
	
	/* Description
	 */
	public void Load_Harvesting_Contract(String email, String password) throws InterruptedException {
//		WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
//	    MyProfile.click();
//	    Thread.sleep(5000);
	    clickElement(topBar.MY_PROFILE_LINK);
//		WebElement TabFriend = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.TAB_FRIENDS));
//		TabFriend.click();
//	    Thread.sleep(5000);
	    clickElement(FRIENDS.TAB_FRIENDS);
//		WebElement HarvGetStart = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_GET_STARTED_BUTTON));
//		HarvGetStart.click();
//	    Thread.sleep(2000);
	    clickElement(FRIENDS.HARVESTING_GET_STARTED_BUTTON);
//		WebElement HarvGmailBtn = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_GMAIL_BUTTON));
//		HarvGmailBtn.click();
		clickElement(FRIENDS.HARVESTING_GMAIL_BUTTON);
//		WebElement HarvSignIn = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_SIGN_IN_BUTTON));
//		HarvSignIn.click();
		clickElement(FRIENDS.HARVESTING_SIGN_IN_BUTTON);
//	    Thread.sleep(15000);	    
		sleep(15);
	    System.out.println(driver.getWindowHandles().toString());
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    }	    
//	    WebElement HarvMail = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.EMAIL_TEXTBOX));
//	    HarvMail.click();
//	    HarvMail.sendKeys(email);
	    insertData(HARVESTING.EMAIL_TEXTBOX, email);
//	    WebElement HarvPass = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.PASSWORD_TEXTBOX));
//	    HarvPass.click();
//	    HarvPass.sendKeys(password);	   
	    insertData(HARVESTING.PASSWORD_TEXTBOX, password);
//	    WebElement HarvLogin = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.LOGIN_BUTTON));
//	    HarvLogin.click();
//	    sleep(5);
	    clickElement(HARVESTING.LOGIN_BUTTON);
	    sleep(5);
//	    WebElement HarvAllow = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.ALLOW_BUTTON));
//	    HarvAllow.click();
	    clickElement(HARVESTING.ALLOW_BUTTON);
	    Thread.sleep(10000);
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    }	    
	}
	
	
	/* Description
	 */
	@Parameters({"xUrl"})
	public void Load_Harvesting_Contract_From_Pet_Party(String xUrl, String email, String password) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);		
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		WebElement EmailTab = driver.findElement(By.id(Webdriver.mappings.social.FROM_EMAIL_TAB));
		EmailTab.click();
	    Thread.sleep(2000);
		WebElement GmailBtn = driver.findElement(By.cssSelector(Webdriver.mappings.social.FROM_EMAIL_GMAIL_BUTTON));
		GmailBtn.click();		
	    Thread.sleep(15000);	    
	    System.out.println(driver.getWindowHandles().toString());
	    for (String handle : driver.getWindowHandles()) {
	    	  driver.switchTo().window(handle);
	    	}	    
	    WebElement HarvMail = driver.findElement(By.id(Webdriver.mappings.HARVESTING.EMAIL_TEXTBOX));
	    HarvMail.click();
	    HarvMail.sendKeys(email);
	    WebElement HarvPass = driver.findElement(By.id(Webdriver.mappings.HARVESTING.PASSWORD_TEXTBOX));
	    HarvPass.click();
	    HarvPass.sendKeys(password);	   
	    WebElement HarvLogin = driver.findElement(By.id(Webdriver.mappings.HARVESTING.LOGIN_BUTTON));
	    HarvLogin.click();
	    WebElement HarvAllow = driver.findElement(By.id(Webdriver.mappings.HARVESTING.ALLOW_BUTTON));
	    HarvAllow.click();
	    Thread.sleep(10000);
	    for (String handle : driver.getWindowHandles()) {
	    	  driver.switchTo().window(handle);
	    	}	    
	}
	
	void Connect_DB(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			c=DriverManager.getConnection("jdbc:mysql://192.168.95.51:3306/automation", "automation", "siatkoweczka");
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException");
			} catch (SQLException e) {
				System.out.println("SQLException");
			} catch (Exception e) {
				System.out.println("Exception");
		}		
	}		

	/* Description
	 */
	void Disconnect_DB(){	 
		if (c != null) {
			try {
				c.close();
			} catch (Exception e) {
				System.out.println("Exception during closing DB connection");
			}
		}
	}	
	
	

	/* Description
	 */
	@Parameters({"xUrl"})
	public void GA_check(String xUrl, String siteName, int gaTimeout) throws InterruptedException {
		if (siteName.equals("homepage")){
			System.out.println("Open URL");
			driver.get(xUrl);
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
		}
		if (siteName.equals("categories")){
			System.out.println("Open URL");
			driver.get(xUrl);
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			System.out.println("Find Element ADVENTURE_GAMES");
			WebElement AdventureGame = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.ADVENTURE_GAMES));
			System.out.println("Click Element ADVENTURE_GAMES");
			AdventureGame.click();	
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
		}			
		if (siteName.equals("subcategories")){
			System.out.println("Open URL");
			driver.get(xUrl);
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			System.out.println("Find Element ADVENTURE_GAMES");
			WebElement AdventureGame = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.ADVENTURE_GAMES));
			System.out.println("Click Element ADVENTURE_GAMES");
			AdventureGame.click();	
			System.out.println("Find Element FIRST_AVAILABLE_SUBCATEGORY_LINK");
			WebElement SubCategory = driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_SUBCATEGORY_LINK));
			System.out.println("Click Element FIRST_AVAILABLE_SUBCATEGORY_LINK");
			SubCategory.click();
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
		}
		if (siteName.equals("search")){
			System.out.println("Open URL");
			driver.get(xUrl + "/search.html?search=pet+party");
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);					
		}	
		if (siteName.equals("staticsites")){
			System.out.println("Open URL");
			driver.get(xUrl);
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			System.out.println("Find Element TERMS_OF_USE");
			WebElement TermsOfUse = findElement(footer.TERMS_OF_USE);
			System.out.println("Click Element TERMS_OF_USE");
			TermsOfUse.click();	
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
		}
		if (siteName.equals("gameshighscore")){
			System.out.println("Open URL");
			driver.get(xUrl);
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			System.out.println("Find Element HIGHSCORE_LEFT_NAVI_LINK");
			WebElement Highscore = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.HIGHSCORE_LEFT_NAVI_LINK));
			System.out.println("Click Element HIGHSCORE_LEFT_NAVI_LINK");
			Highscore.click();	
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			String site = driver.getCurrentUrl();
			if (xUrl.contains("stg.")){
				site = site.replace("www", "stg");
				System.out.println("Open URL");
				driver.get(site);
				System.out.println("Sleep 2 sek");
				Thread.sleep(2000);
			}
		}	
		if (siteName.equals("newgames")){
			System.out.println("Open URL");
			driver.get(xUrl);
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			System.out.println("Find Element GAMES_FOR_GIRLS_NAVI_LINK");
			WebElement NewGame = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.GAMES_FOR_GIRLS_NAVI_LINK));
			System.out.println("Click Element GAMES_FOR_GIRLS_NAVI_LINK");
			NewGame.click();
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
		}
		if (siteName.equals("awardgames")){
			System.out.println("Open URL");
			driver.get(xUrl);
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			System.out.println("Find Element AWARD_GAMES_LEFT_NAVI_LINK");
			WebElement AwardGames = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.AWARD_GAMES_LEFT_NAVI_LINK));
			System.out.println("Click Element AWARD_GAMES_LEFT_NAVI_LINK");
			AwardGames.click();
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			String site = driver.getCurrentUrl();
			if (xUrl.contains("stg.")){
				site = site.replace("www", "stg");
				System.out.println("Open URL");
				driver.get(site);
				System.out.println("Sleep 2 sek");
				Thread.sleep(2000);
			}
		}				
		if (siteName.equals("flatpages")){
			System.out.println("Open URL");
			driver.get(xUrl + "/snoring-walkthrough.html");
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
		}
		if (siteName.equals("tags")){
			System.out.println("Open URL");
			driver.get(xUrl);
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			System.out.println("Find Element SECOND_AVAILABLE_GAME_CATEGORY_LEFT_NAVI_LINK");
			WebElement Highscore = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.SECOND_AVAILABLE_GAME_CATEGORY_LEFT_NAVI_LINK));
			System.out.println("Click Element SECOND_AVAILABLE_GAME_CATEGORY_LEFT_NAVI_LINK");
			Highscore.click();	
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			System.out.println("Find Element FIRST_AVAILABLE_TAG_LINK");
			WebElement TagLink = driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_TAG_LINK));
			System.out.println("Click Element FIRST_AVAILABLE_TAG_LINK");
			TagLink.click();
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
		}				
//		if (siteName.equals("userprofile-registrationform")){
//			Open_User_Profile_Registration_Page(environment, site_url);
//		}		
		if (siteName.equals("userprofile")){
			driver.get(xUrl);
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			System.out.println("Login Common");
			if (xUrl.contains("www")){
				Login("cookietest", "123456");	
			} else {
				Login("marlacom103", "123456");	
			}		
			System.out.println("Find Element MY_PROFILE_LINK");
		    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
		    System.out.println("Click Element MY_PROFILE_LINK");
		    MyProfile.click();
		    System.out.println("Sleep 10 sek");
		    Thread.sleep(10000);
		}
		if (siteName.equals("seosites")){
			System.out.println("Open URL");
			driver.get(xUrl);
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
			System.out.println("Find Element POPULAR_GAMES_NAVI_LINK");
			WebElement PopularGames = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.POPULAR_GAMES));
			System.out.println("Click Element POPULAR_GAMES_NAVI_LINK");
			PopularGames.click();	
			System.out.println("Sleep 2 sek");
			Thread.sleep(2000);
		}				
//		if (siteName.startsWith("games-")){
//			Open_Games_Page(environment, site_url);
//			siteName = "games-";
//			siteName = siteName + gameID;
//		}		
		System.out.println("Get Page source");
		String url = driver.getCurrentUrl();
		System.out.println("URL " + url);
		System.out.println("Get Page source");
		String html = driver.getPageSource();
		String spilTrackerHeader;
		if (xUrl.contains("stg.")){
			spilTrackerHeader = "window._gaPageType = '" + siteName + "';";
		} else {
			spilTrackerHeader = "window._gaPageType='" + siteName + "';";
		}						
		System.out.println(spilTrackerHeader);
		String spilTrackerHeader2;
		if (xUrl.contains("stg.")){
			spilTrackerHeader2 = "window._ttIdle = " + gaTimeout +";";	
		} else {
			spilTrackerHeader2 = "window._ttIdle=" + gaTimeout +";";
		}				
		System.out.println(spilTrackerHeader2);
		System.out.println("Assertion");
		AssertTrue(html.contains(spilTrackerHeader));
		System.out.println("Assertion");
		AssertTrue(html.contains(spilTrackerHeader2));
		String spilTracker = "spilTracker('','UA-2428329-1','girlsgogames.com');";
		System.out.println(spilTracker);
		String spilTracker2;
		if (xUrl.contains("stg.")){
			spilTracker2 = "spilTracker('aggregated', 'UA-8223336-1', 'spilgames.com');";
		} else {
			spilTracker2 = "spilTracker('aggregated','UA-8223336-1','spilgames.com');";
		}				
		System.out.println(spilTracker2);
		System.out.println("Assertion");
		AssertTrue(html.contains(spilTracker));
		System.out.println("Assertion");
		AssertTrue(html.contains(spilTracker2));		
	}	
	
	
	void Get_Games_Parameter_From_DB(String sql){	 		   
		Connect_STG_DB(); 
		try{
			Statement user_sg=c_stg.createStatement();
			ResultSet user_rg=user_sg.executeQuery(sql);
			while (user_rg.next()) {		
				Game_id = user_rg.getString(1);
				Game_gid = user_rg.getString(2);
				Game_gamename_lid = user_rg.getString(3);
				Game_language_id = user_rg.getString(4);
				Game_url = user_rg.getString(5);
				Game_game_name = user_rg.getString(6);
				Game_game_description = user_rg.getString(7);
				Game_game_manual = user_rg.getString(8);
				Game_thumbnaill = user_rg.getString(9);
				Game_thumbnail2 = user_rg.getString(10);
				Game_thumbnail3 = user_rg.getString(11);
				Game_thumbnail_login = user_rg.getString(12);
				Game_gametype_id = user_rg.getString(13);
				Game_developer_id = user_rg.getString(14);
				Game_width = user_rg.getString(15);
				Game_height = user_rg.getString(16);
				Game_direct_on_frontpage = user_rg.getString(17);
				Game_direct_on_catpage = user_rg.getString(18);
				Game_direct_on_subcatpage = user_rg.getString(19);
				Game_downloadable = user_rg.getString(20);
				Game_highscore = user_rg.getString(21);
				Game_embedded = user_rg.getString(22);
				Game_overlay_add = user_rg.getString(23);
				Game_initial_rating = user_rg.getString(24);
				Game_active = user_rg.getString(25);
//				Game_created = user_rg.getString(26);
//				Game_modified = user_rg.getString(27);
//				Game_onsite = user_rg.getString(28);
				Game_nice_name = user_rg.getString(29);
				Game_require_translation = user_rg.getString(30);
				Game_promotext = user_rg.getString(31);
				Game_translated_by = user_rg.getString(32);
				Game_translated_date = user_rg.getString(33);
				Game_achievements = user_rg.getString(34);
				Game_gallery = user_rg.getString(35);
				Game_using_service = user_rg.getString(36);
				Game_payments_enabled = user_rg.getString(37);
				Game_allow_links = user_rg.getString(38);
				Game_excluded = user_rg.getString(39);
				Game_scalable = user_rg.getString(40);
				Game_game_login_welcome_title = user_rg.getString(41);
				Game_login_welcome_description = user_rg.getString(42);
				Game_thumbnail_coins = user_rg.getString(43);
				Game_thumbnail_coins_show = user_rg.getString(44);
				Game_similar_box = user_rg.getString(45);
				Game_sign_in_popup_interval = user_rg.getString(46);
				System.out.println("Game_id = " + Game_id);
				System.out.println("Game_gid = " + Game_gid);
				System.out.println("Game_gamename_lid = " + Game_gamename_lid);
				System.out.println("Game_language_id = " + Game_language_id);
				System.out.println("Game_url = " + Game_url);
				System.out.println("Game_game_name = " + Game_game_name);
				System.out.println("Game_game_description = " + Game_game_description);
				System.out.println("Game_game_manual = " + Game_game_manual);
				System.out.println("Game_thumbnaill = " + Game_thumbnaill);
				System.out.println("Game_thumbnail2 = " + Game_thumbnail2);
				System.out.println("Game_thumbnail3 = " + Game_thumbnail3);
				System.out.println("Game_thumbnail_login = " + Game_thumbnail_login);
				System.out.println("Game_gametype_id = " + Game_gametype_id);
				System.out.println("Game_developer_id" + Game_developer_id);
				System.out.println("Game_width = " + Game_width);
				System.out.println("Game_height = " + Game_height);
				System.out.println("Game_direct_on_frontpage = " + Game_direct_on_frontpage);
				System.out.println("Game_direct_on_catpage = " + Game_direct_on_catpage);
				System.out.println("Game_direct_on_subcatpage = " + Game_direct_on_subcatpage);
				System.out.println("Game_downloadable = " + Game_downloadable);
				System.out.println("Game_highscore = " + Game_highscore);
				System.out.println("Game_embedded = " + Game_embedded);
				System.out.println("Game_overlay_add = " + Game_overlay_add);
				System.out.println("Game_initial_rating = " + Game_initial_rating);
				System.out.println("Game_active = " + Game_active);
//				System.out.println("Game_created = " + Game_created);
//				System.out.println("Game_modified = " + Game_modified);
//				System.out.println("Game_onsite = " + Game_onsite);
				System.out.println("Game_nice_name = " + Game_nice_name);
				System.out.println("Game_require_translation = " + Game_require_translation);
				System.out.println("Game_promotext = " + Game_promotext);
				System.out.println("Game_translated_by = " + Game_translated_by);
				System.out.println("Game_translated_date = " + Game_translated_date);
				System.out.println("Game_achievements = " + Game_achievements);
				System.out.println("Game_gallery = " + Game_gallery);
				System.out.println("Game_using_service = " + Game_using_service);
				System.out.println("Game_payments_enabled = " + Game_payments_enabled);
				System.out.println("Game_allow_links = " + Game_allow_links);
				System.out.println("Game_excluded = " + Game_excluded);
				System.out.println("Game_scalable = " + Game_scalable);
				System.out.println("Game_game_login_welcome_title = " + Game_game_login_welcome_title);
				System.out.println("Game_login_welcome_description = " + Game_login_welcome_description);
				System.out.println("Game_thumbnail_coins = " + Game_thumbnail_coins);
				System.out.println("Game_thumbnail_coins_show = " + Game_thumbnail_coins_show);
				System.out.println("Game_similar_box = " + Game_similar_box);
				System.out.println("Game_sign_in_popup_interval = " + Game_sign_in_popup_interval);
			}
		} catch (Exception e) {
			System.out.println("SQL query execution");	
		}	   
		Disconnect_STG_DB();
	}		

	/* Description
	 */
	void Connect_STG_DB(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			c_stg=DriverManager.getConnection("jdbc:mysql://192.168.95.51:3306/girls", "l_rzonca", "monitorsamsung");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
		} catch (SQLException e) {
			System.out.println("SQLException");
		} catch (Exception e) {
			System.out.println("Exception");
		}		
	}		
	
	/* Description
	 */
	void Disconnect_STG_DB(){	 
		if (c_stg != null) {
			try {
				c_stg.close();
			} catch (Exception e) {
				System.out.println("Exception during closing DB connection");
			}
		}
	}	
	
	/* Description
	 */
	void SitesUrl(String site_id) throws InterruptedException {	 
		if (site_id.equals("es-ar")){
			siteUrl = "http://www.juegosdechicas.com/";
		}
		if (site_id.equals("pt-br")){
			siteUrl = "http://www.girlsgogames.com.br/";
		}
		if (site_id.equals("es-cl")){
			siteUrl = "http://www.juegosdechicas.com/";
		}
		if (site_id.equals("es-co")){
			siteUrl = "http://www.juegosdechicas.com/";
		}
		if (site_id.equals("de-de")){
			siteUrl = "http://www.girlsgogames.de/";
		}
		if (site_id.equals("es-es")){
			siteUrl = "http://www.juegosdechicas.com/";
		}
		if (site_id.equals("fr-fr")){
			siteUrl = "http://www.girlsgogames.fr/";
		}
		if (site_id.equals("en-id")){
			siteUrl = "http://www.girlsgogames.co.id/";
		}
		if (site_id.equals("it-it")){
			siteUrl = "http://www.girlsgogames.it/";
		}
		if (site_id.equals("es-mx")){
			siteUrl = "http://www.juegosdechicas.com/";
		}
		if (site_id.equals("nl-nl")){
			siteUrl = "http://www.girlsgogames.nl/";
		}
		if (site_id.equals("pl-pl")){
			siteUrl = "http://www.girlsgogames.pl/";
		}
		if (site_id.equals("ru-ru")){
			siteUrl = "http://www.girlsgogames.ru/";
		}
		if (site_id.equals("sv-se")){
			siteUrl = "http://www.girlsgogames.se/";
		}
		if (site_id.equals("tr-tr")){
			siteUrl = "http://www.girlsgogames.com.tr/";
		}
		if (site_id.equals("en-gb")){
			siteUrl = "http://www.girlsgogames.co.uk/";
		}
		if (site_id.equals("en-us")){
			siteUrl = "http://www.girlsgogames.com/";
		}
		if (site_id.equals("es-ve")){
			siteUrl = "http://www.juegosdechicas.com/";
		}		
	}		
	
	
	// =====================================
	// ===== HYVES SECTION =================
	//======================================
	
	@Parameters({"xUrl", "xUsername", "xPass"})
	public void NavigateToGamePage(String xUrl, String xUsername, String xPass) throws Exception{
		driver.get(xUrl);
	    Thread.sleep(3000);
	    WebElement UsernameF = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.USERNAME_FIELD));
	    UsernameF.sendKeys(xUsername);
	    WebElement PasswordF = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.PASSWORD_FIELD));
	    PasswordF.sendKeys(xPass);
	    WebElement LoginB = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.LOGIN_BUTTON));
	    LoginB.click();
	    Thread.sleep(5000);
	    if (xUrl.contains("dev")){
	    	driver.get(xUrl);
	    }
	    driver.switchTo().frame("remote_iframe_-1");
	}
}