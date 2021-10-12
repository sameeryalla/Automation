package com.basic.Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class hooks {
	
	WebDriver driver;
	
	@Before
	public WebDriver SetUp()
	{
		if(driver==null) 
		  {
			System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");
			driver=new ChromeDriver();
			   driver.manage().window().maximize();
		  }
		return driver;
		
	}
	
	@After
	public void TearDown()
	{
		while(driver!=null)
		{
			driver.close();
			driver.quit();
		}
	}

}
