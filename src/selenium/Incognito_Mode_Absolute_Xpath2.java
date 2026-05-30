package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_Mode_Absolute_Xpath2 
{

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); // website opened in maximized mode from begining
		options.addArguments("incognito");//website opened in incognito mode

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		

	}
}
