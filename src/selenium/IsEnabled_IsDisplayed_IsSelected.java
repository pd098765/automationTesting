package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_IsDisplayed_IsSelected {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Pooja/OneDrive/Desktop/GrowTechMinds/learningHTML1.html");
		
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.id("121"));
		boolean b1=e1.isDisplayed();
		System.out.println(b1);
		Thread.sleep(2000);

		boolean b2= e1.isEnabled();
		System.out.println(b2);
		Thread.sleep(3000);

		WebElement e2= driver.findElement(By.name("name1"));
		boolean b3=e2.isSelected();
		System.out.println(b3);
		Thread.sleep(3000);

		
		if(b1==true&&b2==true) {
			e1.sendKeys("Tiwari");
		}
		else {
			System.out.println("The component is not ready to be worked upon");
			e1.sendKeys("Pooja");
		}
	}

}
