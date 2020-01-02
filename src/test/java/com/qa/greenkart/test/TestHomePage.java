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

	@Test(priority=9)
	public void loginbuttonvisiblity() {

		home = new HomePage();
		boolean loginbutton = home.logIsVisble();
		assertEquals(true, loginbutton);
	}

	@Test(priority=8)
	public void topDealsLinkVisiblity() {

		home = new HomePage();
		boolean topDealsButton = home.topDealsVisble();
		assertEquals(true, topDealsButton);
	}

	@Test(priority=7)
	public void addToCartButtonVisiblity() {

		home = new HomePage();
		boolean addToCartButton = home.topDealsVisble();
		assertEquals(true, addToCartButton);
	}

	@Test(priority=5)
	public void CartIconVisiblity() {

		home = new HomePage();
		boolean CartIcon = home.cartIconVisible();
		assertEquals(true, CartIcon);
	}

	@Test(priority=4)
	public void InCrementButtonVisiblity() {

		home = new HomePage();
		boolean InCrementButton = home.incrementButtonIsVisible();
		assertEquals(true, InCrementButton);
	}

	@Test(priority=3)
	public void DeCrementButtonVisiblity() {

		home = new HomePage();
		boolean DeCrementButton = home.DecrementButtonIsVisible();
		assertEquals(true, DeCrementButton);
	}

	@Test(priority=2)
	public void SearchTextFiledVisiblity() {

		home = new HomePage();
		boolean SearchTextFiled = home.SearchTextFiled();
		assertEquals(true, SearchTextFiled);
	}

	@Test(priority=1)
	public void listOfHomePageProduct() {
		home = new HomePage();

		
		home.productNames("Cucumber","Beetroot","Tomato");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
