package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTech_Iframe {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/");
		Thread.sleep(5000);
		WebElement chatbot = driver.findElement(By.id("chat-bot-launcher-button"));
		chatbot.click();
		Thread.sleep(2000);
		
		WebElement iframe = driver.findElement(By.id("chat-bot-iframe"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.id("textInput"));
		text.sendKeys("Pooja Subhashrao Deshmukh" + Keys.ENTER);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		WebElement courses = driver.findElement(By.linkText("Courses"));
		courses.click();
}
}
