package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPageObject extends BasePage {
	@FindBy(id = "username_show")
	private WebElement welcometxt;

	public searchPageObject() {
		PageFactory.initElements(driver, this);

	}

	public String getWelcomePage() {
		String msg = getTxtAttribute(welcometxt);
		return msg;
	}
}
