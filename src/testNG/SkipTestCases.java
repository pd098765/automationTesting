package testNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class SkipTestCases {
	@Test
	public void Login() {
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="Login")
	public void Logout() {
		
	}

}
