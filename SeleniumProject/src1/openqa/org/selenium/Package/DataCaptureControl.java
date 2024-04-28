package openqa.org.selenium.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataCaptureControl 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
        //Capture Current PageTitle
        String actTitle =driver.getTitle();
		System.out.println(actTitle);
		
		//Capture current Page URL
		String actURL =driver.getCurrentUrl();
		System.out.println(actURL);
	
		//Capture Current Page HTML Page Source Code
		//String actHtmlCode =driver.getPageSource();
		//System.out.println(actHtmlCode);
		
		driver.close();
		
		
		
	}

}
