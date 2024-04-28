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

public class GoogleTest {
  WebDriver driver;

   @BeforeMethod
  public void setUpbeforeMethod() 
   {
	   WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		}
  @Test
  public void googleTitleTest() {
	  String title=driver.getTitle();
	  System.out.println(title);
  }
  @Test
  public void googleLogoTest() 
  {
	  boolean b =driver.findElement(By.id("plogo")).isDisplayed();
  }
  @Test
  public void mailLinkTest() 
  {
	boolean b=driver.findElement(By.linkText("Mail")).isDisplayed();  
  }
  @AfterMethod
  public void setUpafterMethod() 
  {
	  driver.quit();
  }

}
