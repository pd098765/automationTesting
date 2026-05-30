package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonUsingExcelSheet {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\Pooja\\GrowTechminds\\Automation_Testing\\LoginDetails.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		Sheet s1 = wb.getSheet("Pooja");
		DataFormatter d1 = new DataFormatter();
		Row r1 = s1.getRow(0);
		Cell c1 = r1.getCell(0);
		String un = d1.formatCellValue(c1);
		
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(0);
		String pass = d1.formatCellValue(c2);


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.name("email")).sendKeys("7768027557");
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("ap_password")).sendKeys("Pooja@098765");
		driver.findElement(By.id("ap_password")).sendKeys(pass);

		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);

	}

}
