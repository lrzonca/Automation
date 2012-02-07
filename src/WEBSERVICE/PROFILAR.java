package WEBSERVICE;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class PROFILAR extends WEBSERVICE_SELENIUM_BASE {
	
	@Test
	/* Basic and General Test
	 * checking if in response from service is not visible any error message
	 */
	public void TC_01() throws Throwable{
		String message = "<profilar><keyexchange><username>mptest</username><p>437467</p><q>645839</q><d>278558</d></keyexchange></profilar>";
		System.out.println("\nRequest:" + message);
		SendProfilarRequest(message, Profilar_Endpoint);		
		Assert.assertEquals(false, SendGetRequestResult.contains("errorcode"));		
	}		
}