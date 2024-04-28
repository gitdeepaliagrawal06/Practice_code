//WAP to select all the option which is related to "Testing" from the dynamic select DropDown
 package DropDownPackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicSelect1
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Agrawal/Desktop/MultiSelect.html");
		
		//identify the element
		WebElement wb=driver.findElement(By.name("PLanguage"));
		
		//create select class object
		Select s=new Select(wb);
		
		//Capture all option from Dynamic DropDown
		List<WebElement> lst=s.getOptions();
		
		//Select Element which Contain "Testing" string in dynamic select
		for (int i =0; i<lst.size(); i++)
		{
			String actVal=lst.get(i).getText();
			if (actVal.contains("Testing")) 
			{
			s.selectByVisibleText(actVal);	
			s.selectByIndex(i);
			}
			
			
			
		} 
	}
}
