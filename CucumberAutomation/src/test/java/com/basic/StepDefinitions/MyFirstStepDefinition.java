package com.basic.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class MyFirstStepDefinition {
	 WebDriver driver;
	 

	@Given("user need to be navigate to FB login page")
	public void OpenFBLoginPage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMEER YALLA\\Documents\\Automation\\demo\\Automation\\CucumberSetup\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com/#");
		driver.manage().window().maximize();
		System.out.println("Login page openned");
	}
	
	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	    System.out.println("Username entered "+username);
	    
	}
	
	@And("user enters password as {string}")
	public void user_enters_password_as(String password) {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		System.out.println("password entered"+password);
	    
	}

	@Then("Signin button should be clickable")
	public void signin_button_should_be_clickable() {
		if(driver.findElement(By.xpath("//button[@name='login']")).isEnabled())
		{System.out.println("Sign in button clickable");
		//Assert.pass();
		}
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
	   
	}

	@And("click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("cliked login button");
	   
	}

	@Then("invalid username and password error message check")
	public void user_need_to_check_username_in_homepage() {
		if(driver.findElement(By.xpath("//*[@id='loginform']/div[2]/div[2]/a")).isDisplayed())
		{System.out.println("invalid login error message came");}
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
	   
	}

	
	
}
