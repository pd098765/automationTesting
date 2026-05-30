package testNG;

import org.testng.annotations.Test;

public class TestNG_Priority {
	@Test(priority = -1) // this will execute first due to negative priority
	public void logout1() {

		System.out.println("priority is -1, this will execute first due to lowest or negative priority");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("priority=2, this will execute 4th because of priority is 2");
		// alpahebtic order of methd name
	}

	@Test(priority = 1) // priority will execute from 0 to n, Number order will follow
	public void register() {
		System.out.println("priority =1, this will execute 3rd because of priority is 1");
	}

	@Test (enabled=false)// default priority is 0 it will execute second but now this method is disabled so it will not execute
	public void logout() {
		System.out.println("priority is default, this will execute 2nd because of default priority is 0");
	}

}
