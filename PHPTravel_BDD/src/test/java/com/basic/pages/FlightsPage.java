package com.basic.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.basic.Utilities.Utility;

public class FlightsPage {

	WebDriver driver;
	public FlightsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean searchresult()
	{
		return true;
	}
	
	
	public void searchFlights(String from,String to) throws IOException
	{
		Utility.sendKeystoElement(driver, Utility.fetchLocatorValue("FlightPage_from"), from);
		//Utility.clickElement(driver, Utility.fetchLocatorValue("FlightPage_selectfrom"));
		Utility.sendKeystoElement(driver, Utility.fetchLocatorValue("FlightPage_to"), to);
		//Utility.clickElement(driver, Utility.fetchLocatorValue("FlightPage_selectto"));
		Utility.clickElement(driver, Utility.fetchLocatorValue("FlightPage_serach"));
	}
	
	
	
}
