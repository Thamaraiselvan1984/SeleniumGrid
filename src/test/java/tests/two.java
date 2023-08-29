package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Basetest;

public class two extends Basetest {
	
	public WebDriver driver;
	@Test
	public void testtwo() {
		
		driver.get("https://freecrm.in");
		System.out.println(driver.getTitle()+" for firefox");
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		
		driver = initializeBrowser("firefox");
	}
	
	@AfterMethod
	public void AfterMethod() {
		driver.quit();
	}

}
