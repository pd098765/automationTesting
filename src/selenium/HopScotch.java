package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HopScotch {

	public static void main(String[] args) throws InterruptedException {
     
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hopscotch.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		WebElement Account=driver.findElement(By.xpath("//span[@ng-click=\"vm.goToAccountPage()\"]"));
		Account.click();
		Thread.sleep(2000);

		WebElement SignIn=driver.findElement(By.xpath("//button[@aria-label=\"Sign in to your account\"]"));
		SignIn.click();
		Thread.sleep(2000);

		WebElement Join_Us=driver.findElement(By.xpath("//div[@class=\"css-1bd70qz\"]/child::div[2]/child::a"));
		Join_Us.click();
		Thread.sleep(2000);

		WebElement FullName=driver.findElement(By.xpath("//div[@class='css-y6fzu5']/child::input"));
		FullName.sendKeys("Pooja Subhashrao Deshmukh");
		Thread.sleep(2000);
		
		WebElement Email=driver.findElement(By.xpath("//form/child::div[2]/child::input"));
		Email.sendKeys("pooja1997deshmukh@gmail.com");
		Thread.sleep(2000);
		
		WebElement MobNo=driver.findElement(By.xpath("//div[@class='css-b7ry9m'][2]/child::input"));
		MobNo.sendKeys("7768027557");
		Thread.sleep(2000);
		
		WebElement SendOTP=driver.findElement(By.xpath("//div[@class=\"css-1ar5a3r\"]/child::button"));
		SendOTP.click();
		Thread.sleep(2000);

	}

}
