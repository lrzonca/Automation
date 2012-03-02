package Webdriver;

import org.openqa.selenium.interactions.Actions;

import Webdriver.mappings.hyves;

public class HyvesNavigator {

    CodepillDriver driver;
    HyvesNavigator(CodepillDriver driver) {
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
        driver.waitFor("iframe[name=\"remote_iframe_-1\"]", 10);
        driver.switchTo().frame("remote_iframe_-1");
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
        
    }
    
    public void logout() throws InterruptedException {
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
