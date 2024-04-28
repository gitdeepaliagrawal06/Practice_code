package DeepStupid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class New 
{
	@Test
	public void f()
	{
		System.out.println("My Name is Deepali Agarwal");
	}
	//for multiple test cases we have to write multiple classes with psvm
	// if we want to execute only 5 out of 10 test cases , it is not possible with multiple PSVM
	// so to overcome this problems we SWITCH to  TESTNG.
	@Test
	public void g()
	{
		System.out.println("My Name is Deepali Agarwal, and i am stupid");
	}
	@Test
	public void h()
	{
		System.out.println("My Name is Deepali Agarwal, and i am stupid and i am irritating");
	}
	@Test
	public void i()
	{
		System.out.println("My Name is Deepali Agarwal, and i dont have patience");
	}
	
}
