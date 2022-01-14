package com.testingshastra.uitests.homepagetests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.testingshstra1.config.BaseFramework;
import com.testinshastra.keyword.Keyword;
import com.util.constants.Locator;
import com.util.constants.LocatorType;
import com.util.constants.Proputils;

public class Travel extends BaseFramework {
	private static final Logger LOG=Logger.getLogger(Travel.class);
	@Test
	public void verifyErrorOnSelectingSameCitiesasSourcsAndDestination() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.flipkart.com");
		Keyword.waitFor(3000);
		click(Locator.homeScreen_closePopuPbtn);
		click(Locator.homeScreen_TravelLink);
		click(Locator.homeScreen_fromCity);
		Keyword.waitFor(5000);
		// Proputils prop=new Proputils();
		// click(prop.getLocator("homeScreen.TravelLink")[0],prop.getLocator("homeScreen.TravelLink")[1]);
		Keyword.waitFor(2000);
		LOG.info("clicked on From city dropdown");
		click(Locator.homeScreen_fromCity_Bom);
		LOG.info("Selected bombay as from city");
		
	}

	private void click(String string2, String string) {
		// TODO Auto-generated method stub

	}

	@Test
	public void VerifySeachResulTfORShoes() {
		enterText(LocatorType.xpath, "input[placeholder='search for product,brands and more']", "Shoes");

	}

	private void enterText(String xpath, String string, String string2) {
		// TODO Auto-generated method stub

	}

	private void click(String string) {
		// TODO Auto-generated method stub

	}

}
