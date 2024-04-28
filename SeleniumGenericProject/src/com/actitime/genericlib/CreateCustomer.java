package com.actitime.genericlib;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectRepository.HomePage;

public class CreateCustomer extends BaseClassTest
{
    HomePage hp = PageFactory.initElements(driver,HomePage.class);
	@Test
	public void createCustomer()
	{
		System.out.println("Customer is create");
	}
	@Test
	public void modifyCustomer()
	{
		System.out.println("Customer is modifyed");
	}
	@Test()
	public void deleteCustomer()
	{
		System.out.println("Customer is deleted");
	}
}
