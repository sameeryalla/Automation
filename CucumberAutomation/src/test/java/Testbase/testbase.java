package Testbase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basic.Utilities.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class testbase {
	
	protected static WebDriver driver;
	
	
	@Before
	public void driverInitialize() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMEER YALLA\\Documents\\Automation\\demo\\Automation\\CucumberSetup\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get(Utility.fetchPropertyValue("applicationURL"));
	}
	
	@After
	public void close_the_browser() {
		
		if(driver!=null)
		{
			driver.close();
			driver.quit();
			driver=null;
		}
	   
	}
	public WebDriver getDriver()
	{
		return driver;
	}

}
