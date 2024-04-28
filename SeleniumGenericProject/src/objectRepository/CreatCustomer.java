	package objectRepository;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClassTest;
@Listeners(com.actitime.genericlib.SampleLisener.class)
public class CreatCustomer extends BaseClassTest
{
   @Test
   public void creatCustomer() throws Throwable
   {
	   HomePage hg = PageFactory.initElements(driver,HomePage.class);
	   hg.clickOnTask();
	   hg.clickOnProjectAndCustomer();
	   hg.clickCreateNewCustomer();
	   //assertEquals('A','B');
	   hg.createCustomerName("jjj");
	   hg.clickOnCreateCustomerButton();
	   System.out.println(hg.getResponse());
	   assertEquals(hg.getResponse(),"Customer \"jjjj\" has been successfully created.");
   }
}
