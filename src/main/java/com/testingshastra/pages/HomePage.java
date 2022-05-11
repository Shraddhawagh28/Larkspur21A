package com.testingshastra.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends PageBaseClass{
	private static final Logger LOG=Logger.getLogger(HomePage.class) ;
	@FindBy(css = "a[href^=\"https://ijmeet.com/app\"]")
	public WebElement joinMeeting;
	@FindBy(css = "span.mvlogo-size-app1 img[alt=\"ijmeetimage\"]")
	public WebElement logo;
	
	public HomePage() {
		System.out.println("initializing driver instance");
		//super();
		//SearchContext driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnJoinMeeting() {
		joinMeeting.click();
		LOG.info("Clicked on join meeting link");

	}
	public void clickOnLogo() {
		logo.click();
		LOG.info("clicked on logo");
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
}
