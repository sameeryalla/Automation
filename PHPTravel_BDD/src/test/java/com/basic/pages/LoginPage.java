package com.basic.pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.basic.Utilities.Utility;

import io.cucumber.datatable.DataTable;

public class LoginPage {

    WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
              this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsernamePassword(DataTable datatable) throws IOException
	{
		Utility.WaitUntilElementAppears(driver,Utility.fetchLocatorValue("Loginpage_userName"), 10);
		List<Map<String,String>> data=datatable.asMaps(String.class, String.class);
		String username=data.get(0).get("username");
		String password=data.get(0).get("password");
		Utility.sendKeystoElement(driver, Utility.fetchLocatorValue("Loginpage_userName"), username);
	    System.out.println("Username entered "+username);
	    Utility.sendKeystoElement(driver,Utility.fetchLocatorValue("Loginpage_password"), password);
	    System.out.println("password entered"+password);
	}
	
	public void enterUsernamePassword2(String uName, String pwd) throws IOException, InterruptedException
	{
		Utility.WaitUntilElementAppears(driver,Utility.fetchLocatorValue("Loginpage_userName"), 10);
		
		Utility.sendKeystoElement(driver, Utility.fetchLocatorValue("Loginpage_userName"), uName);
	    System.out.println("Username entered "+uName);
	    Utility.sendKeystoElement(driver,Utility.fetchLocatorValue("Loginpage_password"), pwd);
	    System.out.println("password entered"+pwd);
	    Thread.sleep(1000);
	}
	
	public void clickonSignbutton() throws IOException
	{
		//Utility.movetoElement(driver, Utility.fetchLocatorValue("Loginpage_signUp"));
		String key=Utility.fetchLocatorValue("Loginpage_loginbutton");
		Utility.WaitUntilElementClickable(driver,key,20);
		Utility.clickElement(driver, key);
	}
	public boolean errorMsgCheck() throws IOException
	{
		if(Utility.WaitUntilElementAppears(driver, Utility.fetchLocatorValue("Loginpage_errormsg"), 20))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
