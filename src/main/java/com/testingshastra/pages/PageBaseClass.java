package com.testingshastra.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.testingshstra1.config.BaseClass1;

public class PageBaseClass {
	public RemoteWebDriver driver;
	public void PageBase() {
		this.driver= BaseClass1.driver;
		
	}

}
