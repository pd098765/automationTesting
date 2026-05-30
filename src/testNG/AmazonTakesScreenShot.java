package testNG;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNG.ListenersLogic.class)

public class AmazonTakesScreenShot extends BaseClass {

	@Test(priority=1)
    public void LoginTest() throws IOException  {
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
	@Test(priority=2)
    public void LoginTest1() throws IOException  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		WebElement e1= driver.findElement(By.xpath("//a[@data-nav-role=\"signin\"]"));
		e1.click();
		WebElement mobNo=driver.findElement(By.id("ap_email_login"));
		mobNo.sendKeys("7768027557");
		driver.findElement(By.xpath("//span[@id=\"continue\"]")).click();
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("Pooja@098765");
		WebElement signIn=driver.findElement(By.id("1signInSubmit"));
		signIn.click();
}
}
//String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss"));
//TakesScreenshot ts=(TakesScreenshot) driver;
//File source= ts.getScreenshotAs(OutputType.FILE);
////File destination= new File("C:\\Users\\Pooja\\GrowTechminds\\Automation_Testing\\test-output\\screenshot\\TestCase.png");
////File destination= new File("C:\\Users\\Pooja\\GrowTechminds\\Automation_Testing\\test-output\\screenshot\\"+new AmazonTakesScreenShot().getClass()+".png");
//File destination= new File("C:\\Users\\Pooja\\GrowTechminds\\Automation_Testing\\test-output\\screenshot\\"+new AmazonTakesScreenShot().getClass()+date+".png");
//
//FileHandler.copy(source, destination);