package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverSingletonPattern {
	public static WebDriver driver;

	private WebDriverSingletonPattern() {
		// Private constructor to prevent instantiation
	}
	
	public static WebDriver getDriver() {
		if (driver == null) {
			// Initialize the WebDriver instance here (e.g., new ChromeDriver())
			driver = new ChromeDriver(); // Example for Chrome
		}
		return driver;
	}

}
