package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class QuickerWebsite extends QuickerBaseClass{
	
	@Test(priority=1)
	public void Register() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[@id=\"loginLink\"]")).click();	
	driver.findElement(By.xpath("(//button[@class=\"wpn_modal_actionButton\"])[1]")).click();
	WebElement mobNo=driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
			mobNo.sendKeys("7768027557");
			//mobNo.sendKeys(Keys.ENTER);
	}
	@Test(priority=2)
	public void LaunchJobs() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement Category= driver.findElement(By.xpath("//div[@class='select-category']/a"));
		Category.click();
		WebElement Jobs=driver.findElement(By.xpath("//div[@id=\"category-dropdown\"]/ul/li/a[@title=\"Jobs\"]"));
		Jobs.click();
		WebElement SearchField=driver.findElement(By.xpath("//input[@placeholder=\"Search in All India\"]"));
		SearchField.sendKeys("Testing");
		WebElement SoftwareT=driver.findElement(By.xpath("//div[@id=\"searchautosuggestnew\"]/descendant::div[@class='wrapResult']/descendant::label/span[text()='software testing']/ancestor::a"));
		SoftwareT.click();	
	}
}
