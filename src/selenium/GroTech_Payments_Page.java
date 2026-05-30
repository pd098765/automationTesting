package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GroTech_Payments_Page {

	public static void main(String[] args) throws InterruptedException {

		 ChromeDriver driver= new ChromeDriver();
		   driver.get("https://grotechminds.com/payments/");
		   driver.manage().window().maximize();
		   driver.findElement(By.id("cardNumber")).sendKeys("123456789");//card no
		   driver.findElement(By.xpath("//input[@placeholder=\"MM/YYYY\"]")).sendKeys("04/2026");//Expiry date
		   
		   driver.findElement(By.id("cvv")).sendKeys("258");
		   WebElement e1=driver.findElement(By.id("cardType"));
		   Select s1= new Select(e1);
		   s1.selectByVisibleText("Mastercard");
		   
		   driver.findElement(By.id("amount")).sendKeys("1000");
		   Thread.sleep(7000);

		   driver.findElement(By.id("saveCard")).click();
		   Thread.sleep(7000);

		   driver.findElement(By.xpath("//input[@value='Make Payment']")).click();
	}

}
