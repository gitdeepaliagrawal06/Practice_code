//WAP to navigate 'Amazon.com' search for iPhone then Capture no of product 
//avialble in the inventory.
package XPathQusetions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureInventoryCountOfAmazon {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		//Search for product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x",Keys.ENTER);
		String inventoryCount =driver.findElement(By.id("s-result-count")).getText();
	   System.out.println(inventoryCount);	
	}
	

}
