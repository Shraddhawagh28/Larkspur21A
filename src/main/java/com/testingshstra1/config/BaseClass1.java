package com.testingshstra1.config;

import static com.testingshastra.keyword.Keyword.*;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testingshastra.keyword.Config;
import com.testingshastra.keyword.Keyword;

public class BaseClass1 {
	public static RemoteWebDriver driver;

	@BeforeMethod
	public void setup() {
		this.driver = openBrowser("chrome");
		Config conf = new Config();
		// Keyword.launchUrl("https://www.flipkart.com");
		// this.driver = keyword.getDriver();
		launchUrl(conf.getAppUrl());
		// return null;

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
