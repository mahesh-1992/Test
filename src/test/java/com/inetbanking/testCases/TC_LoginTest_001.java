package com.inetbanking.testCases;


import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");   
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().dismiss();
		
		/*if(driver.getTitle().equals("Facebook"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}*/
		
		lp.accountDrop();
		
		
		lp.clickLogout();
		logger.info("logout pass");
		
	}
}
