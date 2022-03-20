package com.testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.utilities.BaseClass;
import com.utilities.Helper;

public class Login  extends BaseClass {
	
	
	@Test(priority = 1)
	public  void LoginPage() throws InterruptedException {
	 logger = report.createTest("Login to Amazon");
	 logger.info("Starting Application");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAmazon(ds.getUsername(),ds.getPassword());	
		System.out.println("Title is: "+ driver.getTitle());
		logger.pass("User able to login");
	Helper.captureScreenshot(driver);
	}
	
	@Test(priority = 2)
	public  void LoginOut() throws InterruptedException {
	 logger = report.createTest("Login Out");
	 logger.info("Logging Out");
	logger.fail("Unable to logout");
	Helper.captureScreenshot(driver);
	}
	
	
}
