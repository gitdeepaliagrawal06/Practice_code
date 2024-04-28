package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tk;	
	
	public void clickOnTask()
	{
		tk.click();
	}
	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement pc;
    public void clickOnProjectAndCustomer()
      {
	pc.click();
      }
    @FindBy(xpath="//input[@value='Create New Customer']")
    private WebElement cnc;
    
    public void clickCreateNewCustomer()
    {
    	cnc.click();
    }
    @FindBy(name="name")
    private WebElement cn;
    
    public void createCustomerName(String name)
    {
    	cn.sendKeys(name);
    }
    @FindBy(name="createCustomerSubmit")
    private WebElement cnbut;
    
    public void clickOnCreateCustomerButton()
    {
    	cnbut.click();
    }
  
    	@FindBy(className="successmsg")
    	private WebElement responseText;
    	public String getResponse()
    	{
    		return responseText.getText();
    }
    
//    public void newCustomer()
//    {
//    	clickOnTask();
//    	clickOnProjectAndCustomer();
//    	clickCreateNewCustomer();
//    	createCustomerName("manish");
//    	clickOnCreateCustomerButton();
//    }
    
    
 }
