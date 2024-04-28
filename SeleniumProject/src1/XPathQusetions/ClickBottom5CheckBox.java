//WAP to click Bottom 5 checkBox Avialble in Dynmaic WebTable
package XPathQusetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickBottom5CheckBox {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("agrawal.deepali10@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Deepali10@");
		driver.findElement(By.xpath("//span[text()='Next']")).click();	
		//identify all the check box from the dynamic webtable
		String X="//table[@class='F cf zt']/tbody/tr[*]/td[2]/div";
		List<WebElement> checkboxList=driver.findElements(By.xpath(X));
		System.out.println(checkboxList.size());
		//click top5 the checkbox
		for (int i =checkboxList.size();  i>checkboxList.size()-5;  i--)
		{
			checkboxList.get(i).click();
		}
	

}
}
