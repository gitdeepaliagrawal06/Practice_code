//WAP to select all the option which is Starting from the letter 'A'?
package DropDownPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDownStartFromA {
public static void main(String[] args) 
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("file:///F:/Documents/MultipleDropDown.html");
	WebElement wb=driver.findElement(By.name("PLanguage"));
	Select s=new Select(wb);
	List<WebElement>lst=s.getOptions();
	for (int i = 0; i <lst.size(); i++) 
	{
//		String actVal=lst.get(i).getText();
//		if (actVal.contains("a"))
//		{
//			s.selectByVisibleText(actVal);
//		}
		
	}
	
	
	
}
}
