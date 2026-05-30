package amazonProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
public class SearchProduct extends BaseClass {

    @Test
    public void LoginTest()  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SignIn= driver.findElement(By.xpath("//a[@data-nav-role=\"signin\"]"));
		SignIn.click();
		WebElement mobNo=driver.findElement(By.id("ap_email_login"));
		mobNo.sendKeys("7768027557");
		driver.findElement(By.xpath("//span[@id=\"continue\"]")).click();
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("Pooja@098765");
		WebElement signIn=driver.findElement(By.id("signInSubmit"));
		signIn.click();
		WebElement SearchBox= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		SearchBox.sendKeys("shoe");
		SearchBox.sendKeys(Keys.ENTER);
		WebElement text= driver.findElement(By.xpath("//h2[@class=\"a-size-base a-spacing-small a-spacing-top-small a-text-normal\"]/child::span[text()='1-48 of over 100,000 results for']"));
		Assert.assertEquals(text.getText(), "1-48 of over 100,000 results for");
		Reporter.log(text.getText());
		
		
			}
}
