package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadTimeOut {
@Test(timeOut=2000)
public void login() {
	ChromeDriver driver = new ChromeDriver();
}
}
