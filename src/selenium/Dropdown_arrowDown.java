package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_arrowDown {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver= new ChromeDriver();
		    driver.get("https://amazon.in");
		    driver.getCurrentUrl();
		    Thread.sleep(4000);
		    WebElement e1= driver.findElement(By.id("searchDropdownBox"));
		    e1.sendKeys(Keys.ARROW_DOWN);
		    Thread.sleep(1000);
		    e1.sendKeys(Keys.ARROW_DOWN);
		    Thread.sleep(1000);
		    e1.sendKeys(Keys.ARROW_DOWN);
		    Thread.sleep(1000);
		    e1.sendKeys(Keys.ARROW_DOWN);
		    Thread.sleep(1000);
		    e1.sendKeys(Keys.ARROW_DOWN);
		    Thread.sleep(1000);
		    e1.sendKeys(Keys.ARROW_DOWN);
		    Thread.sleep(1000);
		    
		    Select s1=new Select(e1);
			Thread.sleep(2000);
            s1.selectByValue("search-alias=stripbooks");
			//s1.selectByIndex(11);
			//s1.selectByVisibleText("Books");


	}

}
//searchDropdownDescription