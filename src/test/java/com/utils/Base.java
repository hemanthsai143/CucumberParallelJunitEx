package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;


public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public static WebDriver initlializeDriver() throws IOException
	{

		prop=loadProperties();
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromedriverPath"));
		driver=new ChromeDriver();
		return driver;
		
	}
	

	
	
	public static Properties loadProperties() throws IOException
	{
	prop=new Properties();
    String path=System.getProperty("user.dir");
	FileInputStream fis=new FileInputStream(path+"\\data.properties");
	prop.load(fis);
    return prop;
	}
	
	

	
	

	
}
