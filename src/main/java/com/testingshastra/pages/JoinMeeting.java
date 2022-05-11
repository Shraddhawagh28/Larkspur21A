package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinMeeting {
	@FindBy(css="h2.m-txt")
	public WebElement quickJoinMeetingTxt;
	/**
	 * 
	 * this method will return quick join meeting" if join meeting page lands successfully
	 * @return 
	 */
	public String getPageHeading() {
		return quickJoinMeetingTxt.getText();
		
	}

}
