package openqa.org.selenium.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyErrorMsg 
{
	public static void main(String[] args) throws InterruptedException 
	{
// Test Data
String expTitle ="Gmail";
String expErrorMsg ="Couldn't find your Google Account";

//Step1: Navigate to Gmail Page
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("http://www.gmail.com");
String actTitle =driver.getTitle();
if (expTitle.equals(actTitle)) 
{
System.out.println("Gmail Page is Verified = PASS");
}
else 
{
System.out.println("Gmail Page is not Verified = Fail");
}
//Step2: Enter invalid Email and Verify Error msg
driver.findElement(By.id("identifierId")).sendKeys("hh");
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(20000);

//Step3: identify error msg element and verify the text of the element
WebElement wb=driver.findElement(By.xpath("(//div[@class='dEOOab RxsGPe'])[1]"));
String actMsg =wb.getText();
if (expErrorMsg.equals(actMsg)) 
{
	System.out.println("error msg is verified= Pass");
}
else
{
	System.out.println("error msg is not Verified = Fail");
}
//Capture colour from the same above text element
String color =wb.getCssValue("color");
System.out.println(color);
}
	
	
}
