//Write a Selenium Test To navigate to Google and Search for "Wipro Jobs",then 
//Capture all the Link name and display in console.
package XPathQusetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureAllTheLinks {
	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
    	List<WebElement>  links=driver.findElements(By.tagName("input"));	
    	System.out.println(links.size());
//    	for (int i =0; i <links.size(); i++) 
//    	{
//    		String linkText=links.get(i).getText();
//    		System.out.println(linkText);
//			
//		}
    	 for(WebElement wb:links)
    	{
    		System.out.println(wb.getText());
    	}
	}

}
