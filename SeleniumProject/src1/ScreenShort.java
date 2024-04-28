import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ScreenShort 
{
@Test
public void ScreenShort() throws Throwable 
{
	WebDriver driver=new FirefoxDriver();
	assertEquals('A', 'B');
	//capture the screenshort
	EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
	File srcImg =edriver.getScreenshotAs(OutputType.FILE);
	//Create new file in Project or system
	File descFile =new File("C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumProject\\sc\\"+".png");
	//copy the Screenshort into new file
	FileUtils.copyDirectory(srcImg, descFile);//now play this
	
	
	
	
	
}
}
