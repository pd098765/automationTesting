package testNG;

import org.testng.annotations.Test;

public class GroupingTestCase {
	@Test(groups={"smoke"})
	public void testcase1() {
		
	}
	@Test(groups={"smoke"})
	public void testcase2() {
		
	}
	@Test(groups={"System"})
	public void testcase3() {
		
	}
	@Test(groups={"Integration","Regression"})
	public void testcase4() {
		
	}
	@Test(groups={"Integration","System"})
	public void testcase5() {
		
	}

}
