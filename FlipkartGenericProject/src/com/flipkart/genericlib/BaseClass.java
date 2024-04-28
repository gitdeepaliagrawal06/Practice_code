package com.flipkart.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass 
{
public static WebDriver driver;	
@Parameters("browser")
@BeforeClass
public void configBC(String bName)
{
	if(bName.equals("Firefox"))
	{
		driver=new  FirefoxDriver();
	}
	else if(bName.equals("Chrome"))
	{
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\Agrawal\\eclipse-workspace\\FlipkartGenericProject\\Resource\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	else if(bName.equals("IE"))
	{
	System.setProperty("WebDriver.ie.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\FlipkartGenericProject\\Resource\\IEDriverServer.exe");
      driver =new InternetExplorerDriver();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
