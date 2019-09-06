package com.globallogic.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

	/**
	 * This method makes the driver scroll to the specified webelement
	 * @param element {WebElement} - the webelement to scroll to
	 * @param driver {Object} - the driver that runs the browser
	 */
	public static void scrollTo(WebElement element, WebDriver driver) {
		try {
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);", element);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method causes the driver to wait for the specified time
	 * @param driver {Object} - the driver that runs the browser
	 * @param seconds {integer} - timeout value in seconds
	 */
	public static void implicitWait(WebDriver driver, int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	/**
	 * This method causes the driver to wait for the specified time till the
	 * webelement is visible
	 * @param driver {Object} - the driver that runs the browser
	 * @param element {WebElement} - the webelement to wait for
	 * @param seconds {integer} - timeout value in seconds
	 */
	public static void waitTillElementIsVisible(WebDriver driver, WebElement element, int seconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method causes the driver to wait for the specified time till the
	 * webelement is clickable
	 * @param driver {Object} - the driver that runs the browser
	 * @param element {WebElement} - the webelement to wait for
	 * @param seconds {integer} - timeout value in seconds
	 */
	public static void waitTillElementIsClickable(WebDriver driver, WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
