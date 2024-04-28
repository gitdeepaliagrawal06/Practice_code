package ActionsClassPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutosuggestedRytClickUsingXpath 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
    driver.findElement(By.id("lst-ib")).sendKeys("qSpider");
    driver.findElement(By.xpath("//li/descendant::b[contains(text(),'r btm')]")).click();

}
}
