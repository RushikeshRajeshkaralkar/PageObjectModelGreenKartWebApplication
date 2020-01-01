package com.qa.greenkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.greenkart.testbase.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'brand greenLogo')]")
	WebElement logoGreenKart;

	@FindBy(xpath = "//a[contains(text(),'Top Deals')]")
	WebElement TopDealsLink;

	@FindBy(xpath = "//a[contains(text(),'Flight Booking')]")
	WebElement Flightbookinglink;

	@FindBy(xpath = "//a[contains(@class,'cart-icon')]")
	WebElement CartIcon;

	@FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
	WebElement AddtoCartButtons;

	@FindBy(xpath = "//a[contains(@class,'increment')]")
	WebElement incrementButtons;

	@FindBy(xpath = "//a[contains(@class,'decrement')]")
	WebElement DecrementButtons;

	@FindBy(xpath = "//input[contains(@class,'search-keyword')]")
	WebElement SerachTextFiled;

	public boolean logIsVisble() {
		return logoGreenKart.isDisplayed();
	}

	public boolean topDealsVisble() {
		return TopDealsLink.isDisplayed();
	}

	public boolean cartIconVisible() {
		return CartIcon.isDisplayed();
	}

	public boolean addToCartButtonvisble() {
		return AddtoCartButtons.isDisplayed();
	}

	public boolean incrementButtonIsVisible() {
		return incrementButtons.isDisplayed();
	}
	
	public boolean DecrementButtonIsVisible() {
		return DecrementButtons.isDisplayed();
	}
	
	public boolean SearchTextFiled()
	{
		return SerachTextFiled.isDisplayed();
	}
	
	
}
