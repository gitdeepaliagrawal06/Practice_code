package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFileTest {
	public static void main(String[] args) throws IOException
	{
		//Create the java Object of the Physical File
         FileInputStream fis=new FileInputStream("./testData/CommanData.properties");
		
		//Create a object of Properties class to load all the keys of Physical File
		Properties pObj =new Properties();
		pObj.load(fis);
		
		//Read the data using Keys
		String USER= pObj.getProperty("username");
		String PSW = pObj.getProperty("password");
		String URL = pObj.getProperty("url");
		
		System.out.println(USER);
		System.out.println(PSW);
		System.out.println(URL);
		
		WebDriver driver=new FirefoxDriver();
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(USER);
		driver.findElement(By.name("pwd")).sendKeys(PSW);
}

	
}
