package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testbase.TestBase;
import com.flipkart.utils.TestUtils;

public class IndexLogin extends TestBase {

	@FindBy(xpath = "//input[@class=\"_2zrpKA _1dBPDZ\"]")
	WebElement usernameTxt;

	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement passwordTxt;

	@FindBy(xpath = "//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")
	WebElement loginBtn;

	@FindBy(xpath = "//span[text()=\"Forgot?\"]")
	WebElement forgotLink;

	@FindBy(xpath = "//button[@class=\"_2AkmmA _1LctnI jUwFiZ\"]")
	WebElement requestOTPLink;

	@FindBy(xpath = "//a[@class=\"oZoRPi\"]")
	WebElement signUpLink;

	public IndexLogin() {
		PageFactory.initElements(driver, this);
	}

	public void login(String user, String pass) {
		// logger.info("Entering username");
		TestUtils.sendKeysClear(usernameTxt, user);
		// logger.info("Entering password");
		TestUtils.sendKeysClear(passwordTxt, pass);
		// logger.info("Click on Login button");
		TestUtils.clickHighlight(loginBtn);
	}

	public void gotoFogotLink() {
		TestUtils.clickHighlight(forgotLink);
	}

	public void gotoSignUpLink() {
		TestUtils.clickHighlight(signUpLink);
	}

}
