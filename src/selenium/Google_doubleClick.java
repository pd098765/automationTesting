package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_doubleClick {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).click();
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.id("APjFqb"));
		e1.sendKeys("news");
		Actions a1= new Actions(driver);
		a1.doubleClick(e1).perform();//double click on e1 webelement
		a1.contextClick(e1).perform();//rightclick on e1 webelement
		
	
	
	}

}
