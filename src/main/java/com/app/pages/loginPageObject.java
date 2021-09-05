package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageObject extends BasePage {
	@FindBy(id = "username")
	private WebElement txtboxUserName;
	
	@FindBy(id = "password")
	private WebElement txtboxUserPassword;
	
	@FindBy(id ="login")
	private WebElement btnClickLogin;
	
	public loginPageObject() {
		PageFactory.initElements(driver, this);

	}
	
	public void login(String username, String password) {
	setText(txtboxUserName, username);
	setText(txtboxUserPassword, password);
	btnClickLogin.click();
	}
	public void setUserName(String username) {
		setText(txtboxUserName, username);
	}
	public String getUserName(String username) {
		String value=getTxtAttribute(txtboxUserName);
		return value;
	}
}
