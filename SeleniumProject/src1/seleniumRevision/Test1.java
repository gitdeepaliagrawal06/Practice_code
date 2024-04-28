  package seleniumRevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement wb =driver.findElement(By.id("identifierId"));
		wb.sendKeys("agrawal.deepali10@gmail.com");
		
		WebElement wb1 =driver.findElement(By.xpath("//span[text()='Next'"));
		wb1.click();
		
		WebElement wb2 =driver.findElement(By.name("password"));
		wb2.sendKeys("Deepali10@");
		
		WebElement wb3=driver.findElement(By.xpath("//span[text()='Next']"));
        wb3.click();
        
        driver.close();
		
		
	}

}
