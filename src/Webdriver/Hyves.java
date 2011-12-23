package Webdriver;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;

import junit.framework.Assert;


import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)

public class Hyves extends SeleniumBase{
  @Test
  @Parameters({"xUrl"})
  public void openGamePage(String xUrl) throws InterruptedException {
	  driver.get(xUrl);
	    Thread.sleep(3000);
	    WebElement UsernameF = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.USERNAME_FIELD));
	    UsernameF.sendKeys("mptest");
	    WebElement PasswordF = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.PASSWORD_FIELD));
	    PasswordF.sendKeys("mptest123");
	    WebElement LoginB = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.LOGIN_BUTTON));
	    LoginB.click();
	    Thread.sleep(1000);
	    WebElement GameT = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.GAMES_LINK));
	    GameT.click();
	    Thread.sleep(2000);
	    driver.switchTo().frame("remote_iframe_-1");
	    WebElement MultiplayerT = driver.findElement(By.id("multiplayer_link"));
	    //WebElement SocialT = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SOCIAL_LINK));
	    MultiplayerT.click();
	    Thread.sleep(6000);
	    WebElement GameL = driver.findElement(By.cssSelector("a[title=Crystical]"));
	    GameL.click();
	    Thread.sleep(10000);
	   
	    assertTrue(driver.findElement(By.id("flashobj_mc")).isDisplayed());
	    
  }

private void assertTrue(boolean displayed) {
	// TODO Auto-generated method stub
	
}
}
