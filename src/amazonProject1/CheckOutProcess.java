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
public class CheckOutProcess extends BaseClass {

    @Test
    public void LoginTest() throws InterruptedException  {
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
		WebElement AddToCart = driver.findElement(By.id("add-to-cart-button"));
		AddToCart.click();
		WebElement AddedToCart = driver.findElement(By.xpath("//h1[normalize-space()='Added to cart']"));
		Reporter.log(AddedToCart.getText());
		WebElement GoToCart = driver.findElement(By.xpath("(//a[normalize-space()='Go to Cart'])[2]"));
		GoToCart.click();
		WebElement CheckOut = driver.findElement(By.xpath("//input[@value=\"Proceed to checkout\"]"));
		CheckOut.click();
		WebElement RadioButton = driver.findElement(By.xpath("//div[@aria-label=\"Scan and Pay with \"]"));
		RadioButton.click();
		WebElement Submit = driver.findElement(By.xpath("//input[@data-testid=\"secondary-continue-button\"]"));
		Submit.click();
		WebElement PayByUPI = driver.findElement(By.xpath("(//input[@id='placeOrder'])[4]"));
		Assert.assertEquals(PayByUPI.isEnabled(), true);
		Reporter.log(PayByUPI.getText());
		
		
		
		}
}
