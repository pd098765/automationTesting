package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver=new ChromeDriver();			
				driver.get("https://www.Amazon.in");
				Thread.sleep(2000);
				
				WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
				Select s1=new Select(dropdown);
//				WebElement option=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]/child::option[2]"));//select 2nd option in the dropdown
				
//				option.click();

				List<WebElement> dropdownList = driver.findElements(By.xpath("//select[@id=\"searchDropdownBox\"]/child::option"));
				int count =dropdownList.size();
				System.out.println(count);
				
				for(int i=0;i<count;i++) 
				{
					String name= dropdownList.get(i).getText();
					System.out.println(name);
					
				}
				count++;
		}						
	}


