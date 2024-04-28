package openqa.org.selenium.Package;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifySearchElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.gmail.com");
	
	driver.findElement(By.id("identifierId")).sendKeys("agrawal.deepali10@gmail.com");
    //driver.findElement(By.xpath("//span[text()='Next']'")).click();
	driver.findElement(By.xpath("//span[@class='RveJvd snByac'")).click();
	Thread.sleep(2000);
    
	driver.findElement(By.name("password")).sendKeys("Deepali10@");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	//Step3: Enter "Deepali" in Search editBox and click Search button
     WebElement wb=driver.findElement(By.id("gbqfqwb"));
     wb.sendKeys("Deepali");
     
	//capture the existing value from search editBox
     String actVal=wb.getAttribute("Value");
     if(actVal.equals("Deepali"))
     {
    	 System.out.println("Pass");
     }
     else
     {
    	 System.out.println("Fail");
     }
     //Get the size of the SearchEditBox
     Dimension den=wb.getSize();
     System.out.println("Get the height of the element==> "+den.getHeight());
     System.out.println("Get the width of the element==> "+den.getWidth());
     
     //Get the Location of the SearchBox
     Point p=wb.getLocation();
     System.out.println("Get the X-Co-Ordinate==> "+p.getX());
     System.out.println("Get the Y-Co-Ordinate==> "+p.getY());
     
     //LogOut
     driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
     driver.findElement(By.id("//a[@id='gb_71']")).click();
		}
	}