package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.openqa.selenium.By;

public class GAME_PAGE extends SeleniumBase{
	long timestamp = new Date().getTime();
	  
	@Test
	/** Flash - shockwave - check if game was open correctly 
	 **/	
	@Parameters({"xUrl"})
	public void GamePage1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl + "/game/unicorn_universe.html");
		sleep(30);
		assertIsDisplayed(gamepage.GAME_CONTAINTER_SHOCKWAVE);
	}
	
	@Test
	/** Java - check if game was open correctly 
	 **/	
	@Parameters({"xUrl"})
	public void GamePage2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl + "/game/bubble_machine.html");
		sleep(30);
		System.out.println("Switch to GAME_CONTAINTER_IFRAME");
		driver.switchTo().frame("socialgame");
		System.out.println("Assertion");
		assertTrue(driver.findElement(By.cssSelector("#flashobj")).isDisplayed());
	}
	
	@Test
	/** Iframe - check if game was open correctly 
	 **/	
	@Parameters({"xUrl"})
	public void GamePage3(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl + "/game/kindergarten.html");
		sleep(30);
		System.out.println("Switch to GAME_CONTAINTER_IFRAME");
		driver.switchTo().frame(Webdriver.mappings.gamepage.GAME_CONTAINTER_IFRAME);
		System.out.println("Assertion");
		assertTrue(driver.findElement(By.cssSelector("#test")).isDisplayed());
	}
		
	@Test
	/** Game Active - check if game is visible on page when is marked as a active in cms
	**/ 	
	@Parameters({"xUrl"})
	public void GamePage4(String xUrl) throws InterruptedException {
		String SQL_select = "SELECT * FROM `games` g INNER JOIN `biglinks` b ON g.`id` = b.`game_id` WHERE g.`language_id` LIKE 'en-US' AND g.`active` = 1 LIMIT 1";
		Get_Games_Parameter_From_DB(SQL_select);
		driver.get(xUrl + "/game/" + Game_nice_name + ".html");
		sleep(30);
		String pageTitle = driver.getTitle();
		assertTrue(pageTitle.contains(Game_game_name));
	}		

	/** Game Not Active - check if game is not visible on page when is not marked as a active in cms
	**/	
	@Test
	@Parameters({"xUrl"})
	public void GamePage5(String xUrl) throws InterruptedException {
		String SQL_select = "SELECT * FROM games WHERE active = 0 AND language_id LIKE 'en-US' LIMIT 1";
		Get_Games_Parameter_From_DB(SQL_select);
		driver.get(xUrl + "/game/" + Game_nice_name + ".html");
		sleep(30);
		String pageTitle = driver.getTitle();
		assertFalse(pageTitle.contains(Game_game_name));
	}		

	/** Scalable Active - check if scalable bar is visible on page when is marked as a active in cms
	**/	
	@Test
	@Parameters({"xUrl"})
	public void GamePage6(String xUrl) throws InterruptedException {
		String SQL_select = "SELECT * FROM `games` g INNER JOIN `biglinks` b ON g.`id` = b.`game_id` WHERE g.`language_id` LIKE 'en-US' AND g.`active` = 1 AND g.`scalable` = 1 LIMIT 1";
		Get_Games_Parameter_From_DB(SQL_select);
		driver.get(xUrl + "/game/" + Game_nice_name + ".html");
		sleep(30);
		assertIsDisplayed(gamepage.ZOOM_SCALABLE_BAR);
		assertIsDisplayed(gamepage.ZOOM_IN_LINK);
		assertIsDisplayed(gamepage.ZOOM_SLIDER);
		assertIsDisplayed(gamepage.ZOOM_OUT_LINK);
		assertIsDisplayed(gamepage.ZOOM_RESET_LINK);
	}		
	
	/** Scalable Not Active - check if scalable bar is not visible on page when is not marked as a active in cms
	**/	
	@Test
	@Parameters({"xUrl"})
	public void GamePage7(String xUrl) throws InterruptedException { // not working for now, assertisNotDisplayed is not working
		String SQL_select = "SELECT * FROM `games` g INNER JOIN `biglinks` b ON g.`id` = b.`game_id` WHERE g.`language_id` LIKE 'en-US' AND g.`active` = 1 AND g.`scalable` = 0 LIMIT 1";
		Get_Games_Parameter_From_DB(SQL_select);
		driver.get(xUrl + "/game/" + Game_nice_name + ".html");
		sleep(30);
		assertIsNotDisplayed(gamepage.ZOOM_SCALABLE_BAR);
		assertIsNotDisplayed(gamepage.ZOOM_IN_LINK);
		assertIsNotDisplayed(gamepage.ZOOM_SLIDER);
		assertIsNotDisplayed(gamepage.ZOOM_OUT_LINK);
		assertIsNotDisplayed(gamepage.ZOOM_RESET_LINK);
	}		
}