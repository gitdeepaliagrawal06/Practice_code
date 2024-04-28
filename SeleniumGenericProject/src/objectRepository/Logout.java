package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout 
{
	@FindBy(id="logoutLink")
	private WebElement lgo;
	public void logoutActitime()
	{
	lgo.click();
	}
}
