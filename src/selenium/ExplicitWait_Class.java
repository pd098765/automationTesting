package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Class {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.titleIs("Google"));
		
		wait.until(ExpectedConditions.titleContains("Google"));
		wait.until(ExpectedConditions.urlContains(".com"));
		wait.until(ExpectedConditions.urlToBe("https://www.google.com/"));
		wait.until(ExpectedConditions.urlMatches("https://www\\.google\\.com/"));
		
		WebElement e1 = driver.findElement(By.name("q"));
		wait.until(ExpectedConditions.elementToBeClickable(e1));
		e1.sendKeys("toys");
		WebElement search= driver.findElement(By.xpath("(//input[@name=\"btnK\"])[2]"));
	   
		wait.until(ExpectedConditions.visibilityOf(search));
        //search.sendKeys(Keys.ENTER);	
        
       // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@role=\"presentation\"]")));

        // Now fetch elements AFTER wait
//        List<WebElement> results = driver.findElements(By.xpath("//li[@role=\"presentation\"])"));
//
//        System.out.println("Total results: " + results.size());
//	
	}

}
