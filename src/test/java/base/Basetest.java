package base;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Basetest {
	
	public WebDriver driver;
		
	public WebDriver initializeBrowser(String browserName) throws MalformedURLException {
			
		DesiredCapabilities dc = new DesiredCapabilities();
	
				
		if(browserName.equalsIgnoreCase("chrome"))
		{ 
			
			dc.setBrowserName("chrome");
			
			
		}else if (browserName.equalsIgnoreCase("firefox")) 
		{
			dc.setBrowserName("firefox");
			dc.setVersion("115");
			
		}else if (browserName.equalsIgnoreCase("edge"))
		{
			dc.setBrowserName("edge");
		
		}
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:8080"), dc);
		driver.manage().window().maximize();
		return driver;	
   }
}
