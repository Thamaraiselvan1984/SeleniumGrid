package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Abstractdriver {
	
	public WebDriver driver;

	public WebDriver driverstartup(String browserName) throws MalformedURLException {
		
		@SuppressWarnings("rawtypes")
		AbstractDriverOptions options = null;
		
		if(browserName.equalsIgnoreCase("chrome")) {
			options = new ChromeOptions();
			options.setCapability("browserName", "chrome");
			
		} else if(browserName.equalsIgnoreCase("firefox")) {
			options = new FirefoxOptions();
			options.setCapability("browserName","firefox");
			
		} else if(browserName.equalsIgnoreCase("edge")) {
			options = new EdgeOptions();
			options.setCapability("browserName", "edge");
		}
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:8888"), options);
		driver.manage().window().maximize();
		return driver;
	}
}
