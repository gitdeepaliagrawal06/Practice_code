package DropDownPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicSelect {
public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	//Identify the WebElement
	WebElement wb=driver.findElement(By.id("year"));
	//Expected Value
		String expOption ="1946";
		
	//Create Select Class Object
	Select sel=new Select(wb);
	
//	//Expected Value
//	String expOption ="1946";
//	
	//Capture all the values from the DropDown
	List<WebElement> lst=sel.getOptions();
	
	//Using Loop  and check for the expected option
	      for(int i=0; i<=lst.size()-1; i++)
	      {    	  
	    	String actOption=lst.get(i).getText();
	    	
	  //Verify expOption is available or not  	  
	    	if(actOption.equals(expOption))
	    	  {
	             //Select the value
	    		 sel.selectByIndex(i);
	    		 System.out.println("option is avialble");
	    	  }
	       else {
  		         System.out.println("not avialble");
  	}
	             }
	             }

}
