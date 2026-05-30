package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.xpath("//span[text()='Google']"));
		btn.click();
		Set<String> ids = driver.getWindowHandles();
		List<String> li = new ArrayList<>(ids);
		Iterator<String> i1 = li.iterator();
		String pcid = i1.next();
		String cid = i1.next();
		driver.switchTo().window(cid);
		Thread.sleep(2000);
		driver.close();
	}

}
