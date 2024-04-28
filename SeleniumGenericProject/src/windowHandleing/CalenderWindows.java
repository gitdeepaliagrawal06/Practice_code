package windowHandleing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderWindows 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		//click on "Depart" calender Icon
		driver.findElement(By.xpath("//input[@id='departure']/../..")).click();
		String x1="//td[@data-year='2019' and @data-month='0']/a[text()='25']";
        String x="//div[@class='datefilter hasDatepicker']//span[text()='Next']";
        int count=0;
        while(count<=24)
        {
        try {
        	//select the date
        	WebElement path=driver.findElement(By.xpath("x1"));
        	path.click();
        	break;
        	}
        catch (Throwable t)
        {
        WebElement path1=driver.findElement(By.xpath("x"));
        path1.click();
        count++;
        }
	}}}
		

