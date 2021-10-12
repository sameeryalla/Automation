package com.basic.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.basic.Utilities.Utility;

public class DashboardPage {

	WebDriver driver;
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean confirmDashboardPage() throws IOException
	{
		return Utility.WaitUntilElementAppears(driver, Utility.fetchLocatorValue("DashboardPage_note"), 20);
	}
	
}
