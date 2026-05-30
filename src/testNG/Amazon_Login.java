package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
public class Amazon_Login extends BaseClass {

    @Test(retryAnalyzer = testNG.RetryLogic.class)//testcase should be failed then only retry will happen
    public void LoginTest()  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		WebElement e1= driver.findElement(By.xpath("//a[@data-nav-role=\"signin\"]"));
		e1.click();
		WebElement mobNo=driver.findElement(By.id("ap_email_login"));
		mobNo.sendKeys("7768027557");
		driver.findElement(By.xpath("//span[@id=\"continue\"]")).click();
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("Pooja@098765");
		WebElement signIn=driver.findElement(By.id("signInSubmit"));
		signIn.click();
	}
}
