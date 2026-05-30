package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_ClickOn_72_links {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		Thread.sleep(3000);
		
		String Parent_window=driver.getWindowHandle();
		List<WebElement> e1= driver.findElements(By.xpath("//a"));
		int count=e1.size();
		System.out.println(count);
		
		for(WebElement e:e1) 
		{
			String url=e.getAttribute("href");
			if(url.isEmpty()) 
			{
				continue;
			}else 
			{
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get(url);
				Thread.sleep(2000);
				driver.switchTo().window(Parent_window);
				//driver.close();
			};
		}
		
		driver.quit();	
	}
}
