package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_ClickOnFirstProduct{

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://amazon.in");
		driver.getCurrentUrl();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click(); // using linktext

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		// driver.close();

	}

}
