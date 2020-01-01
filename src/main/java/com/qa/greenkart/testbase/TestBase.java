package com.qa.greenkart.testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.greenkart.util.TestUtil;

public class TestBase {

	public static Properties pro;
	public static WebDriver driver;

	public TestBase() {
		// TODO Auto-generated constructor stub
		try {

			pro = new Properties();
			FileInputStream fis = new FileInputStream(
					"A:\\JavaPrograms\\GREENKART.COM\\src\\main\\java\\com\\qa\\greenkart\\config\\config.properties");
			pro.load(fis);
		} catch (Exception e) {

		}

	}

	public void intiliazation() {
		String browser = pro.getProperty("browser");
		if (("chrome").equalsIgnoreCase(browser)) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Rushikesh\\Desktop\\ChromeDriver79\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(pro.getProperty("url"));
		} else if (("firefox").equalsIgnoreCase(browser)) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Rushikesh\\Desktop\\ChromeDriver79\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(pro.getProperty("url"));
		} else if (("Windowsedge").equalsIgnoreCase(browser)) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Rushikesh\\Desktop\\ChromeDriver79\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(pro.getProperty("url"));
		}

	}

}
