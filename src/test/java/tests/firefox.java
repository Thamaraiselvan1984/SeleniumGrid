package tests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class firefox {
	
	public static void main(String[] args) throws MalformedURLException
	{	
    	   FirefoxOptions options = new FirefoxOptions();
    	   options.setPlatformName("WINDOWS 10");
    	   options.setCapability("browserName", "firefox");
  
            WebDriver driver = new RemoteWebDriver(new URL("http://172.18.0.2:4444/wd/hub"), options);
            driver.manage().window().maximize();
    		driver.get("https://freecrm.in");
    		System.out.println(driver.getTitle());
    		driver.quit();
    }
}
