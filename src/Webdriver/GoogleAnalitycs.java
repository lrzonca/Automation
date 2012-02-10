package Webdriver;

import java.io.IOException;

import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.*;
import org.browsermob.proxy.ProxyServer;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class GoogleAnalitycs {
	
	public WebDriver driver;
	String xBrowser = "firefox";
	
	@Test
    public void testSetPropertyTrackingLabel() throws Exception {
        // start the proxy		
		
        ProxyServer server = new ProxyServer(9090);
        server.start();

        // get the Selenium proxy object
        Proxy proxy = server.seleniumProxy();

        // configure it as a desired capability
        if(xBrowser.contains("firefox")){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, proxy);
        WebDriver driver = new FirefoxDriver(capabilities);
        } 
        // create a new HAR with the label "yahoo.com"sco
        server.addRequestInterceptor(new HttpRequestInterceptor() {

            public void process(
                    HttpRequest request,
                    HttpContext context) throws HttpException, IOException {
                
                String req = request.getRequestLine().getUri();
            
                System.out.println(req);
            } 

        });

        server.newHar("hyves.nl");
        driver.get("http://www.hyves.nl");
    }

	
}
