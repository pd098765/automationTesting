package amazonProject1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

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
public class ProductDetailsPage extends BaseClass {

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
		WebElement FirstShoe = driver.findElement(By.xpath("//span[@class=\"a-declarative\"]/descendant::span[@data-component-type=\"s-product-image\"]/child::a"));
		FirstShoe.click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows= driver.getWindowHandles();
		for(String window: allWindows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}

		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
		Assert.assertTrue(price.isDisplayed(), "Price is not displayed!");
		Reporter.log("Product Price: " + price.getText());

		WebElement reviews = driver.findElement(By.id("acrCustomerReviewText"));
		Assert.assertTrue(reviews.isDisplayed(), "Reviews are not displayed!");
		Reporter.log("Reviews: " + reviews.getText());

		WebElement description = driver.findElement(By.xpath("//div[@id='topHighlight']"));
		Assert.assertFalse(description.getText().isEmpty(), "Description text is empty!");
		Reporter.log("Description: " + description.getText());
		}
}
