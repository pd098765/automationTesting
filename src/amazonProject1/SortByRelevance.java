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
public class SortByRelevance extends BaseClass {

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
		WebElement dropdown = driver.findElement(By.id("s-result-sort-select"));
		Select s1= new Select(dropdown);
		s1.selectByIndex(5);
		String Text = s1.getFirstSelectedOption().getText();
		Assert.assertEquals(Text, "Best Sellers");
		Reporter.log("Sorted By "+Text);
		WebElement price = driver.findElement(By.xpath("(//ul[@id=\"filter-p_36\"]/descendant::li)[3]"));
		price.click();
		Assert.assertTrue(price.isDisplayed(),"price not displayed");
		Reporter.log("Sort By Price :"+price.getText());	
		WebElement rating = driver.findElement(By.xpath("//span[@class=\"a-declarative\"]/descendant::li//div[@class=\"a-section\"]/descendant::i"));
		rating.click();
		String RatingText = driver.findElement(By.xpath("//span[@class=\"a-icon-alt\" and text()='4 Stars']")).getText();
		Assert.assertTrue(RatingText.isEmpty(),"Rating not displayed");
		Reporter.log("Customer Rating"+RatingText);
	
		
		
		}
}
