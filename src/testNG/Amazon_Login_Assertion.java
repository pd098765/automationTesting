package testNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Amazon_Login_Assertion extends BaseClass {

    @Test(retryAnalyzer = testNG.RetryLogic.class)//testcase should be failed then only retry will happen
    public void LoginTest() throws InterruptedException  {
    	SoftAssert a1= new SoftAssert();//Soft Assertion object created 
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
		Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, "
				+ "Watches, Shoes and More - Amazon.in");
		WebElement SearchBox= driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Shoes");
		SearchBox.sendKeys(Keys.ENTER);
		WebElement FirstProduct= driver.findElement(By.xpath("(//div[@role=\"listitem\"])[1]"));
		FirstProduct.click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it= window.iterator();
		String ParentID = it.next();
		String ChildID = it.next();
		driver.switchTo().window(ChildID);
		
		//verifying that product page is displayed using soft assertion
		WebElement BuyNow= driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]"));//element of assertion to be verified
		a1.assertEquals(BuyNow.isDisplayed(), true, "Buy Now button is displayed"); // actual logic of assertion and msg
		
		WebElement AddToWishlist= driver.findElement(By.xpath("//input[@aria-label=\"Add to Wish List\"]"));
		AddToWishlist.click();
		//Verifying that product is added to wishlist using hard assertion
		WebElement ViewYourList = driver.findElement(By.xpath("//a[text()='View Your List']"));
		Assert.assertEquals(ViewYourList.isDisplayed()&&ViewYourList.isEnabled(), true, "View your list id displayed");
		a1.assertAll();
}
}
