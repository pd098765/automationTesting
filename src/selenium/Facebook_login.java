package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Facebook_login 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();			
				driver.get("https://www.google.com");
				driver.get("https://facebook.com");
				driver.getTitle();
				Thread.sleep(2000);
				driver.findElement(By.name("email")).sendKeys("pooja1997deshmukh@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.name("pass")).sendKeys("Kamal@4321");
				driver.findElement(By.xpath("//span[text()='Log in']")).click();
				
				
	}
}
			