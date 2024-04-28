package ActionsClassPackage;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragAndDropTest2{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demos.telerik.com/kendo-ui/dragdrop/index");
		WebElement srcwb=driver.findElement(By.id("draggable"));
		WebElement dstwb=driver.findElement(By.id("droptarget"));
		Actions act=new Actions(driver);
		//Drag the element and Drop it to destination element
		act.clickAndHold(srcwb).moveToElement(dstwb).release().build().perform();
		
	}
}
