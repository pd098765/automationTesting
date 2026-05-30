package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserBased_PopUps_CountOf_Links_ {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		List<WebElement> e1 = driver.findElements(By.tagName("a"));
		int count = e1.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			WebElement first = e1.get(i);
			String text= first.getText();
			String url = first.getDomAttribute("href");
			System.out.println(url);
			System.out.println(text);
		}

	}

}
