package com.flipkart.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.pages.IndexLogin;
import com.flipkart.testbase.TestBase;

public class IndexLoginTest extends TestBase {

	public IndexLoginTest() {
		super();
	}

	IndexLogin indexLogin;

	@BeforeMethod
	public void setUp() {
		initialization();
		indexLogin = new IndexLogin();
	}

	@Test
	public void verifyLogin() {
		indexLogin.login(username, password);
		ngWebDriver.waitForAngularRequestsToFinish();
		if (driver.getPageSource().contains("More")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
