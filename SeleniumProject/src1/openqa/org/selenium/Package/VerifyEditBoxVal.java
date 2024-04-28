package openqa.org.selenium.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyEditBoxVal {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
		String expVal="Email or phone";
		String actVal=driver.findElement(By.id("identifierId")).getAttribute("aria-label");
		System.out.println(actVal);
		if(expVal.equals(actVal))
		{
			System.out.println("Edit box value is varified==Pass");
		}
		else {
			System.out.println("Edit box value is not varified= fail");
		}
		
		
		

	}

}
