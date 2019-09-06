package com.globallogic.web.base.page;

import com.globallogic.driver.Driver;
import com.globallogic.web.pages.DiscoveryPage;

public class BasePage extends Driver {
	
	protected DiscoveryPage discoveryPage;
	
	/**
	 * This method open the given page
	 * @return {DiscoveryPage} - takes to discovery home page
	 */
	protected DiscoveryPage openUrl() {
		driver.get("https://go.discovery.com/");
		return discoveryPage;		
	}

}
