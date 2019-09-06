package com.globallogic.enums;

import java.util.HashMap;
import java.util.Map;

public enum Browser {

	CHROME("chrome"), FIREFOX("firefox"), UNKNOWN("");

	private String browserName;

	private Browser(String browserName) {
		this.browserName = browserName;
	}

	/**
	 * This method returns the corresponding browser enum
	 * @param browserName {String} - the name of the browser
	 * @return {Browser} - returns Browser enum
	 */
	public static Browser getBrowserName(String browserName) {
		Map<String, Browser> map = new HashMap<>();
		for (Browser browser : Browser.values()) {
			map.put(browser.browserName, browser);
		}
		if (map.containsKey(browserName)) {
			return map.get(browserName);
		} else {
			return Browser.UNKNOWN;
		}
	}
}

