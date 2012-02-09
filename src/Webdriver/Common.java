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
	public String e, u, p, a;
	public String UN1 = "qwerty_friend_1";
	public String UP = "123456";
	public String UN2 = "qwerty_friend_3";	
	public Connection c, c_stg, c_event;	
	
   public WebElement findElement(String selector) {
        return driver.findElement(By.id(selector));
    }
    
    public WebElement findElement(CssSelector selector) {
        return driver.findElement(By.cssSelector(selector.toString()));
        
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
	
	void Login (String UserName, String Password) throws InterruptedException{
		System.out.println("Sleep 8 sek");
		Thread.sleep(8000);
		System.out.println("Find Element SIGN_IN_LINK");
		WebElement loginLink = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_LINK));
		System.out.println("Click Element SIGN_IN_LINK");
		loginLink.click();
		System.out.println("Find Element USERNAME");
		WebElement usernameBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.USERNAME));
		System.out.println("Click Element USERNAME");
		usernameBox.click();
		System.out.println("Insert data into Element USERNAME");
	    usernameBox.sendKeys(UserName);
	    System.out.println("Find Element PASSWORD");
	    WebElement passwordBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.PASSWORD));
	    System.out.println("Click Element PASSWORD");
	    passwordBox.click();
	    System.out.println("Insert data into Element PASSWORD");
	    passwordBox.sendKeys(Password);
	    System.out.println("Sleep 2 sek");
	    Thread.sleep(2000);
	    System.out.println("Find Element SIGN_IN_BUTTON");
	    WebElement signInButton = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_BUTTON));
	    System.out.println("Click Element SIGN_IN_BUTTON");
	    signInButton.click();
	    System.out.println("Sleep 5 sek");
	    Thread.sleep(5000);
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
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_EMAIL_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_PASSWORD_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_AGE_VALID)).isDisplayed());
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
		}		
		if (driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.FRIEND_REQUEST_SENT_TEXT)).isDisplayed()){
			Logout();
			Login(UN2, UP);
		    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
		    MyProfile.click();
		    Thread.sleep(5000);
		    WebElement Notification = driver.findElement(By.id(Webdriver.mappings.NOTIFICATIONS.TAB_NOTIFICATIONS));
		    Notification.click();
		    Thread.sleep(5000);
		    WebElement Reject = driver.findElement(By.cssSelector(Webdriver.mappings.NOTIFICATIONS.REJECT_FRIEND_REQUEST_BUTTON));
		    Reject.click();
		    Thread.sleep(3000);
		    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.NOTIFICATIONS.REJECTED_MESSAGE)).isDisplayed());
			Logout();
			Login(UN1, UP);			
		}
	}
	
	
	/* Description
	 */
	public void Load_Harvesting_Contract(String email, String password) throws InterruptedException {
		WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
		WebElement TabFriend = driver.findElement(By.id(Webdriver.mappings.FRIENDS.TAB_FRIENDS));
		TabFriend.click();
	    Thread.sleep(5000);
		WebElement HarvGetStart = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_GET_STARTED_BUTTON));
		HarvGetStart.click();
	    Thread.sleep(2000);
		WebElement HarvGmailBtn = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_GMAIL_BUTTON));
		HarvGmailBtn.click();
		WebElement HarvSignIn = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_SIGN_IN_BUTTON));
		HarvSignIn.click();
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
	public void GA_check(String xUrl, String siteName, int gaTimeout) throws Throwable {
		Connect_DB();
		try{
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("SELECT `site_url`, site_id FROM sites WHERE `concept` = 'GIRLS'");			
			while (r.next()) {
				String site_url =  r.getString(1);
				int site_id =  r.getInt(2);				
				String url_change = xUrl;
//				selenium.setContext(url_change);			
//				selenium.deleteAllVisibleCookies();
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
				}
				if (siteName.equals("search")){
					System.out.println("Open URL");
					driver.get(xUrl + "/search.html?search=");
					System.out.println("Sleep 2 sek");
					Thread.sleep(2000);					
				}	
				if (siteName.equals("staticsites")){
					System.out.println("Open URL");
					driver.get(xUrl);
					System.out.println("Sleep 2 sek");
					Thread.sleep(2000);
					System.out.println("Find Element TERMS_OF_USE");
					WebElement TermsOfUse = driver.findElement(By.cssSelector(Webdriver.mappings.footer.TERMS_OF_USE));
					System.out.println("Click Element TERMS_OF_USE");
					TermsOfUse.click();	
				}
				if (siteName.equals("highscoregames")){
					System.out.println("Open URL");
					driver.get(xUrl);
					System.out.println("Sleep 2 sek");
					Thread.sleep(2000);
					System.out.println("Find Element HIGHSCORE_LEFT_NAVI_LINK");
					WebElement Highscore = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.HIGHSCORE_LEFT_NAVI_LINK));
					System.out.println("Click Element HIGHSCORE_LEFT_NAVI_LINK");
					Highscore.click();						
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
				}
				if (siteName.equals("awardgames")){
					Open_Award_Games_Page(environment, site_url);					
				}				
				if (siteName.equals("flatpages")){
					Open_Flat_Pages(environment, site_url);
				}
				if (siteName.equals("tags")){
					Open_Tags_Page(environment, site_url);
				}				
				if (siteName.equals("userprofile-registrationform")){
					Open_User_Profile_Registration_Page(environment, site_url);
				}		
				if (siteName.equals("userprofile")){
					Open_User_Profile_Page(environment, site_url);
				}
				if (siteName.equals("seosites")){
					Open_Popular_Games_Page(environment, site_url);
				}				
				if (siteName.startsWith("games-")){
					Open_Games_Page(environment, site_url);
					siteName = "games-";
					siteName = siteName + gameID;
				}	
				Wait(2000);
