package com.testingshastra.stepdefinations;

import org.testng.Assert;

import com.testingshastra.pages.HomePage;
import com.testingshastra.pages.JoinMeeting;
import com.testingshstra1.config.HomePageBaseCucumberDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefination {

	@When("user clik on join meeting from homepage")
	public void ClickonMeeting() {
		HomePage home = new HomePage();
		home.clickOnJoinMeeting();
	}

	@Then("Verify thst user redirects on Quick join Meeting page")
	public void verify_thst_user_redirects_on_quick_join_meeting_page() {
		JoinMeeting joinMeeting = new JoinMeeting();
		String actual = joinMeeting.getPageHeading();
		Assert.assertEquals(actual, "Quick Join a Meeting");
	}

	@Then("verify title of ijmeet homepage is {string}")
	public void VerifyTitle(String expectedTitle) {
      HomePage home=new HomePage();
      String title=home.getTitle();
      Assert.assertEquals(title,expectedTitle );
	}

}
