package testcases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;


import java.io.File;

public class TestListenerClass implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("=======Test Started======");
		
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		

		TakesScreenshot obj = (TakesScreenshot) BaseClass.driver;
		File file= obj.getScreenshotAs(OutputType.FILE);
		
		
			try {
				FileUtils.copyFile(file, new File("image1.png"));
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
