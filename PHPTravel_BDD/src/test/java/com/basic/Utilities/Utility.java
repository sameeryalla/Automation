package com.basic.Utilities;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utility {


	
	 public static String fetchPropertyValue(String key) throws IOException
	 {
		 try { Properties property=new Properties();
		 FileInputStream fis=new FileInputStream("./config/config.properties");
		 property.load(fis);
		 return property.get(key).toString();}
		catch(Exception e)
		{
			e.printStackTrace();
			return  null;
		}
		 
	 }
	 public static String fetchLocatorValue(String key) throws IOException
	 {
		
		 try{Properties property=new Properties();
		 FileInputStream fis=new FileInputStream("./config/objrepo.properties");
		 property.load(fis);
		 return property.get(key).toString();}
		 
		 catch(Exception e)
			{
				e.printStackTrace();
				return  null;
			}
	 }
	 
	 
	 public static String getText(WebDriver driver,String key)
	 {
		 String locator=key.split("~")[0];
		 try
		 {
			 String value=driver.findElement(By.xpath(locator)).getText();
			 System.out.println("given element: "+locator+" picked value:"+value);
			 return value;
		 }
		 catch(Exception e)
		 {
			 e.getStackTrace();
			 System.out.println("not clicked the element: "+locator);
			 return null;
		 }
		 
		 
	 }
	 
	 public static boolean clickElement(WebDriver driver,String key)
	 {
		 String locator=key.split("~")[0];
		 try
		 {
			 driver.findElement(By.xpath(locator)).click();
			 System.out.println("clicked the element: "+locator);
			 return true;
		 }
		 catch(Exception e)
		 {
			 e.getStackTrace();
			 System.out.println("not clicked the element: "+locator);
			 return false;
		 }
		 
		 
	 }
	 
	 public static boolean sendKeystoElement(WebDriver driver,String key,String value)
	 {
		 String locator=key.split("~")[0];
		 try
		 {
			 driver.findElement(By.xpath(locator)).sendKeys(value);
			 System.out.println("Value entered in "+locator+" is : "+value);
			 return true;
		 }
		 catch(Exception e)
		 {
			 e.getStackTrace();
			 System.out.println("not able to enter in to the element");
			 return false;
		 }		 
	 }
	 
	 public static boolean movetoElement(WebDriver driver,String key)
	 {
		 String locator=key.split("~")[0];
		 try {
			 Actions action=new Actions(driver);
			 action.moveToElement(driver.findElement(By.xpath(locator))).build().perform();
			 System.out.println("moved to the element "+locator);
			 return true;
		 }
		 catch(Exception e)
		 {
			 e.getStackTrace();
			 System.out.println("not moved to the element:"+locator);
			 return false;
		 }
	 }
	 public static void movetoElementClick(WebDriver driver,String key)
	 {
		 String locator=key.split("~")[0];
		 try {
			 Actions action=new Actions(driver);
			 action.click(driver.findElement(By.xpath(locator))).build().perform();
			 System.out.println("clicked the element "+locator);
		 }
		 catch(Exception e)
		 {
			 e.getStackTrace();
			 System.out.println("not moved to the element:"+locator);
		 }
	 }
	 
	 public static boolean WaitUntilElementAppears(WebDriver driver,String key,int waittime)
	 {
		 String locator=key.split("~")[0];
		 System.out.println("Entered in to wait method to check element "+locator+" appeared or not");
		 try {
			 WebDriverWait wait=new WebDriverWait(driver,waittime);
			 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))));
			 return true;
		 }
		 catch(Exception e){

			 e.getStackTrace();
			 System.out.println("Element not loaded :"+locator); 
			 return false;
		 }
	 }
	 public static boolean WaitUntilElementClickable(WebDriver driver,String key,int waittime)
	 {
		 String locator=key.split("~")[0];
		 
		 System.out.println("Entered in to wait method to check element "+locator+" appeared or not");
		 try {
			 WebDriverWait wait=new WebDriverWait(driver,waittime);
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locator))));
			 Thread.sleep(1000);
			 return true;
		 }
		 catch(Exception e){

			 e.getStackTrace();
			 System.out.println("Element not loaded :"+locator); 
			 return false;
		 }
	 }
	 
}
