package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.loginPageObject;
import com.app.pages.searchPageObject;

public class loginTestPage {

	loginPageObject lp;
	searchPageObject sp;
	
 public loginTestPage() {
	lp=new loginPageObject();
	sp=new searchPageObject();
 }
 
 @Test
 
 public void verifyloginCredentials() {
	lp.login("jasmine15","Nila@1003");
	String welcometxt=sp.getWelcomePage();
	Assert.assertTrue(welcometxt.contains("jasmine15"),"failed");
 }
	
}

