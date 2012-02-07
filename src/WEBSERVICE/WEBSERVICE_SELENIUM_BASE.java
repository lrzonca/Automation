package WEBSERVICE;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;


public class WEBSERVICE_SELENIUM_BASE extends WEBSERVICE_COMMON{	
	@BeforeMethod
	public void setUp(Method method) throws Exception {
		System.out.println("START Method");
	}
	
	@AfterMethod
	public void tearDown(ITestResult _result) {
		if (!_result.isSuccess()) {
			System.out.println("###TEST RESULT: WARNING###");
		}
		else {
			System.out.println("###TEST RESULT: OK###");		
		}
		System.out.println("****");
	}	
}