package windowHandleing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadPopUp 
{
	public static void main(String[] args) 
	{
//		FirefoxProfile profile=new FirefoxProfile();
//		profile.setPreference("browser.download.folderList",2);
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
//		profile.setPreference("browser.download.dir", "c:\\se\\");
		
		//WebDriver driver=new FirefoxDriver(profile);
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://maven.apache.org/download.cgi");
		//click to download.zip file
		driver.findElement(By.linkText("apache-maven-3.6.0-bin.zip")).click();
		
		
	}

}
