package tests;

import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Basetest;

public class one extends Basetest {
	
	@Test
	public void testone() {
		
		driver.get("https://freecrm.in");
		System.out.println(driver.getTitle()+" for chrome");
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		
		driver = initializeBrowser("chrome");
	}
	
	@AfterMethod
	public void AfterMethod() {
		driver.quit();
	}
	
}
