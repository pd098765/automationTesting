package testNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;
public class Facebook_DataProvider extends BaseClass {
	
	@DataProvider()
	public Object[][] dataforSearching() {
		Object[][] d1= new Object[5][2];
		//1st row 
		d1[0][0]="pooja1997deshmukh@gmail.com";//valid email
		d1[0][1]="Kamal@4321";//valid pass
		
		//2nd row 
		d1[1][0]="7768027557";//valid mob
		d1[1][1]="Kamal@4321";//valid pass
		
		//3rd row 
		d1[2][0]="pooja1997deshmukh@gmail.com";//valid email
		d1[2][1]="Pooja@12325";//invalid pass
		
		//4th row 
		d1[3][0]="pooja19972deshmukh@gmail.com";//Invalid email
		d1[3][1]="Pooja@12325";//invalid pass
		
		//5th row 
		d1[4][0]="";//Blank
		d1[4][1]="";//Blank
		
		return d1;	
	}
    @Test(dataProvider="dataforSearching")
    public void LoginTest(String UN, String Pass)  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		WebElement Email= driver.findElement(By.xpath("//input[@name=\"email\"]"));
		Email.sendKeys(UN);
		Reporter.log("Email Entered Succesfully");
		WebElement Password= driver.findElement(By.xpath("//input[@type=\"password\"]"));
		Password.sendKeys(Pass);
		Reporter.log("Password Entered Succesfully");

//		WebElement SignIN= driver.findElement(By.xpath("//span[text()='Log in']"));
//		SignIN.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("com"));
		Reporter.log("Assertion Validated Succesfully");

		
	}
}
