package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_X_and_Y {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.linkText("Amazon Science"));//hoverover
        int x= e1.getLocation().getX();
        int y= e1.getLocation().getY();
        System.out.println(x);
        System.out.println(y);
        
		

	}

}
