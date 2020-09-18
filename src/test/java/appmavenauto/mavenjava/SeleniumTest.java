package appmavenauto.mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test(groups="Smoke Test",priority=1)
	public void webLogin()	{
		System.out.println("Web login test.");
	}
	
	@Test(priority=2)
	public void BrowserAutomation()	{
		System.out.println("From SeleniumTest.java: BrowserAutomation");
	}
	
	@Test(priority=3)
	public void elementsUI()	{
		System.out.println("From SeleniumTest.java: elementsUI");
	}
}