package Hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import Testbase.testbase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hookssteps extends testbase{

	@Before
	public void driverInitialize()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMEER YALLA\\Documents\\Automation\\demo\\Automation\\CucumberSetup\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
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
}
