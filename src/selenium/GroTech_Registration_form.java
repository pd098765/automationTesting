package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTech_Registration_form {

	public static void main(String[] args) throws InterruptedException {

		 ChromeDriver driver= new ChromeDriver();
		    driver.get("https://grotechminds.com/registeration-form/");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("firstName")).sendKeys("Pooja");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("lastName")).sendKeys("Deshmukh");
		    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pooja1997deshmukh@gmail.com");
		    driver.findElement(By.id("phone")).sendKeys("7768027557");
		    Thread.sleep(2000);
		    
		    WebElement dropdown=driver.findElement(By.xpath("//select[@id='gender']"));
		    Select s1= new Select(dropdown);
		    Thread.sleep(2000);
		    s1.selectByVisibleText("Female");
		    
		    WebElement dropdown2=driver.findElement(By.xpath("//select[@id='state']"));
		    Select s2= new Select(dropdown2);
		    Thread.sleep(4000);
		    s2.selectByVisibleText("Maharashtra");
		    
		    driver.findElement(By.id("aadhaar")).sendKeys("237809641609");
		    driver.findElement(By.id("pan")).sendKeys("CUPPD7307A");
		    Thread.sleep(7000);
		    WebElement e1 = driver.findElement(By.id("c_bs_1"));
			e1.click();
			Thread.sleep(7000);
			WebElement e2 = driver.findElement(By.xpath("//button[@name='Submit']"));
			e2.click();
	}

}
