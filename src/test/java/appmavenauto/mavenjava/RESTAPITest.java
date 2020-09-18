package appmavenauto.mavenjava;

import org.testng.annotations.Test;

public class RESTAPITest {
	
	@Test(groups="Smoke Test",priority=1)
	public void authTest()	{
		System.out.println("REST API authentication test.");
	}
	
	@Test(priority=2)
	public void postJira()	{
		System.out.println("postJira");
	}
	
	@Test(priority=3)
	public void deleteTweet()	{
		System.out.println("deleteTweet");
	}
}