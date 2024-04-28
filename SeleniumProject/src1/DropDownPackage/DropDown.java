//WAP for DropDown Operation
package DropDownPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	
   //Step1:Identify month DropDown
	WebElement wb=driver.findElement(By.id("month"));
   //Step2:Create a object "SELECT" class&Pass DropDown element	
   Select sel=new Select(wb);
   //Step3: Select the Option
   sel.selectByVisibleText("Aug");
   
   //Step4:Identify year DropDown 
   WebElement wb1=driver.findElement(By.id("year")); 
   Select sel1=new Select(wb1);
    sel1.selectByVisibleText("1947");
   }


}
