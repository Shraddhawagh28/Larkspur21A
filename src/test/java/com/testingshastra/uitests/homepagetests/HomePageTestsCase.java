package com.testingshastra.uitests.homepagetests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.keyword.Keyword;
import com.testingshastra.pages.HomePage;
import com.testingshastra.pages.JoinMeeting;
import com.testingshstra1.config.BaseClass1;

public class HomePageTestsCase extends BaseClass1{
	@Test
	public void verifyOnClickOfJoinMeetingUserLandsonQuickjoinMeetingPage() {
		HomePage home=PageFactory.initElements(driver,HomePage.class);
		home.clickOnJoinMeeting();
		JoinMeeting joinMeeting =new JoinMeeting();
		Keyword keyword=new Keyword();
		keyword.waitForPresenceOfElement(joinMeeting.quickJoinMeetingTxt);
		JoinMeeting joinMeetin=PageFactory.initElements(driver, JoinMeeting.class);
		String actual=joinMeetin.getPageHeading();
		Assert.assertEquals(actual, "Quick Join a Meeting");
		
	}

}
