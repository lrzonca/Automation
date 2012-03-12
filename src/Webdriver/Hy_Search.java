package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Hy_Search extends SeleniumBase{
  @Test
  @Parameters({"xUrl", "xGameTitle", "xUsername", "xPass"})
  public void gameSearchValid(String xUrl, String xGameTitle, String xUsername, String xPass)throws Exception {
	  	LoginAndNavigateToGamePage(xUrl, xUsername, xPass);
	    WebElement SearchF = driver.findElement(By.cssSelector(hyves.SEARCH_FIELD)); 
	    SearchF.sendKeys("");
	    SearchF.click();
	    SearchF.clear();
	    SearchF.sendKeys(xGameTitle);
	    SearchF.sendKeys(Keys.ENTER);
	    Thread.sleep(5000); 
	   assertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BOX_TITLE)).isDisplayed());
	   assertEqualsCaseInsensitive(xGameTitle, driver.findElement(By.cssSelector(".game-title")).getText());
  }
  
  @Test
  @Parameters({"xUrl", "xUsername", "xPass"})
  public void gameSearchManyResults(String xUrl, String xUsername, String xPass)throws Exception {
	  	String GameTitle = "land";
	  	String GamesFound = "6";
	  
	  	LoginAndNavigateToGamePage(xUrl, xUsername, xPass);
	    WebElement SearchF = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_FIELD));
	    Thread.sleep(2000); 
	    SearchF.sendKeys("");
	    SearchF.click();
	    SearchF.clear();
	    SearchF.sendKeys(GameTitle);
	    SearchF.sendKeys(Keys.ENTER);
	    Thread.sleep(5000); 
	    assertEquals("Games met \"" + GameTitle + "\"", driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BOX_TITLE)).getText());
	    assertEquals(GamesFound + " resultaten gevonden voor \"" + GameTitle + "\"", driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BOX_RESULTS_FOUND)).getText());
	    assertTrue(driver.findElement(By.cssSelector("a[title='Klaverjassen']")).isDisplayed());
	    assertTrue(driver.findElement(By.cssSelector("a[title='Landleven']")).isDisplayed());
	    assertTrue(driver.findElement(By.cssSelector("a[title='Minigolf Tropical Island']")).isDisplayed());
	    assertTrue(driver.findElement(By.cssSelector("a[title='Koets Racer']")).isDisplayed());
	    assertTrue(driver.findElement(By.cssSelector("a[title='Smulboerderij']")).isDisplayed());
	    assertTrue(driver.findElement(By.cssSelector("a[title='World of Zombies']")).isDisplayed());
  }
  
  @Test
  @Parameters({"xUrl", "xUsername", "xPass"})
  public void gameSearchNoResults(String xUrl, String xUsername, String xPass)throws Exception {
	  	String GameTitle = "nothinghasbeenfound";
	  	String GamesFound = "0";
	  
	  	LoginAndNavigateToGamePage(xUrl, xUsername, xPass);
	    WebElement SearchF = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_FIELD));
	    Thread.sleep(2000); 
	    SearchF.sendKeys("");
	    SearchF.click();
	    System.out.println("SearchF.click()");
	    SearchF.clear();
	    SearchF.sendKeys(GameTitle);
	    SearchF.sendKeys(Keys.ENTER);
	    Thread.sleep(5000); 
	    assertEquals("Games met \"" + GameTitle + "\"", driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BOX_TITLE)).getText());
	    assertEquals(GamesFound + " resultaten gevonden voor \"" + GameTitle + "\"", driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BOX_RESULTS_FOUND)).getText());
	    assertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_BOX_NO_RESULTS)).isDisplayed());

  }
}
