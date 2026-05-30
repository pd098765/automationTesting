package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelBook {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
				FileInputStream fs=new FileInputStream("C:\\Users\\Pooja\\GrowTechminds\\Automation_Testing\\LoginDetails.xlsx");
				Workbook wb=	WorkbookFactory.create(fs);
				Sheet s1=	wb.getSheet("Pooja");
				Row r1=	s1.getRow(0);
				Cell c1=	r1.getCell(0);
				String un=	c1.getStringCellValue();
				System.out.println(un);
				
				String pwd=	wb.getSheet("Pooja").getRow(0).getCell(1).getStringCellValue();
				System.out.println(pwd);
				
				/*
				 * ""1. Let the java know where is excel sheet

		FileInputStream(C)""				
		""2. Open the excel sheet

		Workbookfactory.create()""				
		""3. go to the right Sheet using its name
		Sheet s1=getSheet(""""loginDetails"""");
		""				
		""4. Go to the right row

		Row r1=getRow(index)""				
		""5. Go to the right column
		Cell c1=GetCell(index);""				
		""6. Fetch the value from that cell

		String un= GetStringcellValue();""				
				 */
											
										
	}

}
