package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(id="nav-link-accountList") WebElement navSignIn;
	@FindBy(name="email") WebElement uname;
	@FindBy(id="continue")WebElement btnContinue;
	@FindBy(name="password") WebElement password;
	@FindBy(id="signInSubmit") WebElement btnSignIn;

	public void loginToAmazon(String username, String pass) {
		navSignIn.click();
		uname.sendKeys(username);
	    btnContinue.click();
	    password.sendKeys(pass);
	    btnSignIn.click();
	}
}
