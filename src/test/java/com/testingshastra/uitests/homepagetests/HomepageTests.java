package com.testingshastra.uitests.homepagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.keyword.UiKeyword;
import com.testingshstra1.config.BaseClass;
/**
 * 
 * @author shraddhawagh
 *
 */

public class HomepageTests {
	UiKeyword keyword=new UiKeyword();
    String expectedTitle="Testing Shastra | Training | Placement";
    @Test
	public void verifyTitleOfHomePage() {
		keyword.launchurl("https://www.testingshahtra.com");
		String title=keyword.getTitleOfPage();
		Assert.assertEquals(title,expectedTitle);
		

	}
}
