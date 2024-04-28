package practicePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementIdentifyControl 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	
    //identify the email edit box in GUI
    WebElement wb=driver.findElement(By.id("identifierId"));
	wb.sendKeys("agrawal.deepali10@gmail.com");
	//Thread.sleep(2000);
	//Identify the "Next" button in GUI
	WebElement wb1=driver.findElement(By.xpath("//span[text()='Next']"));
	
	//Idntify the password edit box in GUI
	WebElement wb2=driver.findElement(By.xpath("//input[@type='password']"));
	wb2.sendKeys("Deepali10@");
	
	//identify the next button in GUI
	WebElement wb3=driver.findElement(By.xpath("//span[@text()='Next']"));
	wb3.click();
	}

}
