package openqa.org.selenium.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementIdentifyControl 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
	
		//Step1:Login the G-mail Application
		
		//Identify the email editbox in GUI
        WebElement wb=driver.findElement(By.id("identifierId"));
        wb.sendKeys("agrawal.deepali10@gmail.com");
        
        //Identify the Next Button In GUI
        WebElement wb1=driver.findElement(By.xpath("//span[text()='Next']"));
        wb1.click();
        
        //Identify the Password EditBox in GUI
        WebElement wb2=driver.findElement(By.name("password"));
        wb2.sendKeys("Deepali10@");
        
        //Identify the Next Button In GUI
        WebElement wb3=driver.findElement(By.xpath("//span[text()='Next']"));
        wb3.click();
        }

}
