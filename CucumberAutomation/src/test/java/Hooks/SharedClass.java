package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SharedClass {

	WebDriver driver;
	
	@Before
	public WebDriver SetUp()
	{
	  if(driver==null) 
	  {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMEER YALLA\\Documents\\Automation\\demo\\Automation\\CucumberSetup\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
	  }
	  return driver;
	}
	
	@After
	public void tearDown() {
		
		if(driver!=null)
		{
			driver.close();
			driver.quit();
			driver=null;
		}
	   
	}
}
