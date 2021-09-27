package com.basic.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Utility {

	 public static String fetchPropertyValue(String key) throws IOException
	 {
		 Properties property=new Properties();
		 FileInputStream fis=new FileInputStream("./config/config.properties");
		 property.load(fis);
		 return property.get(key).toString();
		 
	 }
	 public static String fetchLocatorValue(String key) throws IOException
	 {
		 Properties property=new Properties();
		 FileInputStream fis=new FileInputStream("./config/objrepo.properties");
		 property.load(fis);
		 return property.get(key).toString();
		 
	 }
	 
	 
	 public static void clickElement(WebDriver driver,String locator)
	 {
		 try
		 {
			 driver.findElement(By.xpath(locator)).click();
		 }
		 catch(Exception e)
		 {
			 e.getStackTrace();
			 System.out.println("not clicked the element: "+locator);
		 }
		 
		 
	 }
	 
	 public static void sendKeystoElement(WebDriver driver,String locator,String value)
	 {
		 try
		 {
			 driver.findElement(By.xpath(locator)).sendKeys(value);
		 }
		 catch(Exception e)
		 {
			 e.getStackTrace();
			 System.out.println("not able to enter in to the element");
		 }		 
	 }
	 
	 public static void movetoElement(WebDriver driver,String locator)
	 {
		 try {
			 Actions action=new Actions(driver);
			 action.moveToElement(driver.findElement(By.xpath(locator))).build().perform();
			 System.out.println("moved to the element "+locator);
		 }
		 catch(Exception e)
		 {
			 e.getStackTrace();
			 System.out.println("not moved to the element:"+locator);
		 }
	 }
	 public static void movetoElementClick(WebDriver driver,String locator)
	 {
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
	 
}
