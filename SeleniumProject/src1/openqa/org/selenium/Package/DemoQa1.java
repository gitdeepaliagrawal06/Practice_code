package openqa.org.selenium.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoQa1 
{
	public static void main(String[] args) 
	{
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Open ToolsQA web site
		String appUrl = "http://www.DemoQA.com";
		driver.get(appUrl);
 
		// Click on Registration link
		driver.findElement(By.xpath("//a[text()='Registration']")).click();
 
		// Go back to Home Page
		driver.navigate().back();
 
		// Go forward to Registration page
		driver.navigate().forward();
 
		// Go back to Home page
		driver.navigate().to(appUrl);
 
		// Refresh browser
		driver.navigate().refresh();
 
		// Close browser
		driver.close();
	}

}
