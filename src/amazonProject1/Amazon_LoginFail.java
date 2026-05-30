package amazonProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
public class Amazon_LoginFail extends BaseClass {
   
    @Test
    public void LoginTest()  {
        ChromeOptions options = new ChromeOptions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SignIn= driver.findElement(By.xpath("//a[@data-nav-role=\"signin\"]"));
		SignIn.click();
		WebElement mobNo=driver.findElement(By.id("ap_email_login"));
		mobNo.sendKeys("7768027557");
		driver.findElement(By.xpath("//span[@id=\"continue\"]")).click();
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("Pooja@098765a");
		WebElement submit=driver.findElement(By.id("signInSubmit"));
		submit.click();
        options.addArguments("--disable-webauthn");
		WebElement errormsg= driver.findElement(By.xpath("//div[@class='a-alert-content' and normalize-space()=\"Your password is incorrect\"]                              "));
		Reporter.log(errormsg.getText());
		Assert.assertEquals(errormsg.isDisplayed(),true);
	}
}
