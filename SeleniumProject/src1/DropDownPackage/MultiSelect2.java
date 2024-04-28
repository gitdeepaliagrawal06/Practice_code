//WAP for MultiSelect DropDown?
package DropDownPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect2 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/Agrawal/Desktop/MultiSelect.html");
	//identify the drop down
	WebElement wb=driver.findElement(By.name("PLanguage"));
	//Create Select class object
	Select s=new Select(wb);
	//Check Weather DropDown is MultiSelect Or SingleSelect
	boolean Status =s.isMultiple();
	if (Status) 
	{
		s.selectByVisibleText("C++");
		s.selectByIndex(0);
		s.selectByIndex(3);
		s.selectByValue("Java");//---------Doubt
	}
	else
	{
		System.out.println("It is not a multiselect");
	}}
}
