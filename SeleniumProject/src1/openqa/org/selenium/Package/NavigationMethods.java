package openqa.org.selenium.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationMethods
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to("https://mail.google.com/mail/u/0/");
	
	//click on create Account Link
	driver.findElement(By.xpath("//span[text()='Create account']")).click();
	
	//click on browser back button
	driver.navigate().back();
	
	driver.navigate().forward();
	
	driver.manage().deleteAllCookies();
	//driver.close();
	}
}
