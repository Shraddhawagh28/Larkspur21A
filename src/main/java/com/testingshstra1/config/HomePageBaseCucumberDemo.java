package com.testingshstra1.config;

import static com.testingshastra.keyword.Keyword.launchUrl;
import static com.testingshastra.keyword.Keyword.openBrowser;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testingshastra.keyword.Config;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HomePageBaseCucumberDemo {
	public static RemoteWebDriver driver;

	//@Before
//	public void setup() {
//		this.driver = openBrowser("Chrome");
	//	Config conf = new Config();
		// Keyword.launchUrl("https://www.flipkart.com");
		// this.driver = keyword.getDriver();
	//	launchUrl(conf.getAppUrl());
		// return null;

//	}

	//@After
	//public void tearDown() {
	//	driver.quit();
	}

	//@BeforeStep
	//public void beforeStep() {
	//	System.err.println("Before step");
	//}

//	@AfterStep
	//public void afterStep() {
//		System.err.println("After step");
//	}
//}
