package ActionsClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyTest 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("http://127.0.0.1/login.do");
	WebElement wb =driver.findElement(By.name("username"));
	wb.sendKeys("admin");
	//Handle Key Oprations
	Actions act=new Actions(driver);
	act.doubleClick(wb).perform();
	act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
	act.sendKeys(Keys.ENTER).perform();
	}
}
