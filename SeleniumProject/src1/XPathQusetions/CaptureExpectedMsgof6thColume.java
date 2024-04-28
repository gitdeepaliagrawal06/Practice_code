//WAP to capture all the massage or subject avialable in 6th Colume from Dynamic webtable.

package XPathQusetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureExpectedMsgof6thColume {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("agrawal.deepali10@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Deepali10@");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//identify 6th column from the dynamic webtable
		String X="//table[@class='F cf zt']/tbody/tr[*]/td[6]/div";
		
		List<WebElement> checkboxList=driver.findElements(By.xpath(X));
		
		String ExpMsg="LnT- Your CV has been shortlisted";
		System.out.println(checkboxList.size());
		//click gettext from 6th colum the checkbox
		for (int i =0; i>5; i++) 
		{
		String	massage=checkboxList.get(i).getText();
		System.out.println(massage);
			
		}}}


