package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	@Parameters("browser")
	
	@BeforeMethod
	public void setup(String browser) {
	    if (browser.equalsIgnoreCase("chrome")) {
	        driver = new ChromeDriver();
	    } else if (browser.equalsIgnoreCase("firefox")) {
	        driver = new FirefoxDriver();
	    } else if (browser.equalsIgnoreCase("edge")) {
	        driver = new EdgeDriver();
	    }
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/");

	}

	@AfterMethod
	public void closeBrowser() {
		 if (driver != null) {
		driver.quit();
		 }
	}
}
