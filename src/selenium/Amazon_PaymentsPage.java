package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_PaymentsPage {

	public static void main(String[] args) {
    //https://www.amazon.in/checkout/p/p-404-3887647-7748347/pay?pipelineType=Chewbacca&referrer=pay
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/checkout/p/p-404-3887647-7748347/pay?pipelineType=Chewbacca&referrer=pay");
		driver.manage().window().maximize();
		
	}

}
