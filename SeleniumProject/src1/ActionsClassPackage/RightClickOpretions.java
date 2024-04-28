package ActionsClassPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOpretions 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	//Type data in AutoSuggested edit box
	driver.findElement(By.xpath("//h3[@class='LC20lb']")).sendKeys("Wipro jobs",Keys.ENTER);
	
	//driver.findElement(By.id("lst-ib")).sendKeys("Wipro jobs",Keys.ENTER);
	Actions act=new Actions(driver);
	//right click on"Discover a World of Opportunities" Link element
	WebElement wb=driver.findElement(By.xpath("//a[text()='Wipro Careers | Discover a World of Opportunities | Join Us Today!']"));
	act.contextClick(wb).perform();
	//
	act.sendKeys("T").perform();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
