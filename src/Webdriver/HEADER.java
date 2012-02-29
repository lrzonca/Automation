package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HEADER extends SeleniumBase{

//	Site logo - click on any link in left navi, click header logo, check url and controls if page return to home page
	@Test
	@Parameters({"xUrl"})
	public void Header1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(leftNavi.ADVENTURE_GAMES);
		sleep(2);
		clickElement(header.LOGO);
		sleep(5);
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(xUrl);
		assertTrue(driver.getCurrentUrl().equals(xUrl + "/"));
		assertIsDisplayed(homepage.GAME_LIST);
	}
	
//	Slogan - click on any link in left navi, click header slogan, check url and controls if page return to home page
	@Test
	@Parameters({"xUrl"})
	public void Header2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(leftNavi.ADVENTURE_GAMES);
		sleep(2);
		clickElement(header.SLOGAN);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(xUrl + "/"));
		assertIsDisplayed(homepage.GAME_LIST);
	}	

//	GGG tab - click on any link in left navi, click header ggg tab, check url and controls if page return to home page
	@Test
	@Parameters({"xUrl"})
	public void Header3(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(leftNavi.ADVENTURE_GAMES);
		sleep(2);
		clickElement(header.GGG_TAB);
		sleep(5);
		System.out.println(driver.getCurrentUrl());
		System.out.println(xUrl);
		assertTrue(driver.getCurrentUrl().equals(xUrl + "/"));//homepage
		assertIsDisplayed(homepage.GAME_LIST);
	}	
	
}