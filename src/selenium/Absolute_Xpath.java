package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("file:///C:/Users/Pooja/OneDrive/Desktop/GrowTechMinds/learningHTML1.html");
			WebElement link=	driver.findElement(By.xpath("/html/body/a"));
			//link.click();
			link.sendKeys(Keys.ENTER);
			System.out.println(link);
			
		}		
	}


