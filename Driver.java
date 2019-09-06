package com.globallogic.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.globallogic.enums.Browser;

/**
 * This class is used for creating driver instances
 * 
 */

public class Driver {
	protected WebDriver driver;
	protected DesiredCapabilities capabilities;
	protected ExtentReports extent;
	protected ExtentTest test;

	/**
	 * This method creates and retrieves an instance of chrome driver
	 * 
	 * @return {WebDriver} - an instance of chrome driver
	 */
	protected WebDriver chromeDriver() {
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		return driver;
	}

	/**
	 * This method creates and retrieves an instance of firefox driver
	 * 
	 * @return {WebDriver} - an instance of firefox driver
	 */
	protected WebDriver firefoxDriver() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	/**
	 * This method invokes the driver instance of the browser specified
	 * 
	 * @param browser - the browser instance to run
	 * @return {WebDriver} - the driver instance of the specified browser
	 */
	protected WebDriver invokeDriverOf(String browser) {
		Browser browserName = Browser.getBrowserName(browser);
		switch (browserName) {
		case CHROME:
			chromeDriver();
			break;
		case FIREFOX:
			firefoxDriver();
			break;
		default:
			chromeDriver();
			break;
		}
		return driver;
	}
}
