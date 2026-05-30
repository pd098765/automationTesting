package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Assignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getTitle());
		WebElement e1=driver.findElement(By.id("gh-ac"));
		e1.sendKeys("Toys");
		driver.findElement(By.xpath("//span[@class='gh-search-button__label']")).click();
		Thread.sleep(3000);
		//trying to select the product from list using anchor tag

		WebElement e2=driver.findElement(By.xpath("(//a[@class='s-card__link image-treatment'])[3]"));
		e2.click();
		System.out.println(driver.getTitle());
		driver.quit();
		}

}
