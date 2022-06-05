package com.testingshastra.stepdefinations;

import org.testng.Assert;

import com.testingshastra.keyword.Keyword;
import com.testingshastra.keyword.UiKeyword;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ThirdStepDefination {
	UiKeyword keyword = new UiKeyword();
	String title = "";

@Before
public void setUp()throws Exception{
	Keyword.openBrowser("Chrome");
	Keyword.launchUrl("https://www.testingshatra.com");
}

	@When("we get the title of homepage")
	public void m2() {
		title = Keyword.getTitle();

	}
	@Then("It must equal to expected")
	public void m3() {
		Assert.assertEquals("Testing Shastra | Training| Placement, ", "title");
	}

}
