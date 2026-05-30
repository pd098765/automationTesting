package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);

		WebElement e1 = driver.findElement(By.xpath("//span[@role='button']")); // ✕ application based popup handled
		e1.click();
		Thread.sleep(7000);

		WebElement e2 = driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]"));
		e2.sendKeys("toys");
		e2.sendKeys(Keys.ENTER);

		String parentWindow = driver.getWindowHandle();
		WebElement e3 = driver.findElement(By.xpath("//div[@data-id='SCOHH2FNCZZBWYYG']"));
		e3.click();

		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		while (it.hasNext()) {
			String childWindow = it.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
			}

		}
		Thread.sleep(7000);

		WebElement addToCart=driver.findElement(By.xpath("//div[text()='Add to cart']"));
		addToCart.click();
	}
}
