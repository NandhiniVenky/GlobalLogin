package com.globallogic.web.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.globallogic.utils.Helper;
import com.globallogic.web.base.page.BasePage;

public class DiscoveryPage extends BasePage {
	
	public DiscoveryPage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Object repository for Discovery screen
	 */
	
	@FindBy(xpath = "//span[text(),'Shows']")
	public WebElement showsButton;
	
	@FindBy(linkText = "See All Shows")
	public WebElement seeAllShowOption;
	
	@FindBy(xpath = "//svg[@viweBox = '0 0 26 25']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//input[@placeholder = 'Search Discovery']")
	public WebElement searchBox;
	
	@FindBy(linkText = "View All Results")
	public WebElement viewAllResults;
	
	@FindBy(xpath = "//div[@class = 'searchGridTile__image']")
	public List<WebElement> apollo;
	
	@FindBy(xpath = "//div/span/i[@class = 'flipIconCore__icon icon-plus']")
	public WebElement addFavorites;
	
	@FindBy(xpath = "//div/span/i[@class = 'flipIconCore__icon icon-minus']")
	public WebElement removeFavorites;
	
	@FindBy(xpath = "//svg[@class = 'dscHeaderMain__iconMenu']")
	public WebElement favoritesVideoListIcon;
	
	@FindBy(linkText = "My Videos")
	public WebElement myVideos;
	
	@FindBy(xpath = "//div[text() = 'Behind the iconic images of Apollo 11 is an untold story. With full cooperation from NASA, learn about this…']")
	public WebElement favoritesVideo;
	
	@FindBy(xpath = "//h2[text() = 'Favorite Shows']")
	public WebElement favoritesShowsHeader;
	
	@FindBy(xpath = "//div[@class = 'notification__main']")
	public WebElement notifications;
	
	public void tapOnShows() {
		showsButton.click();
	}
	
	public void TapSeeAllShows() {
		Helper.scrollTo(seeAllShowOption, driver);
		seeAllShowOption.click();
	}
	
	public void searchForApollo(String searchText) {
		Helper.implicitWait(driver, 30);
		searchButton.click();
		searchBox.sendKeys(searchText);
		viewAllResults.click();
	}
	
	public void selectApollo() {
		Helper.implicitWait(driver, 10);
		apollo.get(0);
	}
	
	
	public void verifyStatus() {
		Helper.implicitWait(driver, 30);
		if(addFavorites.isDisplayed())	{
			addFavorites.click();
		}
		else {
			removeFavorites.click();
		}
	}
	
	public String getDoneTitles() {
		return notifications.getText();	
	}
	
	public void clickMyVideo() {
		Helper.implicitWait(driver, 10);
		favoritesVideoListIcon.click();
		Helper.waitTillElementIsClickable(driver, myVideos, 30);
		myVideos.click();
	}
	
	public boolean isFavoritesHeaderDisplayed() {
		return favoritesShowsHeader.isDisplayed();
	}
	
	public String validateListOfVideos() {
		return notifications.getText();
		
		
	}
	
}
