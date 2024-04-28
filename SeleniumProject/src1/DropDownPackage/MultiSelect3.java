//WAP to capture and display all the values from the DropDown?
package DropDownPackage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiSelect3 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Agrawal/Desktop/MultiSelect.html");
		
		//Identify the Drop Down
		WebElement wb=driver.findElement(By.name("PLangusge"));
		
		//create a object of Select class
		Select s=new Select(wb);
		
		//Capture all the options from dynamic dropDown
		List<WebElement> lst=s.getOptions();
		
		//Get the Option Count
		System.out.println(lst.size());
		
		//Display all the Values
		for (int i =0; i<lst.size()-1; i++) 
		{
		System.out.println(lst.get(i).getText());
		
		
		{
			
			
		}
			
			
		}}}
