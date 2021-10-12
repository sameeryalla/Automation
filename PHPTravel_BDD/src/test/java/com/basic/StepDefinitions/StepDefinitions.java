package com.basic.StepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basic.Utilities.Utility;
import com.basic.pages.DashboardPage;
import com.basic.pages.HomePage;
import com.basic.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	WebDriver driver;
	
	HomePage objHomePage;
    LoginPage objLoginPage;
    DashboardPage objDBPage;
	
    
	
	@Before
	public WebDriver SetUp()
	{
		if(driver==null) 
		  {
			String path = System.getProperty("user.dir");   // return project folder path

			String driverpath = path + "\\driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",driverpath );
			driver=new ChromeDriver();
			   driver.manage().window().maximize();
		  }
		return driver;
	}
	
	@Given("User is on PHPTravel home page")
	public void user_is_on_php_travel_home_page() throws IOException {
	           
		driver.get(Utility.fetchPropertyValue("applicationURL"));
		objHomePage=new HomePage(driver);		
		objHomePage.Loginbuttonisclickable();
	}
	@And("Clicking login button to navigate Login page")
	public void clicking_login_button_to_navigate_login_page() throws IOException {
		objHomePage=new HomePage(driver);	
		objHomePage.clickonLoginButton();
	}
	
	
	@When("enter username as {string} and password as {string} in login screen")
	public void enter_username_password_in_login_screen(String username, String pwd) throws IOException, InterruptedException
	{ 
		objLoginPage=new LoginPage(driver);	
		Utility.WaitUntilElementClickable(driver, Utility.fetchLocatorValue("Loginpage_loginbutton"), 20);
		objLoginPage.enterUsernamePassword2(username, pwd);
	}
	
	@When("enter username and password in login screen")
	public void enter_username_password(DataTable dataTable) throws IOException
	{
		objLoginPage=new LoginPage(driver);	
	    objLoginPage.enterUsernamePassword(dataTable);	
		
	}
	
	@And("click on signin button")
	public void click_on_signin_button() throws IOException {
		objLoginPage=new LoginPage(driver);	
		Utility.clickElement(driver, Utility.fetchLocatorValue("Loginpage_loginbutton"));
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Then("check error message")
	public void check_error_message() throws IOException {
		objLoginPage=new LoginPage(driver);	
	    if(objLoginPage.errorMsgCheck())
	    {
	    	System.out.print("invalid login verified");
	    	Assert.assertTrue(true);
		}
		else
		{
			System.out.print("error message not found");
			Assert.assertFalse(true);
		}
		
	}
	

	
	@Then("I verify the {string} message in user homepage")
	public void i_verify_the_sucess_message_in_user_homepage(String success) throws IOException {
		
		objDBPage=new DashboardPage(driver);
		if(objDBPage.confirmDashboardPage())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(true);
		}
		System.out.print("Login success");
	 
	}
	
	

		
	
	
	@After
	public void TearDown()
	{
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
	}

	
}
