package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class purchasesiteObject extends BasePage {
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement txtWomen;
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement txtDresses;
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement txtTshirts;
	public purchasesiteObject() {
		PageFactory.initElements(driver, this);

}

public void clickWomen() {
	txtWomen.click();
	}

public void clickDresses()
{
	txtDresses.click();
}

public void clickTshirt() {
	txtTshirts.click();
}
}
