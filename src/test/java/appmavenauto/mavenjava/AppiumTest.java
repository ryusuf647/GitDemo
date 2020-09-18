package appmavenauto.mavenjava;

import org.testng.annotations.Test;

public class AppiumTest {
	
	@Test(groups="Smoke Test",priority=1)
	public void mobileLogin()	{
		System.out.println("Testing the mobile login feature.");
	}
	
	@Test(priority=2)
	public void nativeAndroidApp()	{
		System.out.println("From AppiumTest.java: NativeAndroidApp");
	}
	
	@Test(priority=3)
	public void iosApp()	{
		System.out.println("From AppiumTest.java: NativeIOSApp");
	}
}