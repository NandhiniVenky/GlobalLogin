package com.globallogic.base.testc;

import com.globallogic.enums.Browser;
import com.globallogic.web.base.page.BasePage;

public class BaseTest extends BasePage {
	
	protected static Browser browser;
	
	 public Browser setup(String application, Browser browser) {
	        return browser = Browser.CHROME;
	 }	       
}

	