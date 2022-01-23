package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(id="email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="pass")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="login")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="(//*[local-name()='svg'])[10]")
	@CacheLookup
	WebElement logoutDrop;
	
	
	@FindBy(xpath="//span[text()='Log Out']")
	@CacheLookup
	WebElement lnkLogout;
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void accountDrop() 
	{
		logoutDrop.click();	
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
	
}









