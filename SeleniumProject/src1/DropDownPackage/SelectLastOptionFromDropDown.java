package DropDownPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLastOptionFromDropDown 
{
	public static void main(String[] args) 
	{

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Agrawal/Desktop/MultiSelect.html");
		WebElement wb=driver.findElement(By.name("PLanguage"));
		Select s=new Select(wb);
		List<WebElement>lst=s.getOptions();
		s.selectByIndex(lst.size()-1);	
		
	}

}
