package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
		driver.findElement(By.id("nav-search-submit-button")).click();
        WebElement e1= driver.findElement(By.xpath("(//script[@data-version-id=\"vo2tekhfkba2j2khhm0orzxrl9\"])[1]"));

		
		
	}

}
