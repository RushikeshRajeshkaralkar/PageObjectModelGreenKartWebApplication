package com.qa.greenkart.test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.greenkart.pages.HomePage;
import com.qa.greenkart.testbase.TestBase;
import com.qa.greenkart.util.TestUtil;

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

	@Test(priority = 9)
	public void loginbuttonvisiblity() {

		home = new HomePage();
		boolean loginbutton = home.logIsVisble();
		assertEquals(true, loginbutton);
	}

	@Test(priority = 8)
	public void topDealsLinkVisiblity() {

		home = new HomePage();
		boolean topDealsButton = home.topDealsVisble();
		assertEquals(true, topDealsButton);
	}

	@Test(priority = 7)
	public void addToCartButtonVisiblity() {

		home = new HomePage();
		boolean addToCartButton = home.topDealsVisble();
		assertEquals(true, addToCartButton);
	}

	@Test(priority = 5)
	public void CartIconVisiblity() {

		home = new HomePage();
		boolean CartIcon = home.cartIconVisible();
		assertEquals(true, CartIcon);
	}

	@Test(priority = 4)
	public void InCrementButtonVisiblity() {

		home = new HomePage();
		boolean InCrementButton = home.incrementButtonIsVisible();
		assertEquals(true, InCrementButton);
	}

	@Test(priority = 3)
	public void DeCrementButtonVisiblity() {

		home = new HomePage();
		boolean DeCrementButton = home.DecrementButtonIsVisible();
		assertEquals(true, DeCrementButton);
	}

	@Test(priority = 2)
	public void SearchTextFiledVisiblity() {

		home = new HomePage();
		boolean SearchTextFiled = home.SearchTextFiled();
		assertEquals(true, SearchTextFiled);
	}
	

	@Test(priority=1,dataProvider = "getData")
	public void listOfHomePageProduct(String names) {
		home = new HomePage();

		List<WebElement> listOfItems = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < listOfItems.size(); i++) {
			String[] name = listOfItems.get(i).getText().split("-");
			String UpdateFormateName = name[0].trim();

			int j = 0;
			if ((names).equalsIgnoreCase(UpdateFormateName)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				try {
					Thread.sleep(2000);
					break;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

	@DataProvider
	public Iterator<Object[]> getData() {
		ArrayList<Object[]> list = TestUtil.productNames();
		return list.iterator();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
