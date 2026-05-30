package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_XpathAxes {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Pooja/OneDrive/Desktop/GrowTechMinds/employee.html");
		driver.manage().window().maximize();
		
		List<WebElement> e1= driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr"));//no of rows
		System.out.println("No of rows: "+e1.size());
		Thread.sleep(5000);
		
		List<WebElement> e2= driver.findElements(By.xpath("//table[@id='employeeTable']/thead/tr/th"));//no of columns
        System.out.println("No of columns: "+e2.size());
        Thread.sleep(5000);
        
        List<WebElement> e3= driver.findElements(By.xpath("//table[@id='employeeTable']/thead/tr/th"));//name of columns are
        for(int i=0;i<e3.size();i++) {
        	String name= e3.get(i).getText();
        	System.out.println("Column names are :"+ name);
            Thread.sleep(5000);
        }
        
        List<WebElement> e4= driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/descendant::td[text()='Ram']/following-sibling::td[2]"));//Rams salary
        for(int i=0;i<e4.size();i++) {
        String salary= e4.get(i).getText();
        System.out.println("Ram's Salary is: "+salary);    
        Thread.sleep(5000);
       }

        List<WebElement> e5= driver.findElements(By.xpath("//td[text()='80000']/preceding-sibling::td[2]"));//who's salary is 80000
        for(int i=0;i<e5.size();i++) {
        String salary= e5.get(i).getText();
        System.out.println("Who's Salary is 80000: "+salary);    
        Thread.sleep(5000);
        }

        List<WebElement> e6= driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr/child::td[1]"));//all employee names
        for(int i=0;i<e6.size();i++) {
        String employeeName= e6.get(i).getText();
        System.out.println("All employee names are : "+employeeName);    
        Thread.sleep(3000);
        }
     
	}
}
