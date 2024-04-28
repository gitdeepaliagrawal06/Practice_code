//WAP for multiSelect DropDown and check weather element is multiselect or not?
package DropDownPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Agrawal/Desktop/MultiSelect.html");
		
		//Step:1 Identify Multi-Select DropDown
		WebElement wb=driver.findElement(By.name("PLangusge"));
		
		//Step:2 create a object of select class
		Select sel=new Select(wb);
		
		//Step:3 check weather DropDown is Single Select or MultiSelect DropDown
		boolean status =sel.isMultiple();
		if(status)
		{
			//Select all value using index if it is multiSelect
			for (int i =0; i <4; i++) 
			{
				sel.selectByIndex(i);
			}
		}
			else
			{
				System.out.println("It is not MultiSelect DropDown");
			}
		}
	}



