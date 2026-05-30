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
public class Amazon_EditProfile extends BaseClass {

    @Test
    public void LoginTest()  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement SignIn= driver.findElement(By.xpath("//a[@data-nav-role=\"signin\"]"));
		SignIn.click();
		WebElement mobNo=driver.findElement(By.id("ap_email_login"));
		mobNo.sendKeys("7768027557");
		driver.findElement(By.xpath("//span[@id=\"continue\"]")).click();
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("Pooja@098765");
		WebElement signIn=driver.findElement(By.id("signInSubmit"));
		signIn.click();
		WebElement AccountLists = driver.findElement(By.xpath("//span[text()='Hello, Pooja']"));
		AccountLists.click();
		WebElement Login = driver.findElement(By.xpath("//div[@data-card-identifier=\"SignInAndSecurity\"]"));
		Login.click();
		WebElement Edit= driver.findElement(By.xpath("//a[@aria-label=\"Edit name\"]"));
		Edit.click();
		WebElement Name= driver.findElement(By.xpath("//input[@id=\"ap_customer_name\"]"));
		Name.clear();
		Name.sendKeys("Pooja d");
		WebElement SaveChanges= driver.findElement(By.xpath("//input[@aria-labelledby=\"cnep_1C_submit_button-announce\"]"));
		SaveChanges.click();
		WebElement Sucess = driver.findElement(By.xpath("//div[@id=\"SUCCESS_MESSAGES\"]/descendant::div[@class='a-alert-content']"));
		Reporter.log(Sucess.getText());
		Assert.assertEquals(Sucess.isDisplayed(),true);
	}
}
