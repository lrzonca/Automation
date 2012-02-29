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
		assertTrue(driver.getCurrentUrl().equals("http://www.spilgames.com/help-contact/faqs#consumers"));
	}	
	
//	Footer - popular games - check all controls and check if all links and titles of links are not the same, click first link and check url
	@Test
	@Parameters({"xUrl"})
	public void Footer11(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		assertIsDisplayed(footer.POPULAR_GAMES_BOX);
		assertIsDisplayed(footer.POPULAR_GAMES_TITLE);
		assertIsDisplayed(footer.POPULAR_GAMES_EMPTY_LINE);
		assertIsDisplayed(footer.POPULAR_GAMES_LINKS_BOX);
		for (int i = 1; i <= 5; i++){
			for (int j = i + 1; j <= 5; j++){				
				assertFalse(findElement(".footer-top div.bottomLinks:nth-child(1) ul li:nth-child(" + i + ") a").getAttribute("href").equals(findElement(".footer-top div.bottomLinks:nth-child(1) ul li:nth-child(" + j + ") a").getAttribute("href")));
				assertFalse(findElement(".footer-top div.bottomLinks:nth-child(1) ul li:nth-child(" + i + ") a").getAttribute("innerHTML").equals(findElement(".footer-top div.bottomLinks:nth-child(1) ul li:nth-child(" + j + ") a").getAttribute("innerHTML")));
			}
		}
		String url = findElement(footer.POPULAR_GAMES_FIRST_LINK_LINK).getAttribute("href");
		clickElement(footer.POPULAR_GAMES_FIRST_LINK_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().equals(url));		
	}
	
//	Footer - other sites - check all controls and check if all links and titles of links are not the same, click first link and check url
	@Test
	@Parameters({"xUrl"})
	public void Footer12(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		assertIsDisplayed(footer.OTHER_SITES_BOX);
		assertIsDisplayed(footer.OTHER_SITES_TITLE);
		assertIsDisplayed(footer.OTHER_SITES_EMPTY_LINE);
		assertIsDisplayed(footer.OTHER_SITES_LINKS_BOX);
		for (int i = 1; i <= 5; i++){
			for (int j = i + 1; j <= 5; j++){	
				assertFalse(findElement(".footer-top div.bottomLinks:nth-child(2) ul li:nth-child(" + i + ") a").getAttribute("href").equals(findElement(".footer-top div.bottomLinks:nth-child(2) ul li:nth-child(" + j + ") a").getAttribute("href")));			
			}
		}
		String url = findElement(footer.OTHER_SITES_FIRST_LINK_LINK).getAttribute("href");
		clickElement(footer.OTHER_SITES_FIRST_LINK_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().equals(url));
	}		
	
//	Footer - partners - check all controls and check if all links and titles of links are not the same, click first link and check url
	@Test
	@Parameters({"xUrl"})
	public void Footer13(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		assertIsDisplayed(footer.PARTNERS_BOX);
		assertIsDisplayed(footer.PARTNERS_TITLE);
		assertIsDisplayed(footer.PARTNERS_EMPTY_LINE);
		assertIsDisplayed(footer.PARTNERS_LINKS_BOX);
		for (int i = 1; i <= 1; i++){
			for (int j = i + 1; j <= 1; j++){				
				assertFalse(findElement(".footer-top div.bottomLinks:nth-child(3) ul li:nth-child(" + i + ") a").getAttribute("href").equals(findElement(".footer-top div.bottomLinks:nth-child(3) ul li:nth-child(" + j + ") a").getAttribute("href")));				
			}
		}
		String url = findElement(footer.PARTNERS_LINKS_FIRST_LINK_LINK).getAttribute("href");
		clickElement(footer.PARTNERS_LINKS_FIRST_LINK_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().equals(url));		
	}
	
//	Footer Country - check all controls
	@Test
	@Parameters({"xUrl"})
	public void Country01(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		assertIsDisplayed(footer.LANGUAGES_BOX);
		assertIsDisplayed(footer.LANGUAGES_TITLE);
		assertIsDisplayed(footer.LANGUAGES_EMPTY_LINE);
		assertIsDisplayed(footer.LANGUAGES_LINKS_LEFT_BOX);
		assertIsDisplayed(footer.LANGUAGES_LINKS_RIGHT_BOX);
		for (int i = 1; i <= 9; i++){
			for (int j = i + 1; j <= 9; j++){	
				assertFalse(findElement(".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(" + i + ") a span").getAttribute("class").equals(findElement(".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(" + j + ") a span").getAttribute("class")));
				assertFalse(findElement(".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(" + i + ") a").getText().equals(findElement(".footer-top div.bottomLanguages ul:nth-child(3) li:nth-child(" + j + ") a").getText()));
			}
		}
		for (int i = 1; i <= 9; i++){
			for (int j = i + 1; j <= 9; j++){				
				assertFalse(findElement(".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(" + i + ") a span").getAttribute("class").equals(findElement(".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(" + j + ") a span").getAttribute("class")));
				assertFalse(findElement(".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(" + i + ") a").getText().equals(findElement(".footer-top div.bottomLanguages ul:nth-child(4) li:nth-child(" + j + ") a").getText()));
			}
		}				
	}	
	
//	Footer Country - Argentina - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country02(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_ARGENTINA_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_ARGENTINA_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}
	
//	Footer Country - Brasil - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country03(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_BRASIL_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_BRASIL_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Chile - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country04(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_CHILE_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_CHILE_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Colombia - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country05(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_COLOMBIA_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_COLOMBIA_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Deutschland - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country06(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_DEUTSCHLAND_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_DEUTSCHLAND_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Espana - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country07(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_ESPANA_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_ESPANA_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - France - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country08(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_FRANCE_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_FRANCE_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Indonesia - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country09(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_INDONESIA_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_INDONESIA_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Italia - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country10(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_ITALIA_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_ITALIA_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Mexico - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country11(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_MEXICO_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_MEXICO_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Nederland - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country12(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_NEDERLAND_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_NEDERLAND_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Polska - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country13(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_POLSKA_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_POLSKA_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Russia - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country14(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_RUSSIA_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_RUSSIA_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Sverige - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country15(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_SVERIGE_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_SVERIGE_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Turkiye - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country16(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_TURKIYE_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_TURKIYE_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - UK - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country17(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_UK_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_UK_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - USA - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country18(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_USA_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_USA_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}	
	
//	Footer Country - Venezuela - click flag and check url
	@Test
	@Parameters({"xUrl"})
	public void Country19(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		SitesUrl(findElement(footer.LANGUAGES_VENEZUELA_LINK + " span").getAttribute("class"));
		clickElement(footer.LANGUAGES_VENEZUELA_LINK);
		sleep(5);		
		assertTrue(driver.getCurrentUrl().equals(siteUrl));
	}		
}