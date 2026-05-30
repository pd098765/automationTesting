package testNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Amazon_Login_DataProvider extends BaseClass {
	
	@DataProvider()
	public Object[][] dataforSearching() {
		Object[][] d1= new Object[4][1];
		d1[0][0]="Shoes";
		d1[1][0]="Mobiles";
		d1[2][0]="Books";
		d1[3][0]="Headphones";	
		return d1;	
	}
    @Test(dataProvider="dataforSearching")
    public void LoginTest(String input)  {
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
		WebElement SearchBox= driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys(input);
		SearchBox.sendKeys(Keys.ENTER);
		List<WebElement> ShoeList=driver.findElements(By.tagName("//a"));
	}
}
