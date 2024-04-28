package XPathQusetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
	/*List<WebElement> list=driver.findElements(By.xpath("//span[text()='java']/../../../../li/div/div/span/b"));*/
	List<WebElement> list=driver.findElements(By.xpath("//ul[@class='erkvQe' and @role='listbox']/li[@class='sbct']/div/div[@class='sbtc']/div//span"));
	System.out.println("Dispaly total no of suggesion of search box:::===>" + list.size());
	
	for (int i = 1; i <list.size(); i++) {
		System.out.println(list.get(i).getText());
		if (list.get(i).getText().contains("java tutorial"))
		{
			list.get(i).click();
			break;
		}
		
	}
	
	
	
}
}
