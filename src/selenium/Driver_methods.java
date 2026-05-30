package selenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_methods {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);

		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		
		Set<String> ChildId=driver.getWindowHandles();
		System.out.println(ChildId);
		driver.close();
	} 

}
