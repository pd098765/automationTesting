package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		Thread.sleep(2000);
        List<WebElement> e1= driver.findElements(By.tagName("a"));
        int count=e1.size();
        System.out.println(count);
		
        Thread.sleep(3000);
		WebElement e2=driver.findElement(By.xpath("//input[@type='text']"));
		e2.sendKeys("Toys");
		e2.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='AMD Traders Bounce Ball, High Elasticity Rubber Football Toy, "
				+ "Multicolor Jumping Ball for Indoor Outdoor Play, Hand Eye Coordination Training, Ages 4 Plus']")).click();
		

	}

}
