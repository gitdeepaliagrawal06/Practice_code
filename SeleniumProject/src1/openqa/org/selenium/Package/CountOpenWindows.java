package openqa.org.selenium.Package;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountOpenWindows {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.irctc.co.in/");
		driver.findElement(By.linkText("Cab / Bus")).click();//this line is wrong
		Set<String> windowcount =driver.getWindowHandles();
		windowcount.size();
		System.out.println(windowcount);
		

	}

}
