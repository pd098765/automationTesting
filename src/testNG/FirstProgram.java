package testNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
	public class FirstProgram 
	{
		@Test
		public static void loginToAmazon() throws InterruptedException
		{
			ChromeDriver driver=new ChromeDriver();			
			driver.get("https://www.amazon.in");
			Thread.sleep(4000);
			WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
			e1.sendKeys("toys");
			WebElement e2=	driver.findElement(By.id("nav-search-submit-button"));
			e2.click();			
	}
	}


