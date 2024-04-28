package ActionsClassPackage;

import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeKeyOpration {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
		
		//Actions act = new Actions(driver);
		WebElement wb =driver.findElement(By.name("username"));
		wb.sendKeys("admin");
		
		Actions act = new Actions(driver);
		//we will double click on that element----by this just we will select the for copying
		act.doubleClick(wb).perform();
		//and by this copy the element
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		
		//if we want to paste that copied element into the password field so we need to find that element and paste it
		WebElement wb1=driver.findElement(By.name("pwd"));
		//now agian we will double click on password field
		act.doubleClick(wb1).perform();
		// here we will paste the thing what we will copied
		act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		
		//act.sendKeys(Keys.ENTER).perform();
	}

}
