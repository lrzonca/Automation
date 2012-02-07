package WEBSERVICE;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class HYSCOR extends WEBSERVICE_SELENIUM_BASE {
	
	@Test
	/* Basic and General Test
	 * checking if in response from service is not visible any error message
	 */
	public void TC_01() throws Throwable{
		SendGetRequest(Hyscor_Endpoint + "/hs/pb/1/position/2/24/1/148121?score=400&username=null&hash=null&friends=1&group=daily&gamelevel=0&authenticated=1&outputtype=xml");
		Assert.assertEquals(false, SendGetRequestResult.contains("errorcode"));
	}		
}