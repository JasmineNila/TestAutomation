package com.app.pages;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.FindBys;
	import org.openqa.selenium.support.PageFactory;

	@SuppressWarnings("deprecation")
	public class DressessPageObject extends BasePage {
		@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
		private WebElement txtDresses;
		
		@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[1]/label/a")
		private WebElement checkBoxSizeSmall;
		
		@FindBy(xpath = "//*[@id='center_column']/h1/span[2]")
		private WebElement txtProductCountHeading;
		
		@FindBys(XPath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
		private List<WebElement> listProducts;
		
	public DressessPageObject() {
		PageFactory.initElements(driver, this);
}

public void clickdressess()
{
	txtDresses.click();
}

public void clickSizeOptionCheckbox()
{
	checkBoxSizeSmall.click();
}

public boolean verifySizeOption()
{
	return checkBoxSizeSmall.isSelected();
	}
public int getProductCountFromHeader() {
	return Integer.parseInt(txtProductCountHeading.getText());
}

public int getProductsCount() {
	return listProducts.size();
}
	}
	

