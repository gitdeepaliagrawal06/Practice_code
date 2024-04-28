package objectRepository;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.FileUtiles2;

public class Login 
{
@FindBy(name="username")
private WebElement use;

@FindBy(name="pwd")
private WebElement pwss;

@FindBy(id="loginButton")
private WebElement btn;

public void loginToActitime() throws Throwable
{
	 FileUtiles2 fis =new FileUtiles2();
	 Properties pobj=fis.getProterties();
	 String user=pobj.getProperty("username");
	 String pws=pobj.getProperty("password");
	 use.sendKeys(user);
	 pwss.sendKeys(pws);
	 btn.click();	 
}
}

