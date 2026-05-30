package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_CountOf_Links_OnPage {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");//website opened in headless mode
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");
		List<WebElement> e1 = driver.findElements(By.tagName("a"));
		int count = e1.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			WebElement e2 = e1.get(i);
			String url = e2.getDomAttribute("href");
			//String text = e2.getText();
			System.out.println(url);
			//System.out.println(text);
		}

	}

}
