package Webdriver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import Webdriver.mappings.hyves;

public class CodepillDriver implements WebDriver {
    WebDriver driver;
    CodepillDriver(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebDriverWait sleep(int secs) {
        return new WebDriverWait(driver, secs);
    }
    
    public void waitFor(final String selector, int timeout) {
        sleep(timeout).until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver d) {
                return d.findElement(By.cssSelector(selector));
            }
        });
    }
    public void clickElement(String selector) {
        findElement(selector).click();
    } 
    
    public void insertData(String selector, String data) {
        clickElement(selector);
        findElement(selector).sendKeys(data);
    }
    public void sendEnter(String selector) {
        findElement(selector).sendKeys(Keys.ENTER);
    }
    
    public WebElement findElement(String selector) {
        return driver.findElement(By.cssSelector(selector));
    }
    
    public void wait(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    
    //delegates to original driver object
    @Override
    public void get(String url) {
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }
}
