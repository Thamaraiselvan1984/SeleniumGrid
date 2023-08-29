package tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Basetest;

public class Three extends Basetest {

	
	@Test
	public void testThree() {
		
		driver.get("https://freecrm.in");
		System.out.println(driver.getTitle()+" for Edge");
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		
		driver = initializeBrowser("edge");
	}
	
	@AfterMethod
	public void AfterMethod() {
		driver.quit();
	}
}
