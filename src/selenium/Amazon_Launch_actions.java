package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Launch_actions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//span[text()='Fresh']"));//hoverover

		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(3000);

		WebElement e2 = driver.findElement(By.xpath("//img[@alt='Amazon Now']"));
		e2.click();

	}

}
