//WAP to Login to Gmail Application,Then select all the inbox message checkbox from 
//the Dynamic WebTable then click on delete button.
package XPathQusetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectAllTheInboxMassage 
{
	
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.gmail.com/");
	driver.findElement(By.id("identifierId")).sendKeys("agrawal.deepali10@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("Deepali10@");
	driver.findElement(By.xpath("//span[text()='Next']")).click();	
	//identify all the check box from the dynamic webtable
	String X="//div[@class='G-tF']//span[@role='checkbox']";
	List<WebElement> checkboxList=driver.findElements(By.xpath(X));
	System.out.println(checkboxList.size());
	//click all the checkbox
	for(WebElement wb:checkboxList)
	{
		wb.click();
	}	
}

}
