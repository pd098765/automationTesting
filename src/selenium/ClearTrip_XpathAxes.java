package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip_XpathAxes {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		//WebElement popup=driver.findElement(By.xpath("//div[@class=\"pb-1 px-1 flex flex-middle nmx-1\"] "));
		//using xpath axes
		WebElement popup=driver.findElement(By.xpath("//div[@data-testid=\"loginPopup\"]/div/div[@class=\"pb-1 px-1 flex flex-middle nmx-1\"]/child::*/child::*"));
		popup.click();

	}

}
