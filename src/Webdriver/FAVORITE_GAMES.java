package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class FAVORITE_GAMES extends SeleniumBase{

//	Top bar - Favorite games link - login a user, click "favorite games" link from top bar, check url and controls if are present and correct tab is selected
	@Test
	@Parameters({"xUrl"})
	public void Favorite1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest", "123456");	
		clickElement(favoriteGames.FAVORITE_GAMES_TOP_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("mygames.html"));
		assertTrue(findElement(favoriteGames.TAB_FAVORITE_GAMES).getAttribute("class").equals("active"));
		assertTrue(findElement(myProfile.TOP_TITLE).getText().equals("Fave Games"));
	}
}