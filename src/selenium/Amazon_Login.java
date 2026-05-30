package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Amazon_Login {

	public static void main(String[] args) throws InterruptedException {
		@BeforeMethod
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
		Thread.sleep(5000);
		driver.findElement(By.id("nav-search-submit-button")).click();
        WebElement e1= driver.findElement(By.xpath("(//span[@data-version-id=\"v35dqapfnraekx2f7ikca5m27ni\"])[1]"));
		e1.click();
		
		//give control to child window
		Set<String>allWindowIDS=driver.getWindowHandles();
		Iterator<String> pcid= allWindowIDS.iterator();
		String parentid=pcid.next();
		String chldid=pcid.next();
		driver.switchTo().window(chldid);
		
		WebElement e2= driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		e2.click();
		

	}

}
