package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	ExtentTest test = BaseClass.test;
	
	
	
	
	//================WebElements===============//
	@FindBy(xpath = "//a[@class=\"login\"]")
	WebElement loginbt;
	
	@FindBy(xpath = "//input[@name=\"user_login\"]")
	WebElement Email;
	
	@FindBy(xpath = "//input[@name=\"user_pwd\"]")
	WebElement Pwd;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement Login;
	
	
	
	
	//Below contructor is used to create a driver instance
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	 //=====================Functions====================//
	 public void LoginFunction(String UserName, String Password) {
		
		
			
			loginbt.click();
			test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			Email.sendKeys(UserName);
			test.log(LogStatus.PASS, "Pass username", "entered user successfullly");


			Pwd.sendKeys(Password);
			Login.click();
			
		}
	
	 public void UiCheck() {
		 
		 Assert.assertTrue(Email.isDisplayed());
		 
	 }

}
