package testNG;

import org.testng.annotations.Test;

public class SkipTestCases_dependsOnMethod {
	@Test
	public void Login() {
		//if this test case run succesfully then onlu logout 
		//test case will run because of dependsOnMethod
	}
	@Test(dependsOnMethods= {"Login"})
	public void Logout() {
		//depends on login testcases
	}
	

}
