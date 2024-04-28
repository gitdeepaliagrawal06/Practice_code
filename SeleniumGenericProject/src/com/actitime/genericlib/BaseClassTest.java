package com.actitime.genericlib;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DropDownPackage.ChromeDriver;
import objectRepository.Login;
import objectRepository.Logout;
public  class BaseClassTest {

	public  static WebDriver driver;
//	@BeforeSuite
//	public void confiBeforeSuite()
//	{
//		System.out.println("Connect to DB");
//	}
	@BeforeClass
	@Parameters("browser")
	public void configBeforeClass(String bName) throws Throwable
	{
		 FileUtiles2 fis =new FileUtiles2();
		 Properties pobj=fis.getProterties();
		 String url=pobj.getProperty("URL");
		 System.out.println("Launch Browser");
		 if(bName.equals("firefox"))
		 {
			 driver=new FirefoxDriver();
		 }
		  if else(bName.equals("Chrome"))
		 {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
			   driver=new WebDriver();
				
		 }
		 
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get(url);
	}	
	@BeforeMethod
	public void ConfigBeforeMethod() throws Throwable 
	{
	     FileUtiles2 fis =new FileUtiles2();
		 Properties pobj=fis.getProterties();
		 String user=pobj.getProperty("username");
          String pws=pobj.getProperty("password");
		  System.out.println("Login");
		  driver.findElement(By.name("username")).sendKeys(user);
		  driver.findElement(By.name("pwd")).sendKeys(pws);
           driver.findElement(By.id("loginButton")).click();		   
           System.out.println("Login");
		   //Login lg=PageFactory.initElements(driver,Login.class);
		   //lg.loginToActitime();
		 }
	 
	  @AfterMethod
	  public void CofigAfterMethod() 
	  {
		  System.out.println("Logout");
//		  driver.findElement(By.linkText("Logout")).click();
		  Logout lo=PageFactory.initElements(driver, Logout.class);
		  lo.logoutActitime();
	  }
	 @AfterClass
	 public void confiAfterClass()
	 {
		 System.out.println("close the Browser");
		 driver.quit();
	 }
//	 @AfterSuite
//	 public void configAfterSuite()
//	 {
//		 System.out.println("dis-connect to DB");
//	 

}
