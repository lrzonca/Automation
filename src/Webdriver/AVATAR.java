package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AVATAR extends SeleniumBase{

	/** Avatar - check all controls
	* 
	* environment: live and stg
	**/
	@Test
	@Parameters({"xUrl"})
	public void Avatar1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Login Common");	
		Login("cookietest", "123456");		
		System.out.println("Find Element MY_PROFILE_LINK");
	    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    System.out.println("Click Element MY_PROFILE_LINK");
	    MyProfile.click();
	    System.out.println("Sleep 5 sek");
	    Thread.sleep(5000);
	    System.out.println("Find Element TAB_AVATAR");
	    WebElement AvatarTab = driver.findElement(By.cssSelector(Webdriver.mappings.avatar.TAB_AVATAR));
	    System.out.println("Click Element TAB_AVATAR");
	    AvatarTab.click();
	    System.out.println("Sleep 3 sek");
	    Thread.sleep(3000);
	    System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.avatar.AVATAR_TITLE_TEXT)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.avatar.CREATE_AVATAR_BUTTON)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.avatar.CREATE_AVATAR_GIRL_ICO)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.avatar.CREATE_AVATAR_HEADER_TEXT)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_BOX)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_ICO)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_WANT_IT_BUTTON)).size() == 1);
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.avatar.SECOND_AVATAR_BOX)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.avatar.SECOND_AVATAR_ICO)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.avatar.SECOND_AVATAR_WANT_IT_BUTTON)).size() == 1);
	}
	
	
	
	/** Avatar - change avatar and check if in my profile top bar is visible correct avatar 
	 * 
	 * environment: live and stg
    **/
	@Test
	@Parameters({"xUrl"})	
	public void Avatar2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Login Common");
		Login("mptest", "123456");		
		System.out.println("Find Element MY_PROFILE_LINK");
	    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    System.out.println("Click Element MY_PROFILE_LINK");
	    MyProfile.click();
	    System.out.println("Sleep 5 sek");
	    Thread.sleep(5000);	
	    System.out.println("Find Element TAB_AVATAR");
	    WebElement AvatarTab = driver.findElement(By.cssSelector(Webdriver.mappings.avatar.TAB_AVATAR));
	    System.out.println("Click Element TAB_AVATAR");
	    AvatarTab.click();
	    System.out.println("Sleep 3 sek");
	    Thread.sleep(3000);
		String avatar_active = "active", AvatarToCheck = "";
		String old_avatar = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.AVATAR_ICO)).getAttribute("src");
		System.out.println("Find Element AVATAR_ICO and take Attribute");
		if (avatar_active.equals(driver.findElement(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_BOX)).getAttribute("class"))){
			System.out.println("Find Element AVATAR_ICO and take Attribute");
			AvatarToCheck = driver.findElement(By.cssSelector(Webdriver.mappings.avatar.SECOND_AVATAR_ICO)).getAttribute("src");
			System.out.println("Find Element SECOND_AVATAR_BOX");
			WebElement SecAvBox = driver.findElement(By.cssSelector(Webdriver.mappings.avatar.SECOND_AVATAR_BOX));
			System.out.println("Click Element SECOND_AVATAR_BOX");
			SecAvBox.click();			
		} else {
			System.out.println("Find Element AVATAR_ICO and take Attribute");
			AvatarToCheck = driver.findElement(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_ICO)).getAttribute("src");
			System.out.println("Find Element FIRST_AVATAR_BOX");
			WebElement FirAvBox = driver.findElement(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_BOX));
			System.out.println("Click Element FIRST_AVATAR_BOX");
			FirAvBox.click();				
		}
		System.out.println("Sleep 3 sek");
		Thread.sleep(3000);
		String[] q = AvatarToCheck.split("/");
		System.out.println("Find Element AVATAR_ICO and take Attribute");
		String ab = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.AVATAR_ICO)).getAttribute("src");
		System.out.println("Find Element AVATAR_ICO and take Attribute");
		String ac = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.AVATAR_ICO)).getAttribute("src");
		ab.contains(q[8]);
		ac.contains(q[8]);
		System.out.println("Assertion");
		assertNotSame(old_avatar, driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.AVATAR_ICO)).getAttribute("src"));
	} 	
}