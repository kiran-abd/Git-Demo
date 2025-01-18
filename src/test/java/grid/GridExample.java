package grid;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class GridExample {
	

	public static void main(String[] args) throws MalformedURLException {
		
	
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");	

	@SuppressWarnings("deprecation")
	URL url = new URL("http://192.168.1.20:4444/wd/hub");
	
	
		
		
		
	WebDriver driver = new RemoteWebDriver(url,cap);
		
	
	driver.get("https://www.simplilearn.com/");
		
		
	
	
	}

}
