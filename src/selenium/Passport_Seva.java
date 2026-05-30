package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passport_Seva {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://services1.passportindia.gov.in/forms/registration");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy']")).click();
		driver.findElement(By.xpath("//input[@data-testid='text-input-outlined']"))
				.sendKeys("POOJA SUBHASHRAO DESHMUKH");
		driver.findElement(By.xpath("(//input[@data-testid='text-input-outlined'])[2]"))
				.sendKeys("POOJA1997DESHMUKH@GMAIL.COM");
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy'])[3]")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pooja@12345");
		driver.findElement(By.xpath("//div[text()='Sign Up']")).click();
		Thread.sleep(5000);

	}

}
