package amazonProject1;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Register extends BaseClass {

    @Test
    public void LoginTest()  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(8));
		Actions a1= new Actions(driver);
		WebElement AccountLists =driver.findElement(By.xpath("//button[@aria-label=\"Expand Account and Lists\"]"));
		a1.moveToElement(AccountLists).perform();
		//AccountLists.click();
		WebElement NewUser= driver.findElement(By.xpath("//a[text()='Start here.']"));
		NewUser.click();
		WebElement MobNo= driver.findElement(By.id("ap_email_login"));
		MobNo.sendKeys("9359782269");
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		WebElement Password= driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Password.sendKeys("May@123");
		WebElement SignIN= driver.findElement(By.id("signInSubmit"));
		SignIN.click();
		WebElement SignInWithOtp = driver.findElement(By.id("auth-login-via-otp-btn"));
		SignInWithOtp.click();
		
	    WebElement OTPField= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-describedby='inline-otp-messages']")));
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter OTP here: ");
	    String manualOTP = sc.nextLine();
	    OTPField.sendKeys(manualOTP);

	    WebElement Verify= driver.findElement(By.xpath("//input[@aria-label=\"Verify OTP Button\"]"));
	    Verify.click();

		Assert.assertEquals(driver.getTitle().contains("Amazon.in"),true);
	   
		
	}
}
