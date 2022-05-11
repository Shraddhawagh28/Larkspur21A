package com.testingshstra1.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testingshastra.keyword.UiKeyword;

public class BaseClass {
	UiKeyword keyword = new UiKeyword();
	public RemoteWebDriver driver = null;

	@BeforeMethod
	public void setUp() {
		keyword.openBrowser("chrome");
		this.driver = keyword.getDriver();

	}

	@AfterMethod
	public void tearDown() {
		keyword.quitBrowser();
	}

}
