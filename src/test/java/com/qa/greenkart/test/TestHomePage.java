package com.qa.greenkart.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.greenkart.pages.HomePage;
import com.qa.greenkart.testbase.TestBase;

public class TestHomePage extends TestBase {

	public TestHomePage() {
		// TODO Auto-generated constructor stub
		super();
	}

	HomePage home;

	@BeforeMethod
	public void setUp() {
		intiliazation();
	}

	@Test()
	public void loginbuttonvisiblity() {

		home = new HomePage();
		boolean loginbutton = home.logIsVisble();
		assertEquals(true, loginbutton);
	}

	@Test()
	public void topDealsLinkVisiblity() {

		home = new HomePage();
		boolean topDealsButton = home.topDealsVisble();
		assertEquals(true, topDealsButton);
	}

	@Test()
	public void addToCartButtonVisiblity() {

		home = new HomePage();
		boolean addToCartButton = home.topDealsVisble();
		assertEquals(true, addToCartButton);
	}

	@Test()
	public void CartIconVisiblity() {

		home = new HomePage();
		boolean CartIcon = home.cartIconVisible();
		assertEquals(true, CartIcon);
	}

	@Test()
	public void InCrementButtonVisiblity() {

		home = new HomePage();
		boolean InCrementButton = home.incrementButtonIsVisible();
		assertEquals(true, InCrementButton);
	}

	@Test()
	public void DeCrementButtonVisiblity() {

		home = new HomePage();
		boolean DeCrementButton = home.DecrementButtonIsVisible();
		assertEquals(true, DeCrementButton);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
