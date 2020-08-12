package com.LearnFrameWork.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "12txtUsername")
	WebElement Username;

	@FindBy(how = How.NAME, using = "txtPassword")
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//input[contains(@id,'btnLogin')]")
	WebElement BtnLogin;

	public void LoginHRM(String Uname, String Psd) {
		Username.sendKeys(Uname);
		Password.sendKeys(Psd);
		BtnLogin.click();
	}
}
