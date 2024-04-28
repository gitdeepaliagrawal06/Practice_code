package XPathQusetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnTop6CheckBox 
{
public static void main(String[] args) throws Throwable 
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("agrawal.deepali10@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Deepali10@");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		String X="//table[@class='F cf zt']/tbody/tr/td[@class='oZ-x3 xY']";
		//String y="(//table[@class='F cf zt']/tbody/tr/td[@class='oZ-x3 xY'])[5]";
		//List<WebElement> checkboxList=driver.findElements(By.xpath(X));
		//System.out.println(checkboxList.size());
		//click top5 the checkbox
		for (int i =1; i <5; i++)
		{
			
			String y="(//table[@class='F cf zt']/tbody/tr/td[@class='oZ-x3 xY'])["+i+"]";
			driver.findElement(By.xpath(y)).click();
			//checkboxList.get(i).click();
		}
}

	}


