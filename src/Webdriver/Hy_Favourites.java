package Webdriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;


public class Hy_Favourites extends SeleniumBase{
	private PandaDriver navigator;
	String RemoveFavText = "Uit favorieten verwijderen";
	String RemoveFavPopupText = "Het spel is verwijderd van de favorietenlijst.";
	String EmptySpace = " ";
	String SeparatorDash = "-";
	String[] GameId;
	String[] GameId_1;
	String GameIdSplited;
	String Atribute = "class";
	
	
	@DataProvider
    public Object[][] games() {
        return new Object[][] {
                {"sevens"},
                {"wobies"}
        };
    }
	
	@Test
	  @Parameters({"xUrl", "xGameTitle", "xUsername", "xPass"})
	  public void addGameToFav(String xUrl, String xGameTitle, String xUsername, String xPass)throws Exception {
		  	System.out.println("TestLink id: hy-5 Title: Add game to favourites");
			//Step 1, Step 2 and Step 3
		  	LoginAndNavigateToGamePage(xUrl, xUsername, xPass);
		  	//getting current number of fav games
			FavGameSplit();
			int NumberBefore = FavNumber;
			AddGameToFav(xGameTitle);
		  	WebElement FavL = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.GAME_PAGE_FAV_LINK));
		  	assertEqualsCaseInsensitive(RemoveFavText, FavL.getText());
		  	//Step 4
		  	driver.findElement(By.cssSelector(Webdriver.mappings.hyves.HOME_PAGE_LINK)).click();
		  	Thread.sleep(2000);
		  	FavGameSplit();
			int NumberAfter = FavNumber;	  	
		  	//Step 5
			driver.findElement(By.cssSelector(Webdriver.mappings.hyves.FAVURITES_LINK)).click();
		  	Thread.sleep(2000);
		  	WebElement GameFavL = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_GAME_LINK + xGameTitle + "]"));
		  	assertTrue(GameFavL.isDisplayed());
		  	
		  	//get gameID and remove the game
		  	WebElement GameLink = driver.findElement(By.partialLinkText(xGameTitle));
		  	String PreGameId = GameLink.getAttribute(Atribute);
		  	GameId = PreGameId.split(EmptySpace);
		  	GameId_1 = GameId[1].split(SeparatorDash);
		  	System.out.println(GameId_1[2]);
		  	GameIdSplited = GameId_1[2];
		  	driver.findElement(By.id(GameIdSplited)).click();
		  	assertEquals(NumberBefore + 1, NumberAfter);  	
	  }
	
	@Test
	  @Parameters({"xUrl", "xGameTitle", "xUsername", "xPass"})
	  public void RemoveGameFromFav(String xUrl, String xGameTitle, String xUsername, String xPass)throws Exception {
		  	System.out.println("TestLink id: hy-7 Title: Remove game from favourites");
		  	//PRECONDITION
		  	LoginAndNavigateToGamePage(xUrl, xUsername, xPass);
		  	//getting current number of fav games
			FavGameSplit();
			int NumberBefore = FavNumber;
			AddGameToFav(xGameTitle);
		  	//Step1
			driver.get(xUrl);
			Thread.sleep(7000);
			driver.switchTo().frame("remote_iframe_-1");
			SearchGame(xGameTitle);
			WebElement GameL = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.SEARCH_GAME_LINK + xGameTitle + "]"));
		  	GameL.sendKeys("");
		  	GameL.click();
		  	Thread.sleep(2000);
			WebElement FavL = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.GAME_PAGE_FAV_LINK));
		  	assertEqualsCaseInsensitive(RemoveFavText, FavL.getText());	
		  	//Step 2
		  	FavL.click();
		  	Thread.sleep(2000);
		  	WebElement FavPopupT = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.GAME_PAGE_FAV_POPUP_BODY));
		  	assertEqualsCaseInsensitive(RemoveFavPopupText, FavPopupT.getText());
		  	WebElement FavOK = driver.findElement(By.cssSelector(Webdriver.mappings.hyves.GAME_PAGE_FAV_POPUP_OK));
		  	FavOK.click();
		  	Thread.sleep(4000);
		  	
		  	driver.findElement(By.cssSelector(Webdriver.mappings.hyves.HOME_PAGE_LINK)).click();
		  	Thread.sleep(12000);
		  	FavGameSplit();
			int NumberAfter = FavNumber;	  	

		  	assertEquals(NumberBefore, NumberAfter);
		  	driver.findElement(By.cssSelector(Webdriver.mappings.hyves.FAVURITES_LINK)).click();
		  	Thread.sleep(2000);
		  	assertEquals(0, driver.findElements(By.cssSelector(Webdriver.mappings.hyves.SEARCH_GAME_LINK + xGameTitle + "]")).size());
		  	;
	  }
}




  