package WEBSERVICE;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class REPORTAR extends WEBSERVICE_SELENIUM_BASE {
	
	@Test
	/* Basic and General Test
	 * checking if in response from service is not visible any error message
	 */
	public void TC_01() throws Throwable{
		SendGetRequest(Reportar_Endpoint + "/rp/mn/1/listcontent/3/90?outputtype=xml");
		Assert.assertEquals(false, SendGetRequestResult.contains("errorcode"));
	}		
}