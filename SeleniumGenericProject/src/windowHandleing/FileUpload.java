package windowHandleing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws AWTException, Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/");
		driver.findElement(By.name("identifier")).sendKeys("agrawal.deepali10@gmail.com",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("Deepali10@",Keys.ENTER);
		//driver.findElement(By.cssSelector("div[class='gb_gf'] a svg")).click();
		driver.findElement(By.xpath("//a[@class='gb_x']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='gb_C gb_u']/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='aic']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		Thread.sleep(2000);
		
		//file upload by using Robort class
		
		Robot rbt=new Robot();
		rbt.setAutoDelay(2000);
		StringSelection strgSelcn=new StringSelection("C:\\Users\\Agrawal\\Desktop\\convert-jpg-to-pdf.net_2019-03-26_17-03-07.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strgSelcn, null);
		rbt.setAutoDelay(2000);
		
		rbt.keyPress(KeyEvent.VK_CONTROL );
		rbt.keyPress(KeyEvent.VK_V);

		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_V);
		
		rbt.setAutoDelay(2000);
		
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
			
		
	}

}