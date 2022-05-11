package com.testingshastra.keyword;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.log4testng.Logger;
//import org.apache.log4j.Logger;
import com.util.constants.LocatorType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	public static RemoteWebDriver driver;
	private static WebDriverWait wait;
	private static final Logger LOG=Logger.getLogger(Keyword.class);

	/**
	 * This method will launch specified browser in maximized mode
	 * 
	 * @param browserName
	 * @author shraddha wagh must be one of the following
	 *         <ul>
	 *         <li>Chrome</li>
	 *         <li>Firefox</li>
	 *         <li>ie</li>
	 *         </ul>
	 */

	public static RemoteWebDriver openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			LOG.error("Invalid browser Name " + browserName);
		}
		LOG.info(browserName + " is launched sccessfully");
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return driver;
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	/**
	 * this methods will perform click operation on specified {@code locatorType}and
	 * {@code locatorValue}
	 * 
	 * @param element on which you want to perform
	 */
	@Deprecated
	public static void click(String locatorType, String locatorValue) {
		// driver.findElement(By.xpath(xpath)).click();
		getWebElement(locatorType, locatorValue).click();
	}

	public static void click(String locator) {
		// TODO Auto-generated method stub
		String[] parts = locator.split("##");
		getWebElement(parts[0],parts[1]).click();
	}

	public static void click(By by) {
		driver.findElement(by).click();
	}
@Deprecated
	public void enterText(String locatorType, String locatorValue, String textToEnter) {
	getWebElement(locatorType,locatorValue).sendKeys(textToEnter);
	}
	
public static void enterText(String locator,String textToEnter) {
	String[] parts=locator.split("##");
	getWebElement(parts[0], parts[1]).sendKeys(textToEnter);

	//getWebElement(locatorType,locatorValue)senKeys(TextToEnter);
}
	private static WebElement getWebElement(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("css")) {
			return driver.findElement(By.cssSelector(locatorValue));
		} else {
			LOG.error("Invalid locator type" + locatorType);
			return null;
		}
		
	}

	public static void waitFor(int duration) {
		try {
			Thread.sleep(duration);
			// wait.wait(duration);
		} catch (InterruptedException e) {
			// System.out.println("wait is interrupted");
			// e.printStackTrace();
		}
	}

	public void closeBrowser() {
		driver.close();
	}

	public void waitForPresenceOfElement(WebElement quickJoinMeetingTxt) {
		// TODO Auto-generated method stub
		
	}

	

}
