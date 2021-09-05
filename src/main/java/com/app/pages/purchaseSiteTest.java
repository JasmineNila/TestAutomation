package com.app.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class purchaseSiteTest {
	BasePage bp;
	DressessPageObject dp;

	public purchaseSiteTest() {
		bp = new BasePage();
		dp = new DressessPageObject();

	}

	@Test
	public void verifyShortCheckBox() {
		dp.clickdressess();
		dp.clickSizeOptionCheckbox();
		boolean value=dp.verifySizeOption();
		Assert.assertTrue(value==true);		
	}
	@Test
public void verifyProductCount() {
	dp.clickdressess();
	int actual=dp.getProductCountFromHeader();
	int expected=dp.getProductsCount();
	Assert.assertTrue(actual==expected);
}
}
