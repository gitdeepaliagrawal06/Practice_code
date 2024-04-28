package ActionsClassPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveTest 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
       //Step:1 find "ShopBy" Element where we need to take mouse cursor
       WebElement wb=driver.findElement(By.xpath("//span[text()='Shop by']"));
       
       //Step2: Create an object of Action class
        Actions act=new Actions(driver);
        
        //Step3: take a mouse cursor middel of the Identified Element
        act.moveToElement(wb);
        
        //Step4: To excute the actions class control
        act.perform();
        
        //Step5: Find an Sub Menu Element
        WebElement wb1=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
        
        //Step6: Again take the mouse cursor on the Sub-Menu
        act.moveToElement(wb1).perform();
        
        //Step7: click on "Tablats" Link
        WebElement wb2=driver.findElement(By.xpath("//span[text()='Tablets']"));
		wb2.click();
		}

}
