package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BSE_India_Xpath_Axes {

	public static void main(String[] args) throws InterruptedException,IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bseindia.com/sensex/code/16");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(9000);
		WebElement V_Toppers= driver.findElement(By.xpath("//button[@id='voltop']"));
		Thread.sleep(5000);
		System.out.println(V_Toppers.getText());
		V_Toppers.click();
		Thread.sleep(5000);

		List<WebElement> list= driver.findElements(By.xpath("//table[@class=\"table table-striped table-hover\"]/tbody/tr/td[1]"));
		Thread.sleep(5000);		

		System.out.println("count"+" "+list.size());

		for(WebElement l:list)
		{
        System.out.println("Name of element is : "+" "+ l.getText());
		Thread.sleep(1000);		
	}
		WebElement Bajaj_f= driver.findElement(By.xpath("(//table[@class=\"table table-striped table-hover\"]/tbody/tr/td[3])[1]"));
		Thread.sleep(4000);
		System.out.println("T/O Cr of BAJAJFINSV is "+Bajaj_f.getText());
}
}
