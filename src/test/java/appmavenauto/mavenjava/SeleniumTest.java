package appmavenauto.mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test(groups="Smoke Test",priority=1)
	public void webLogin()	{
		System.out.println("All in 1 web test!");
	}
}