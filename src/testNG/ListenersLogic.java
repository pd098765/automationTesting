package testNG;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogic implements ITestListener {

	public static WebDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) {
		WebDriver driver = ((BaseClass) result.getInstance()).driver; // get driver from BaseClass
		ITestListener.super.onTestSuccess(result);
		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File(
				"C:\\Users\\Pooja\\GrowTechminds\\Automation_Testing\\test-output\\screenshot\\Pass\\" + date + ".png");
		try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = ((BaseClass) result.getInstance()).driver; // get driver from BaseClass
		ITestListener.super.onTestFailure(result);
		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File(
				"C:\\Users\\Pooja\\GrowTechminds\\Automation_Testing\\test-output\\screenshot\\Fail\\" + date + ".png");
		try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
