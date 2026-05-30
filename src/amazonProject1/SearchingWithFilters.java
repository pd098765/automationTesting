package amazonProject1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
public class SearchingWithFilters extends BaseClass {

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
		
		WebElement category = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(category);
		s1.selectByIndex(11);
		WebElement submit= driver.findElement(By.id("nav-search-submit-button"));
		submit.click();
		WebElement MakeUp = driver.findElement(By.xpath("//span[@class=\"a-list-item\"]/descendant::span[text()='Make-up']"));
		MakeUp.click();
		driver.findElement(By.xpath("//ul[@aria-labelledby=\"n-title\"]/child::li[5]")).click();
		
		WebElement price = driver.findElement(By.xpath("//ul[@aria-labelledby=\"p_36-title\"]/child::li[3]/descendant::span[text()='₹200 - ₹500']"));
		price.click();
		WebElement priceRange = driver.findElement(By.xpath("//li[@id=\"p_36/dynamic-picker-0\"]/child::span/descendant::span"));
		priceRange.click();
		List<WebElement> li= driver.findElements(By.xpath("//div[@role='listitem']"));
	      		
		System.out.println("Total results on the page"+ li.size());
		Assert.assertEquals(li.size(), 48);
		if(!li.isEmpty()) {
			Reporter.log(li.get(0).getText());

		}
		}
}//(//button[@id="a-autoid-1-announce"])[2]
