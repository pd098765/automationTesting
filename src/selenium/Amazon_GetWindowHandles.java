package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);

		List<WebElement> e1=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
        for(int i=0;i<5;i++) {
        	e1.get(i).click();
    		Thread.sleep(5000);

        }
        Set<String> allHandles=driver.getWindowHandles();
        int count =0;
        for(String windoID: allHandles) {
        	if(count==3) {
        	driver.switchTo().window(windoID);
        	System.out.println(driver.getTitle());
   
        }
        count++;
		}
	}
	}
