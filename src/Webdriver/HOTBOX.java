package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HOTBOX extends SeleniumBase{
	  
//	Hotbox - check if after 5 sek game was changed, next click button 1,2,3 and check if games are changed	
	@Test
	@Parameters({"xUrl"})
	public void HotBox1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		String[] table = new String[5];
		for (int i = 1; i < 4; i++){
			table[i] = findElement(hotbox.HOTBOX_ROTATOR).getAttribute("style");
			System.out.println(table[i]);
			sleep(5);
		}		
		System.out.println("Assertion");
		assertFalse(table[1].equals(table[2]));
		System.out.println("Assertion");
		assertFalse(table[1].equals(table[3]));
		System.out.println("Assertion");
		assertFalse(table[2].equals(table[3]));		
		clickElement(hotbox.HOTBOX_THIRD_BUTTON);		
		assertTrue(findElement(hotbox.HOTBOX_ROTATOR).getAttribute("style").equals(table[3]));
		clickElement(hotbox.HOTBOX_FIRST_BUTTON);
		System.out.println("Assertion");
		assertTrue(findElement(hotbox.HOTBOX_ROTATOR).getAttribute("style").equals(table[1]));
		clickElement(hotbox.HOTBOX_SECOND_BUTTON);
		System.out.println("Assertion");
		assertTrue(findElement(hotbox.HOTBOX_ROTATOR).getAttribute("style").equals(table[2]));
	}			
	
//	Hotbox - button 2, check which game should be open and next click game image, check url if correct game was open	
	@Test
	@Parameters({"xUrl"})
	public void HotBox2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(hotbox.HOTBOX_SECOND_BUTTON);
		String gameUrl = findElement(hotbox.HOTBOX_ROTATOR_SECOND_GAME + " a").getAttribute("href");
		clickElement(hotbox.HOTBOX_ROTATOR_SECOND_GAME);
		assertTrue(driver.getCurrentUrl().equals(gameUrl));
	}			
	
//	Hotbox - button 2, check which game should be open and next click play now button, check url if correct game was open	
	@Test
	@Parameters({"xUrl"})
	public void HotBox3(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(hotbox.HOTBOX_SECOND_BUTTON);
		String gameUrl = findElement(hotbox.HOTBOX_ROTATOR_SECOND_GAME + " a").getAttribute("href");
		clickElement(hotbox.HOTBOX_PLAYNOW_BUTTON);
		assertTrue(driver.getCurrentUrl().equals(gameUrl));
	}		
}