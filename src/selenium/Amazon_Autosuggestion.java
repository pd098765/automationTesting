package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.getCurrentUrl();
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
		Thread.sleep(5000);
		List<WebElement> e1=driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/child::div"));
		e1.get(2).click();

	}

}
