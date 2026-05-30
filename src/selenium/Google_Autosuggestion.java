package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Banglore");
		Thread.sleep(5000);
		WebElement e2=driver.findElement(By.xpath("(//ul[@role=\"listbox\"]/child::li[1]/following-sibling::li)[2]"));
		System.out.println(e2.getText());
		e2.click();
		
	}

}
