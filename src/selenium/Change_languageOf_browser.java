package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Change_languageOf_browser {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("lang=hi");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");
	}

}
