package testNG;

import org.testng.annotations.Test;

public class TestNG_Disable_invocationCount {
		@Test(invocationCount=3)
		public void login()
		{
			System.out.println("invocationCount=5, this will execute 5 times, follow cameCase of method name");
		}
		@Test(invocationCount=2, priority=2)
		public void login2()
		{
			System.out.println("Multiple parameters can be used together");
		}
	
		@Test(enabled=false)//disable test case using this command
		public void logout()
		{
			System.out.println("disable test case");
		}
	}
	
