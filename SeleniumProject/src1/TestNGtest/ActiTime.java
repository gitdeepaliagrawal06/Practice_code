package TestNGtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class ActiTime 
{
	WebDriver driver;
@BeforeClass
public void configBeforeClass()
{
	System.out.println("Launch Browser");
	WebDriver driver=new FirefoxDriver();
}	
@BeforeMethod
public void SetupBeforeMethod() 
{
	 System.out.println("Login");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("http://127.0.0.1/login.do");
}
  @Test
  public void LoginApp() 
  {
	  System.out.println("Login the Application");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	 }
 
  @AfterMethod
  public void SetupAfterMethod() 
  {
	  System.out.println("Logout");
	  driver.findElement(By.linkText("Logout")).click();
  }
 @AfterClass
 public void confiAfterClass()
 {
	 System.out.println("close the Browser");
	 driver.quit();
 }

}
