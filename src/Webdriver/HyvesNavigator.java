package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import Webdriver.mappings.hyves;

public class HyvesNavigator {
    WebDriver driver;
    HyvesNavigator(WebDriver driver) {
        this.driver = driver;
    }
    
    public void login(String username, String password) {
        
        sleep(20).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver arg0) {
                if (null != findElement(hyves.USERNAME_FIELD)) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        clickElement(hyves.USERNAME_FIELD);
        insertData(hyves.USERNAME_FIELD, username);
        clickElement(hyves.PASSWORD_FIELD);
        insertData(hyves.PASSWORD_FIELD, password);
        clickElement(hyves.LOGIN_BUTTON);

    }
    public WebDriverWait sleep(int secs) {
        return new WebDriverWait(driver, secs);
    }
    public void clickElement(String selector) {
        findElement(selector).click();
    } 
    
    public void insertData(String selector, String data) {
        clickElement(selector);
        findElement(selector).sendKeys(data);
    } 
    
    public WebElement findElement(String selector) {
        return driver.findElement(By.cssSelector(selector));
    }
    

    public void get(String url) {
        driver.get(url);
    }
}
