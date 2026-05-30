package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
        driver.get("https://www.google.com/");
        List<WebElement> e1= driver.findElements(By.tagName("a"));
        int count=e1.size();
        System.out.println(count);
        for(int i=0;i<count;i++) {
        	WebElement e2=e1.get(i);
        	String url=e2.getDomAttribute("href");
        	System.out.println(url);
        	verifyLink(url);
        }
        	
        }
    static void verifyLink(String url) throws IOException {
    	try {
    	URL u1= new URL(url);
    	HttpURLConnection c1= (HttpURLConnection) u1.openConnection();
//    	if(c1.getResponseCode()==200) {
//    		System.out.println("Link is valid->"+"Response message is->"+c1.getResponseMessage());
//    	}else {
//    		System.out.println("Link is Invalid->"+"Response message is->"+c1.getResponseCode()+c1.getResponseMessage());
//    	}

	}
    	catch(MalformedURLException m1) {
    		System.out.println("Exception handled");
    	}

}
}
