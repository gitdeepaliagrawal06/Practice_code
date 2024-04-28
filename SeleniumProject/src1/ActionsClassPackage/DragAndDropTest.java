package ActionsClassPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://demos.telerik.com/kendo-ui/dragdrop/index");
	WebElement srcwb=driver.findElement(By.id("draggable"));
	WebElement dstwb=driver.findElement(By.id("droptarget"));
	Actions act=new Actions(driver);
	//Drag the element and Drop it to destination element
	act.dragAndDrop(srcwb, dstwb).perform();	
	
	
}
}
