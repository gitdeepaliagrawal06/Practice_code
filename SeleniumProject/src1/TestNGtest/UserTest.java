package TestNGtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class UserTest {
	WebDriver driver;
	@BeforeClass
	public void cofigbeforeClass() {
	System.out.println("Launch Browser");
	driver =new FirefoxDriver();
		 }
  @BeforeMethod
  public void setUpbeforeMethod() 
  {
	  System.out.println("Login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("http://127.0.0.1/login.do");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
  } 
  @Test(priority=1)
  public void createUserTest() 
  {
	  System.out.println("create User");
	  System.out.println("verify");
	  }
  @Test(priority=2)
  public void modifyUserTest()
  {
	  System.out.println("modify User");
	  System.out.println("verify");
}
  @Test(priority=3)
  public void deleteUserTest() 
  {
	  System.out.println("Delete User");
	  System.out.println("verify");
  } 
   @AfterMethod
  public void setUpafterMethod() 
   {
	   System.out.println("Logout");
	   driver.findElement(By.linkText("Logout")).click();
	   }
  @AfterClass
  public void configafterClass() 
  {
     System.out.println("close the Browser");
	 driver.quit();
  }
}
