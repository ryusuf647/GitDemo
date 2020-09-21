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
	
	@Test(priority=4)
	public void test_case1()	{
		System.out.println("First test case using Appium.");
	}
}