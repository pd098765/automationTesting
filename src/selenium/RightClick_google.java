package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_google {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement e1= driver.findElement(By.xpath("//a[text()='Store']"));
		Actions a1= new Actions(driver);
		a1.contextClick().perform();
	}

}
