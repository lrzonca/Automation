package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class AVATAR extends SeleniumBase{

	/* Avatar - check all controls
	* 
	* environment: live and stg
	*/
	@Test
	@Parameters({"xUrl"})
	public void Avatar1(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(5000);		
		Login("cookietest", "123456");		
	    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(8000);		
	    WebElement AvatarTab = driver.findElement(By.id(Webdriver.mappings.avatar.TAB_AVATAR));
	    AvatarTab.click();
	    Thread.sleep(3000);
	    driver.findElement(By.id(Webdriver.mappings.avatar.AVATAR_TITLE_TEXT)).isDisplayed();
		driver.findElement(By.id(Webdriver.mappings.avatar.CREATE_AVATAR_BUTTON)).isDisplayed();
		driver.findElement(By.id(Webdriver.mappings.avatar.CREATE_AVATAR_GIRL_ICO)).isDisplayed();
		driver.findElement(By.id(Webdriver.mappings.avatar.CREATE_AVATAR_HEADER_TEXT)).isDisplayed();
		driver.findElement(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_BOX)).isDisplayed();
		driver.findElement(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_ICO)).isDisplayed();
		driver.findElement(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_WANT_IT_BUTTON)).isDisplayed();
		driver.findElement(By.cssSelector(Webdriver.mappings.avatar.SECOND_AVATAR_BOX)).isDisplayed();
		driver.findElement(By.cssSelector(Webdriver.mappings.avatar.SECOND_AVATAR_ICO)).isDisplayed();
		driver.findElement(By.cssSelector(Webdriver.mappings.avatar.SECOND_AVATAR_WANT_IT_BUTTON)).isDisplayed();
	}
	
	
	
	/* Avatar - change avatar and check if in my profile top bar is visible correct avatar 
	 * 
	 * environment: live and stg
    */
	@Test
	@Parameters({"xUrl"})	
	public void Avatar2(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(5000);		
		Login("mptest", "123456");		
	    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(8000);		
	    WebElement AvatarTab = driver.findElement(By.id(Webdriver.mappings.avatar.TAB_AVATAR));
	    AvatarTab.click();
	    Thread.sleep(3000);
		String avatar_active = "active", AvatarToCheck = "";
		String old_avatar = driver.findElement(By.id(Webdriver.mappings.myProfile.AVATAR_ICO)).getAttribute("src");
		System.out.println("old_avatar " + old_avatar);
		if (avatar_active.equals(driver.findElement(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_BOX)).getAttribute("class"))){
			AvatarToCheck = driver.findElement(By.cssSelector(Webdriver.mappings.avatar.SECOND_AVATAR_ICO)).getAttribute("src");
			WebElement SecAvBox = driver.findElement(By.cssSelector(Webdriver.mappings.avatar.SECOND_AVATAR_BOX));
			SecAvBox.click();			
		} else {
			AvatarToCheck = driver.findElement(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_ICO)).getAttribute("src");
			WebElement FirAvBox = driver.findElement(By.cssSelector(Webdriver.mappings.avatar.FIRST_AVATAR_BOX));
			FirAvBox.click();				
		}
		System.out.println("AvatarToCheck " + AvatarToCheck);
		Thread.sleep(3000);
		String[] q = AvatarToCheck.split("/");
		System.out.println("q " + q[8]);
		String ab = driver.findElement(By.id(Webdriver.mappings.myProfile.AVATAR_ICO)).getAttribute("src");
		System.out.println("ab " + ab);
		String ac = driver.findElement(By.id(Webdriver.mappings.topBar.AVATAR_ICO)).getAttribute("src");
		System.out.println("ac " + ac);
		ab.contains(q[8]);
		ac.contains(q[8]);
		assertNotSame(old_avatar, driver.findElement(By.id(Webdriver.mappings.myProfile.AVATAR_ICO)).getAttribute("src"));
	} 	
}

