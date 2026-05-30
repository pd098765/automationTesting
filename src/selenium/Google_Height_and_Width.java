package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Height_and_Width {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).click();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.name("q"));
		int height=search.getSize().getHeight();
		int width= search.getSize().getWidth();
		System.out.println("Height is: "+height);
		System.out.println("width is: "+width);
		

	}

}
