package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static Webdriver.mappings.*;


public class Hy_search extends SeleniumBase{
  @Test
  @Parameters({"xUrl", "xGameTitle", "xUsername", "xPass"})
  public void gameSearchValid(String xUrl, String xGameTitle, String xUsername, String xPass)throws Exception {
	  	NavigateToGamePage(xUrl, xUsername, xPass);
	    WebElement SearchF = findElement(hyves.SEARCH_FIELD);
	    Thread.sleep(7000); 
	    SearchF.click();
	    SearchF.clear();
	    SearchF.sendKeys(xGameTitle);
	    SearchF.sendKeys(Keys.ENTER);
//	    WebElement SearchB = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BUTTON));
//	    WebElement SearchB = driver.findElement(By.id("searchButton"));
//	    SearchB.click();
	    Thread.sleep(5000); 
	   assertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BOX_TITLE)).isDisplayed());
	   //assertTrue(driver.findElement(By.cssSelector("a[title='woobies']")).isDisplayed());
	   assertEqualsCaseInsensitive(xGameTitle, driver.findElement(By.cssSelector(".game-title")).getText());
  }
  
  @Test
  @Parameters({"xUrl", "xGameTitle", "xUsername", "xPass"})
  public void gameSearchValid1(String xUrl, String xGameTitle, String xUsername, String xPass)throws Exception {
	  	NavigateToGamePage(xUrl, xUsername, xPass);
	    WebElement SearchF = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_FIELD));
	    Thread.sleep(7000); 
	    SearchF.click();
	    SearchF.clear();
	    SearchF.sendKeys(xGameTitle);
	    SearchF.sendKeys(Keys.ENTER);
//	    WebElement SearchB = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BUTTON));
//	    WebElement SearchB = driver.findElement(By.id("searchButton"));
//	    SearchB.click();
	    Thread.sleep(5000); 
	   assertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BOX_TITLE)).isDisplayed());
	   //assertTrue(driver.findElement(By.cssSelector("a[title='woobies']")).isDisplayed());
	   assertEqualsCaseInsensitive(xGameTitle, driver.findElement(By.cssSelector(".game-title")).getText());
  }
  
}
