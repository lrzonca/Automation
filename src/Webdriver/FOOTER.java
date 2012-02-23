package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FOOTER extends SeleniumBase{

//	Footer - click "Terms of use" link, check url and controls  	
	@Test
	@Parameters({"xUrl"})
	public void Footer01(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(footer.TERMS_OF_USE);
		sleep(3);
		assertTrue(driver.getCurrentUrl().contains("disclaimer.html"));
		assertIsDisplayed(flatPage.FLAT_PAGE_HEADER);
		assertIsDisplayed(flatPage.FLAT_PAGE_CONTAINER);
		assertIsDisplayed(flatPage.FLAT_PAGE_ADVERT);
	}
	
//	Footer - click "Privacy Policy" link, check url and controls  	
	@Test
	@Parameters({"xUrl"})
	public void Footer02(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(footer.PRIVACY_POLICY);
		sleep(3);
		assertTrue(driver.getCurrentUrl().contains("privacy_policy.html"));
		assertIsDisplayed(flatPage.FLAT_PAGE_HEADER);
		assertIsDisplayed(flatPage.FLAT_PAGE_CONTAINER);
		assertIsDisplayed(flatPage.FLAT_PAGE_ADVERT);
	}
	
//	Footer - click "Privacy policy, kids & parents" link, check url and controls  	
	@Test
	@Parameters({"xUrl"})
	public void Footer03(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(footer.PRIVACY_POLICY_KIDS_PARENTS);
		sleep(3);
		assertTrue(driver.getCurrentUrl().contains("privacy_policy_kids_parents.html"));
		assertIsDisplayed(flatPage.FLAT_PAGE_HEADER);
		assertIsDisplayed(flatPage.FLAT_PAGE_CONTAINER);
		assertIsDisplayed(flatPage.FLAT_PAGE_ADVERT);
	}
	
//	Footer - click "Information for Parents" link, check url and controls  	
	@Test
	@Parameters({"xUrl"})
	public void Footer04(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(footer.INFORMATION_FOR_PARRENTS);
		sleep(3);
		assertTrue(driver.getCurrentUrl().contains("info_parents.html"));
		assertIsDisplayed(flatPage.FLAT_PAGE_HEADER);
		assertIsDisplayed(flatPage.FLAT_PAGE_CONTAINER);
		assertIsDisplayed(flatPage.FLAT_PAGE_ADVERT);
	}
	
//	Footer - click "Sitemap " link, check url and controls  	
	@Test
	@Parameters({"xUrl"})
	public void Footer05(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(footer.SITEMAP);
		sleep(3);
		assertTrue(driver.getCurrentUrl().contains("sitemap.html"));
		assertIsDisplayed(flatPage.FLAT_PAGE_HEADER);
		assertIsDisplayed(flatPage.FLAT_PAGE_CONTAINER);
		assertIsDisplayed(flatPage.FLAT_PAGE_ADVERT);
	}
	
//	Footer - click "About us" link, check if was open second tab and check url  	
	@Test
	@Parameters({"xUrl"})
	public void Footer06(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(footer.ABOUT_US);
		sleep(3);
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    }
		assertTrue(driver.getCurrentUrl().equals("http://www.spilgames.com/"));
	}	
	
//	Footer - click "Advertise" link, check if was open second tab and check url
	@Test
	@Parameters({"xUrl"})
	public void Footer07(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(footer.ADVERTISE);
		sleep(3);
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    }
		assertTrue(driver.getCurrentUrl().equals("http://www.spilgames.com/advertisers"));
	}	
	
//	Footer - click "Submit a Game" link, check if was open second tab and check url
	@Test
	@Parameters({"xUrl"})
	public void Footer08(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(footer.SUBMIT_A_GAME);
		sleep(3);
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    }
		assertTrue(driver.getCurrentUrl().equals("http://www.spilgames.com/developers"));
	}	
	
//	Footer - click "Get Free Games" link, check if was open second tab and check url
	@Test
	@Parameters({"xUrl"})
	public void Footer09(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(footer.GET_FREE_GAMES);
		sleep(3);
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    }
		assertTrue(driver.getCurrentUrl().equals("http://publishers.spilgames.com/"));
	}	
	
//	Footer - click "Help & Contact" link, check if was open second tab and check url
	@Test
	@Parameters({"xUrl"})
	public void Footer10(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(footer.HELP_AND_CONTENT);
		sleep(3);
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    }
		assertTrue(driver.getCurrentUrl().equals("http://www.spilgames.com/help_and_contact"));
	}	
}