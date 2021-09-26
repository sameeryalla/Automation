package com.basic.StepDefinitions;

import java.util.Iterator; 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class NaukriOperations {

	WebDriver driver;
	 

	@Given("user need to be navigate to naukri login page")
	public void OpenFBLoginPage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMEER YALLA\\Documents\\Automation\\demo\\Automation\\CucumberSetup\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		// It will return the parent window name as a String
				String parent=driver.getWindowHandle();

				Set<String>s=driver.getWindowHandles();

				// Now iterate using Iterator
				Iterator<String> I1= s.iterator();
				while(I1.hasNext())
				{

				String child_window=I1.next();
				if(!parent.equals(child_window))
				{
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
				}

				}
				//switch to the parent window
				driver.switchTo().window(parent);
		System.out.println("Naukri login page openned");
	}
	
	@When("click on Naukri login button")
	public void click_on_naukri_login_button() {
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		System.out.println("cliked naukri login button");
	   
	}
	
	@And("click on location notification")
	public void clickon_location_notification()
	{
		driver.findElement(By.xpath("//div[@id='geoLocPopUp']/span[@id='allow']")).click();
		System.out.println("cliked location notification button");
	}
	
	
	@And("user enters naukri username as {string} and password as {string}")
	public void user_enters_naukri_username_password(String username,String password) {
		
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='usernameField']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@id='passwordField']"));
		
		
		userName.sendKeys(username);
	    System.out.println("Username entered "+username);
	    pwd.sendKeys(password);
	    System.out.println("password entered"+password);
	}

	@SuppressWarnings("deprecation")
	@Then("Naukri Signin button should be clickable")
	public void naukri_signin_button_should_be_clickable() {
		if(driver.findElement(By.xpath("//button[text()='Login']")).isEnabled())
		{System.out.println("Naukri Sign in button clickable");
		Assert.assertEquals(true, true);
		}
		
	   
	}

	
	@And("click on Naukri 2nd login button")
	public void click_on_Nlogin_button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		System.out.println("cliked login button");
	   
	}

	@Then("check the {string} on home page")
	public void user_need_to_check_username_in_homepage(String homepageusername) throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement Homepageusername=driver.findElement(By.xpath("//*[contains(@class,'user-name')]"));
		
		if(Homepageusername.getText()==homepageusername)
		{System.out.println("Valid user logged in");}
		else
		{System.out.println("Invalid user logged in");}
		
	   
	}
	

	@Then("close the Nbrowser")
	public void close_the_Nbrowser() {
		
		if(driver!=null)
		{
			driver.close();
			driver.quit();
			driver=null;
		}
	   
	}


	
	
}
