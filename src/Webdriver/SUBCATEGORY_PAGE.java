package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class SUBCATEGORY_PAGE extends SeleniumBase{
	  
	@Test
	@Parameters({"xUrl"})
	public void Subcategory1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		System.out.println("Find Element ADVENTURE_GAMES");
		WebElement AdventureGame = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.ADVENTURE_GAMES));
		System.out.println("Click Element ADVENTURE_GAMES");
		AdventureGame.click();
		sleep(5);
		System.out.println("Find Element FIRST_AVAILABLE_SUBCATEGORY_LINK");
		WebElement SubCategory = driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_SUBCATEGORY_LINK));
		System.out.println("Click Element FIRST_AVAILABLE_SUBCATEGORY_LINK");
		SubCategory.click();	
		sleep(5);
		System.out.println("Assertion");
		assertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.categoryPage.SUBCATEGORY_GAME_LIST)).size() == 0);
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.FIRST_AVAILABLE_GAME_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_HOME_PAGE_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_HOME_PAGE_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_CATEGORY_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_ACTIVE_PAGE)).isDisplayed());
	}
	

	@Test
	@Parameters({"xUrl"})
	public void Subcategory3(String xUrl) throws InterruptedException {
		int Number_of_games;
		int Number_of_games_detail;
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
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.FIRST_AVAILABLE_GAME_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_HOME_PAGE_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_HOME_PAGE_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_CATEGORY_LINK)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_ACTIVE_PAGE)).isDisplayed());
		int i = 1;
		System.out.println("Count elements");
		while (driver.findElements(By.cssSelector(".gameList li:nth-child(" + i + ") div:nth-child(2) a")).size() > 0){
			i++;
		}
		Number_of_games = i - 1;
		if (Number_of_games == 25){
			System.out.println("Assertion");
			AssertTrue(driver.findElement(By.id(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_BOX)).isDisplayed());
			System.out.println("Assertion");
			AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_BOTTOM_BOX)).isDisplayed());
			System.out.println("Assertion");
			AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON)).isDisplayed());
			System.out.println("Assertion");
			AssertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON)).size() == 0);
			System.out.println("Assertion");
			while (driver.findElements(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON)).size() > 0){
				System.out.println("Get Text from Element SUBCATEGORY_GAMES_FIRST_GAME_NAME_TEXT");
				String GameTitle = driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_GAMES_FIRST_GAME_NAME_TEXT)).getText();
				System.out.println("Find Element SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON");
				WebElement NextBtn = driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON));
				System.out.println("Click Element SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON");
				NextBtn.click();
				System.out.println("Assertion");
				assertNotSame(GameTitle, driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_GAMES_FIRST_GAME_NAME_TEXT)).getText());
				System.out.println("Assertion");
				AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON)).isDisplayed());
			}		   
			while (driver.findElements(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON)).size() > 0){
				System.out.println("Get Text from Element SUBCATEGORY_GAMES_FIRST_GAME_NAME_TEXT");
				String GameTitle = driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_GAMES_FIRST_GAME_NAME_TEXT)).getText();
				System.out.println("Find Element SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON");
				WebElement PrevBtn = driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON));
				System.out.println("Click Element SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON");
				PrevBtn.click();
				System.out.println("Assertion");
				assertNotSame(GameTitle, driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_GAMES_FIRST_GAME_NAME_TEXT)).getText());
				System.out.println("Assertion");
				AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON)).isDisplayed());
			}
		}
		System.out.println("Find Element SUBCATEGORY_DETAIL_LINK");
		WebElement DetailBtn = driver.findElement(By.id(Webdriver.mappings.subcategoryPage.SUBCATEGORY_DETAIL_LINK));
		System.out.println("Click Element SUBCATEGORY_DETAIL_LINK");
		DetailBtn.click();
		int j = 1;
		System.out.println("Count elements");
		while (driver.findElements(By.cssSelector(".gameList li:nth-child(" + j + ") div:nth-child(2) a")).size() > 0){
			j++;
		}	
		Number_of_games_detail = j - 1; 
		if (Number_of_games_detail == 7){
			System.out.println("Assertion");
			AssertTrue(driver.findElement(By.id(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_BOX)).isDisplayed());
			System.out.println("Assertion");
			AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_BOTTOM_BOX)).isDisplayed());
			System.out.println("Assertion");
			AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON)).isDisplayed());
			System.out.println("Assertion");
			AssertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON)).size() == 0);
			System.out.println("Assertion");
			while (driver.findElements(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON)).size() > 0){
				System.out.println("Get Text from Element SUBCATEGORY_GAMES_FIRST_GAME_NAME_DETAIL_VIEW_TEXT");
				String GameTitle = driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_GAMES_FIRST_GAME_NAME_DETAIL_VIEW_TEXT)).getText();
				System.out.println("Find Element SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON");
				WebElement NextBtn = driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON));
				System.out.println("Click Element SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON");
				NextBtn.click();
				assertNotSame(GameTitle, driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_GAMES_FIRST_GAME_NAME_DETAIL_VIEW_TEXT)).getText());
				System.out.println("Assertion");
				AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON)).isDisplayed());
			}		   
			while (driver.findElements(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON)).size() > 0){
				System.out.println("Get Text from Element SUBCATEGORY_GAMES_FIRST_GAME_NAME_DETAIL_VIEW_TEXT");
				String GameTitle = driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_GAMES_FIRST_GAME_NAME_DETAIL_VIEW_TEXT)).getText();
				System.out.println("Find Element SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON");
				WebElement PrevBtn = driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON));
				System.out.println("Click Element SUBCATEGORY_PAGING_TOP_PREVIOUS_ACTIVE_BUTTON");
				PrevBtn.click();
				assertNotSame(GameTitle, driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_GAMES_FIRST_GAME_NAME_DETAIL_VIEW_TEXT)).getText());
				System.out.println("Assertion");
				AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.SUBCATEGORY_PAGING_TOP_NEXT_ACTIVE_BUTTON)).isDisplayed());
			}
		}		
	}	
	
	
	@Test
	@Parameters({"xUrl"})
	public void Subcategory4(String xUrl) throws InterruptedException {
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