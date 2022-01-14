package com.testingshstra1.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testinshastra.keyword.Keyword;


import static com.testinshastra.keyword.Keyword.*;

public class BaseFramework {
	@BeforeMethod
	public void setUp() {
		Keyword.openBrowser("chrome");
		Keyword.launchUrl("https://www.flipkart.com");
		//this.driver = keyword.getDriver();

	}

	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

}
