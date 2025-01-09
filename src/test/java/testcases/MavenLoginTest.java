package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenLoginTest extends BaseClass {
	
	
	
	@Test
	public void Logintestfailure() {
		
		
		test = report.startTest("LoginTestFailure");
		
		LoginPage login = new LoginPage();
		login.LoginFunction("creatorshashikiran@gmail.com","Reset@134");
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement Error= driver.findElement(By.xpath("//div[@class=\"error_msg\"]"));
		
		String ExpectedError=Error.getText();
		String ActualError = "The email address or password you have entered is invalid";
		
		Assert.assertEquals(ActualError, ExpectedError);
		
		
		report.endTest(test);
	}
	
	@Test
	public void LoginSuccessTest() {
		
		LoginPage login = new LoginPage();
		
		login.LoginFunction("creatorshashikiran@gmail.com","Reset@123");
		
		
	}
	
	
	@Test
	@Parameters({"Param1","Param2"})
	public void ParameterizedTest(String UserVal,String Passval ) {
		
		LoginPage page = new LoginPage();
		page.LoginFunction(UserVal, Passval);
	}
      
	@Test
	public void LoginTestWithExternalData() {
		
		
		String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal = sheet.getRow(1).getCell(1).getStringCellValue();
		
        LoginPage login = new LoginPage();
		
		login.LoginFunction(UserNameVal,PasswordVal);
		
	}
       
}
