package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_actionsClass {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("news");
		driver.findElement(By.className("gNO89b")).click();//using classname
	}

}
