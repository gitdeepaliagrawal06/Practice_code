package XPathQusetions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureThePrice {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		//close the Popup
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//Search for iPhone Product
		driver.findElement(By.name("q")).sendKeys("iPhone x");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Capture the Price of "Apple iPhone x(Silver 64 GB)"
		//String x="//div[text()='Apple iPhone X (Silver, 64 GB)']/following::div[4]/div[1]/div[1]"
//	String x="//div[text()='Apple iPhone X (Silver, 64 GB)']/../following-sibling::div[contains(@class,'WAb')]/div/div/div\r\n" + 
//			"\r\n" + 
//			"";
		String x="//div[text()='Apple iPhone X (Silver, 64 GB)']/../following-sibling::div/div/div/div";
		String data=driver.findElement(By.xpath(x)).getText();
		System.out.println(data);
		
		
		
		
		
		
		
		
		
	}

}
