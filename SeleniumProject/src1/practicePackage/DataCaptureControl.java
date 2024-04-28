package practicePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataCaptureControl 
{
	public static void main(String[] args) 
	{
// launch the browser
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//navigate to url
	driver.get("https://www.facebook.com");
	
	//Capture curren page url
	String actTitle = driver.getTitle();
	System.out.println(actTitle);
	
	//Capture to currentURL
	String actURL = driver.getCurrentUrl();
	System.out.println(actURL);
    driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
