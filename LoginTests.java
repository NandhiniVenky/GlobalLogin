package com.globalogic.web.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.globallogic.base.testc.BaseTest;
import com.globallogic.web.pages.DiscoveryPage;

public class LoginTests extends BaseTest {

	@Test
	public void task1() {
		discoveryPage = PageFactory.initElements(driver, DiscoveryPage.class);
		openUrl();
		discoveryPage.tapOnShows();
		discoveryPage.TapSeeAllShows();
		discoveryPage.searchForApollo("Apollo");
		discoveryPage.selectApollo();
		discoveryPage.verifyStatus();
		discoveryPage.getDoneTitles();
		discoveryPage.clickMyVideo();
		discoveryPage.isFavoritesHeaderDisplayed();
		discoveryPage.validateListOfVideos();
		
	}
}
