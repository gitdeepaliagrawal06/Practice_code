package DeepStupid;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 
{
@Test(groups= {"smoketest","rf"})
public void Deep1()
{
 System.out.println("this is my second test");
	}
@Test(groups= {"smoketest",})
public void Car()
{
	System.out.println("this is my third test");
}

@BeforeMethod()//it is always executed before each a and every @test method
public void a() {
		System.out.println("my login");
	}
@AfterMethod()//it is always executed after each a and every @test method
public void l()
{
System.out.println("My LogOut");
}
}
