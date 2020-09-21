package appmavenauto.mavenjava;

import org.testng.annotations.Test;

public class RESTAPITest {
	
	@Test(groups="Smoke Test",priority=1)
	public void authTest()	{
		System.out.println("REST API authentication test.");
	}
	
	@Test(priority=2)
	public void postJira()	{
		System.out.println("postJira1");
		System.out.println("postJira2");
		System.out.println("postJira3");
	}
	
	@Test(priority=3)
	public void updateJira()	{
		System.out.println("Ticket updated!");
	}
	
	@Test(priority=4)
	public void deleteTweet()	{
		System.out.println("Tweet has been deleted.");
	}
	
	@Test(priority=5)
	public void sysRestore()	{
		System.out.println("System files restored.");
	}
}