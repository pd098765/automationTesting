package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
public class AmazonLogin_Logout_Assertion extends BaseClass {

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
		
		WebElement hoverover= driver.findElement(By.xpath("//div[@id=\"nav-link-accountList\"]"));
		
		Actions a1= new Actions(driver);
		a1.moveToElement(hoverover).perform();
		WebElement signOut= driver.findElement(By.xpath("//a[@id=\"nav-item-signout\"]"));
		signOut.click();
		
		WebElement SignINPage= driver.findElement(By.xpath("//h1[normalize-space(text())='Sign in or create account']"));
		Assert.assertEquals(SignINPage.getText(), "Sign in or create account");
	}
}
