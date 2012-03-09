package Webdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Webdriver.mappings.hyves;

public class HyvesNavigator {

    PandaDriver driver;
    HyvesNavigator(PandaDriver driver) {
        this.driver = driver;
    }
    
    public void login(String username, String password) {
        
        driver.waitFor(hyves.USERNAME_FIELD, 20);
        driver.clickElement(hyves.USERNAME_FIELD);
        driver.insertData(hyves.USERNAME_FIELD, username);
        driver.clickElement(hyves.PASSWORD_FIELD);
        driver.insertData(hyves.PASSWORD_FIELD, password);
        driver.clickElement(hyves.LOGIN_BUTTON);
        
    }
    
    
    public void switchToGameIFrame() {
        driver.waitFor(hyves.GAME_IFRAME, 10);
        new Actions(driver.driver).moveToElement(driver.findElement(hyves.GAME_IFRAME)).perform();
        driver.switchTo().frame("remote_iframe_-1");
        driver.switchTo().activeElement();
    }
    
    public void switchToGadgetsIFrame() {
        driver.waitFor("iframe[class=\"gadgets-gadget\"]", 10);
        WebElement iframe = driver.findElement("iframe[class=\"gadgets-gadget\"]");
        driver.switchTo().frame(iframe.getAttribute("name"));
        driver.switchTo().activeElement();
    }
    public void switchToHyvesFrame() {
        driver.switchTo().defaultContent();
    }
    
    public void goToUrl(String url) {
        driver.get(url);
    }
    
    public void addToFavorities(String gameName) {
    }
    
    public void removeFromFavorities(String gameName) {
    }
    
    public void goToFavorities() {
        
    }
    
    public void searchGame(String game) {
        driver.waitFor(hyves.SEARCH_FIELD, 10);
        new Actions(driver.driver).moveToElement(driver.findElement(hyves.PARENT_ADVICE)).perform();
        driver.clickElement(hyves.SEARCH_FIELD);
        driver.insertData(hyves.SEARCH_FIELD, game + Keys.ENTER.toString());
        new Actions(driver.driver).moveToElement(driver.findElement(hyves.SEARCH_BUTTON)).click().perform();
        driver.wait(1);
    }
    
    public void logout() {
        switchToHyvesFrame();
        driver.wait(3);
        Actions webbuilder = new Actions(driver.driver);
        webbuilder
            .moveToElement(driver.findElement("#usr-optns"))
            .moveToElement(driver.findElement("#usr-optns-logout-link")).click(driver.findElement("#usr-optns-logout-link"))
            .build()
            .perform();
        driver.clickElement("#usr-optns-logout-link");
        driver.wait(3);
    }
    
    public void goToGamePage(String game) {
    }
}
