//WAP to navigate 'Flipkart.com' search for iPhone then Capture no of product
//avialble in the inventory.
package XPathQusetions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureInventryCountOfFlipkart {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//WebDriver driver=new  FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	
	//close the Popup
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	//Search for iPhone Product
	driver.findElement(By.name("q")).sendKeys("iPhone 10");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Capture the Dynamic text from the UI
	//String x="//div[@class='_3UEiDE']/span";
	String x="//span[contains(text(),'Showing')]";
	
	String data= driver.findElement(By.xpath(x)).getText();
	System.out.println(data);
	
	//Split the complete string data based on Space
	String[]arr =data.split(" ");
	System.out.println(arr[5]);
	
	//get the String Count from the array
	String StringCount =arr[5].replaceAll(",", " ");

     //Convert String into Integer using Wrapper Class
	int intCount =Integer.parseInt(StringCount);
	System.out.println(intCount);
	
	
	
	
	
	
	
	}

	

}