//				open correct page here		
				String html = selenium.getHtmlSource();
				Statement st=c.createStatement();
				ResultSet rs=st.executeQuery("SELECT g.`inclusion_value` FROM `sites` s INNER JOIN `google_analytics` g ON s.`site_id` = g.`site_id` WHERE s.`site_id` = " + site_id + " AND g.`inclusion_name` LIKE 'google_analytics_ua_code%'");
				while (rs.next()) { // process results one row at a time
					UA = rs.getString(1);
//					if (environment.equals("stg.pl")){
//						String spilTrackerHeader = "window._gaPageType = '" + siteName + "';";
//						String spilTrackerHeader2 = "window._ttIdle = " + gaTimeout +";";
//						selenium.setContext(spilTrackerHeader);
//						selenium.setContext(spilTrackerHeader2);
//						selenium.setContext("current URL:"+ selenium.getLocation());
//						assertTrue(html.contains(spilTrackerHeader.trim()));
//						assertTrue(html.contains(spilTrackerHeader2.trim()));						
//						String spilTracker = "spilTracker('','" + UA.trim() + "','" + site_url + "');";
//						String spilTracker2 = "spilTracker('aggregated', 'UA-8223336-1', 'spilgames.com');";
//						selenium.setContext("Value: " + spilTracker);
//						selenium.setContext("Value: " + spilTracker2);
//						assertTrue(html.contains(spilTracker.trim()));
//						assertTrue(html.contains(spilTracker2.trim()));
//					} else {
					
						//delete
//						String spilTrackerHeader = "window._gaPageType = '" + siteName + "';window._ttIdle = " + gaTimeout +";";
//						selenium.setContext(spilTrackerHeader);
//						selenium.setContext("current URL:"+ selenium.getLocation());
//						assertTrue(html.contains(spilTrackerHeader.trim()));
//						String spilTracker = "{spilTracker('','" + UA.trim() + "','" + site_url + "');spilTracker('aggregated','UA-8223336-1','spilgames.com');}";
//						selenium.setContext("Value: " + spilTracker);
//						assertTrue(html.contains(spilTracker.trim()));
						//end delete
					
						String spilTrackerHeader = "window._gaPageType='" + siteName + "';";
						String spilTrackerHeader2 = "window._ttIdle=" + gaTimeout +";";
						selenium.setContext(spilTrackerHeader);
						selenium.setContext(spilTrackerHeader2);
						selenium.setContext("current URL:"+ selenium.getLocation());
						assertTrue(html.contains(spilTrackerHeader.trim()));
						assertTrue(html.contains(spilTrackerHeader2.trim()));						
						String spilTracker = "spilTracker('','" + UA.trim() + "','" + site_url + "');";
						String spilTracker2 = "spilTracker('aggregated','UA-8223336-1','spilgames.com');";
						selenium.setContext("Value: " + spilTracker);
						selenium.setContext("Value: " + spilTracker2);
						assertTrue(html.contains(spilTracker.trim()));
						assertTrue(html.contains(spilTracker2.trim()));
//					}					
				}										
			}
			} catch (Exception e) {
				selenium.setContext("SQL query execution or GA failed");
				assertEquals("1", "2");
		}				
		Disconnect_DB();			
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