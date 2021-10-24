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
	
	public boolean clickonDashboardtab(String tabName) throws IOException
	{
		String flightTab=Utility.fetchLocatorValue("DashboardPage_tabs").replace("dummy",tabName);
		return Utility.clickElement(driver, flightTab);
	}
	
}
