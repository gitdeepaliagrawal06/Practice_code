package openqa.org.selenium.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyFbPage 
{
public static void main(String[] args) 
{
//Launch the FireFox empty Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//WebDriver driver=new FirefoxDriver();	

//Navigate to any URL on the Web-Driver launched browser
 driver.get("https://facebook.com");
 
 //Capture Current Page Title
 String exptitle ="Facebook – log in or sign up";
 
 String actTitle =driver.getTitle();
 System.out.println(actTitle);
 
 if(exptitle.equals(actTitle))
 {
	 System.out.println("FB page should be Displayed");
 }
 else
 {
	 System.out.println("FB page should not be Displayed");
 }}}
