package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;


public class Hy_search extends SeleniumBase{
  @Test
  @Parameters({"xUrl","xGameTitle"})
  public void gameSearchValid(String xUrl, String xGameTitle)throws InterruptedException {
	  	driver.get(xUrl);
	    Thread.sleep(3000);
	    WebElement UsernameF = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.USERNAME_FIELD));
	    UsernameF.sendKeys("mptest");
	    WebElement PasswordF = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.PASSWORD_FIELD));
	    PasswordF.sendKeys("mptest123");
	    WebElement LoginB = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.LOGIN_BUTTON));
	    LoginB.click();
	    Thread.sleep(5000);
	    if (xUrl.contains("dev")){
	    	driver.get(xUrl);
	    }
	    driver.switchTo().frame("remote_iframe_-1");
	    WebElement SearchF = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_FIELD));
	    SearchF.click();
	    SearchF.sendKeys(xGameTitle);
	    WebElement SearchB = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BUTTON));
	    SearchB.click();
	    Thread.sleep(15000); 

	   assertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BOX_TITLE)).isDisplayed());
  }
}
