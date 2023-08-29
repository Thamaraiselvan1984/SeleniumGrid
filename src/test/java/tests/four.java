package tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Basetest;

public class four extends Basetest {

	@Test
	public void testtwo() {
		
		driver.get("https://freecrm.in");
		System.out.println(driver.getTitle()+" for Opera");
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		
		driver = initializeBrowser("opera");
	}
	
	@AfterMethod
	public void AfterMethod() {
		driver.quit();
	}

}
