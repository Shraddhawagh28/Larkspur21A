package com.testinshastra.keyword;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testingshstra1.config.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiKeyword  {
	public static RemoteWebDriver driver = null;

	/**
	 * This Keyword is used to launch specified browser
	 * 
	 * @author shraddhawagh must be one of the following
	 *         <ul>
	 *         <li>chrome</li>
	 *         <li>firefox</li>
	 *         <li>ie</li>
	 *         </ul>
	 */
	public void openBrowser(String browserName) {
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
			System.err.println("Invalid browser Name" + browserName);
		}
	}
	public void closeBrowser() {
		driver.close();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void launchurl(String url) {
		driver.get(url);
	}
	public void click(WebElement element) {
		element.click();
	}
	public void enterText(WebElement element,String textToEnter) {
		element.sendKeys(textToEnter);
	}
	public String getTitleOfPage() {
		return driver.getTitle();
		
	}

	public RemoteWebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	}
 
