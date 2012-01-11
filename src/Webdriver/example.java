package Webdriver;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import java.util.Date;

//import org.junit.After;
//import org.junit.Before;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.chrome.ChromeDriverService;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class example {

	  private static ChromeDriverService service;
	  private WebDriver driver;
	  long timestamp = new Date().getTime();

	  @BeforeClass
	  public static void createAndStartService() throws IOException {
	    service = new ChromeDriverService.Builder()
	        .usingChromeDriverExecutable(new File("C:\\Users\\CP27\\Automation\\lib\\chromedriver.exe"))
	        .usingAnyFreePort()
	        .build();
		  	
	    service.start();
	  }

	  @AfterClass
	  public static void createAndStopService() {
	    service.stop();
	  }

	  @BeforeMethod
	  public void createDriver() {
	    driver = new RemoteWebDriver(service.getUrl(),
	        DesiredCapabilities.chrome());
	    	
	  }

	  @AfterMethod
	  public void quitDriver() {
	    driver.quit();
	  }

	  @Test
	  public void testGoogleSearch() throws InterruptedException {
	    driver.get("http://www.girlsgogames.com");
	    Thread.sleep(5000);
	    WebElement loginLink = driver.findElement(By.cssSelector(".tc-login-url"));
	    loginLink.click();
	    WebElement usernameBox = driver.findElement(By.cssSelector(".tc-username-text"));
	    usernameBox.sendKeys("mptest");
	    WebElement passwordBox = driver.findElement(By.cssSelector(".tc-password-text"));
	    passwordBox.sendKeys("123456");
	    Thread.sleep(5000);
	    WebElement signInButton = driver.findElement(By.cssSelector(".login_button .logmein"));
	    signInButton.click();
	    Thread.sleep(5000);
	    assertEquals("mptest", driver.findElement(By.cssSelector(".tc-username-cnt")).getText());
	  }
	  
	  @Test
	  public void signUp() throws InterruptedException {
		    String username = "mptest" + timestamp;
		  	
		  	driver.get("http://www.girlsgogames.com");
		    Thread.sleep(5000);
		    WebElement JoinNow = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.JOIN_NOW_LINK));
		    JoinNow.click();
		    WebElement email = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_EMAIL));
		    email.sendKeys("miroslaw.palysiewicz"+timestamp+"@dev.spilgames.com");
		    WebElement name = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME));
		    name.sendKeys(username);
		    WebElement password = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_PASSWORD));
		    password.sendKeys("123456");	    
		    WebElement age = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_AGE)); 
		    age.sendKeys("13");
		    
		    assertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_EMAIL_VALID)).isDisplayed());
		    assertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME_VALID)).isDisplayed());
		    assertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_PASSWORD_VALID)).isDisplayed());
		    assertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_AGE_VALID)).isDisplayed());
		    
		    WebElement signMeIn = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_SIGNMEUP));
		    signMeIn.click();
		    Thread.sleep(5000);
		    assertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_WELCOME_TEXT)).isDisplayed());
		    WebElement welcomeClose = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_WELCOME_CLOSE_BTN));
		    welcomeClose.click();
		    Thread.sleep(3000);
		    assertEquals(username, driver.findElement(By.cssSelector(Webdriver.mappings.topBar.USERNAME_LINK)).getText());
		  }
	  
	  @Test
	  public void petParty() throws InterruptedException {
		  driver.get("http://www.girlsgogames.com/game/pet_party.html");
		  Thread.sleep(10000);
		  WebElement inviteButton = driver.findElement(By.id("button2"));
		  inviteButton.isDisplayed();
	  }

	private void assertTrue(boolean displayed) {
		
	}

}

