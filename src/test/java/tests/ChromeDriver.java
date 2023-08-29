package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDriver {

	public static void main(String[] args) throws MalformedURLException {
	
		ChromeOptions options = new ChromeOptions();
		options.setCapability("browserName", "chrome");
			
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
		
		driver.manage().window().maximize();
		driver.get("https://freecrm.in");
		System.out.println(driver.getTitle());
		driver.quit();
	}	
}
