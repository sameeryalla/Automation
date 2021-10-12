package com.basic.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.basic.Utilities.Utility;

public class HomePage{
 
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
              this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Loginbuttonisclickable() throws IOException
	{
		Utility.WaitUntilElementClickable(driver, Utility.fetchLocatorValue("Homepage_LoginButton"), 20);
		Utility.clickElement(driver, Utility.fetchLocatorValue("Homepage_cookies"));
	}
	
	public void clickonLoginButton() throws IOException
	{
		Utility.clickElement(driver, Utility.fetchLocatorValue("Homepage_LoginButton"));
	}
	
	
	
	
}
