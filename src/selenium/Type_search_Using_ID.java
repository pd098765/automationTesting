package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_search_Using_ID {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("news");
		driver.findElement(By.className("gNO89b")).click();//using classname

		//driver.close();

		
		
		//driver.findElement(By.xpath("//a[text()='About']")).click();//linktext
		//WebElement e1=driver.findElement(By.partialLinkText("Store"));
		//e1.click();
		//driver.findElement(By.name("q")).sendKeys("toys");
	}

}
