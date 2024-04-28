package XPathQusetions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureTimeLeftDealOfTheDay {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     //Thread.sleep(30);
		driver.get("https://www.flipkart.com/");
	     Thread.sleep(30);
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		System.out.println(driver.findElement(By.xpath("//h2[text()='Deals of the Day']/../div/span")).getText());
		//System.out.println(driver.findElement(By.xpath("//img[contains(@src,'timer')]/following-sibling::span")).getText());
	}

}
