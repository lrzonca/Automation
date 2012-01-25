package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class CATEGORY_PAGE extends SeleniumBase{
	  
	@Test
	@Parameters({"xUrl"})
	public void Category1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Find Element ADVENTURE_GAMES");
		WebElement AdventureGame = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.ADVENTURE_GAMES));
		System.out.println("Click Element ADVENTURE_GAMES");
		AdventureGame.click();	
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.categoryPage.SUBCATEGORY_GAME_LIST)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_SUBCATEGORY_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_HOME_PAGE_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_HOME_PAGE_LINK)).isDisplayed());
		System.out.println("Assertion");
		assertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.categoryPage.TOP_CATEGORY_LINK)).size() == 0);
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_ACTIVE_PAGE)).isDisplayed());
	}
	
	
	@Test
	@Parameters({"xUrl"})
	public void Category2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Find Element ADVENTURE_GAMES");
		WebElement AdventureGame = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.ADVENTURE_GAMES));
		System.out.println("Click Element ADVENTURE_GAMES");
		AdventureGame.click();		
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.categoryPage.SUBCATEGORY_GAME_LIST)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_SUBCATEGORY_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_HOME_PAGE_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_HOME_PAGE_LINK)).isDisplayed());
		System.out.println("Assertion");
		assertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.categoryPage.TOP_CATEGORY_LINK)).size() == 0);
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_ACTIVE_PAGE)).isDisplayed());
		System.out.println("Get Url");
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("Find Element FIRST_AVAILABLE_SUBCATEGORY_LINK");
		WebElement Subcategory = driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_SUBCATEGORY_LINK));
		System.out.println("Click Element FIRST_AVAILABLE_SUBCATEGORY_LINK");
		Subcategory.click();
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.FIRST_AVAILABLE_GAME_LINK)).isDisplayed());
		System.out.println("Get Url");
		driver.get(CurrentURL);
		
		if (driver.findElements(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_GAME_LINK)).size() > 0){	
			System.out.println("Find Element FIRST_AVAILABLE_GAME_LINK");
			WebElement GameLink = driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_GAME_LINK));
			System.out.println("Click Element FIRST_AVAILABLE_GAME_LINK");
			GameLink.click();
			System.out.println("Assertion");
			AssertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_SUBCATEGORY_LINK)).size() == 0);
			System.out.println("Assertion");
			AssertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_GAME_LINK)).size() == 0);
			System.out.println("Assertion");
			AssertTrue(driver.findElement(By.id(Webdriver.mappings.gamepage.ALL_COMMENTS_BOX)).isDisplayed());
		   }			
	}	
	
	@Test
	@Parameters({"xUrl"})
	public void Category3(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Find Element ADVENTURE_GAMES");
		WebElement AdventureGame = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.ADVENTURE_GAMES));
		System.out.println("Click Element ADVENTURE_GAMES");
		AdventureGame.click();
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.popularGames.POPULAR_GAMES_TITLE_CATEGORY_PAGE)).isDisplayed());  		   
		int iterTry = 1;
		while (driver.findElement(By.cssSelector(".BoxList li:nth-child(" + iterTry + ")")).isDisplayed()){			
			if (iterTry % 2 == 1){
				System.out.println("Assertion");
				assertEquals("white", driver.findElement(By.cssSelector(".BoxList li:nth-child(" + iterTry + ")")).getAttribute("class"));
			} else {
//				assertEquals("white", driver.findElement(By.cssSelector(".BoxList li:nth-child(" + iterTry + ")")).getAttribute(""));
			}		   
			iterTry++;
		}
//		   while (selenium.isElementPresent("css=.BoxList li:nth-child(" + iterTry + ")")){	   
//			   if (iterTry % 2 == 1){
//				   assertEquals("white", selenium.getAttribute("css=.BoxList li:nth-child(" + iterTry + ")@class"));
//			   } else {
//				   selenium.ignoreAttributesWithoutValue("css=.BoxList li:nth-child(" + iterTry + ")@class");
//			   }		   
//			   selenium.mouseOver("css=.BoxList li:nth-child(" + iterTry + ") div a");
//			   String TooltipVisible = selenium.getAttribute(GIRLS.MAPPINGS.POPULAR_GAMES.POPULAR_GAMES_SHOW_TOOLTIP_CATEGORY_PAGE+"@style");
//			   TooltipVisible.contains("display: block");
//			   String Tooltip_Title = selenium.getText("css=ul.BoxList li:nth-child(" + iterTry + ") a.tooltipHidden");
//			   String Tooltip_Img = selenium.getAttribute("css=ul.BoxList li:nth-child(" + iterTry + ") img" + "@src");	   
//			   assertEquals(Tooltip_Title, selenium.getText(GIRLS.MAPPINGS.POPULAR_GAMES.POPULAR_GAMES_SHOW_TOOLTIP_TITLE_CATEGORY_PAGE));
//			   assertEquals(Tooltip_Img, selenium.getAttribute(GIRLS.MAPPINGS.POPULAR_GAMES.POPULAR_GAMES_SHOW_TOOLTIP_IMG_CATEGORY_PAGE + "@src"));   
//			   iterTry++;
//		   }	
	}
	
	@Test
	@Parameters({"xUrl"})
	public void Category4(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Find Element ADVENTURE_GAMES");
		WebElement AdventureGame = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.ADVENTURE_GAMES));
		System.out.println("Click Element ADVENTURE_GAMES");
		AdventureGame.click();
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.categoryPage.CATEGORY_TAG_BOX)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.categoryPage.CATEGORY_TAG_GIRLS_IMG)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.CATEGORY_TAG_TITLE)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_TAG_LINK)).isDisplayed());
	}		
}