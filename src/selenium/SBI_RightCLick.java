package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_RightCLick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		//driver.findElement(By.className("login_button")).click();
		driver.findElement(By.xpath("//a[@aria-label='Continue to Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Pooja Deshmukh");
		driver.findElement(By.id("label2")).sendKeys("Pooja@123");
	}

}
