package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleLisener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult t) 
	{
		String testFailName=t.getMethod().getMethodName();
		System.out.println(testFailName);
		BaseClassTest bct=new BaseClassTest();
		EventFiringWebDriver edriver=new EventFiringWebDriver(bct.driver);
	    File srcImag =edriver.getScreenshotAs(OutputType.FILE);
	    File destImg =new File("C:\\Users\\Agrawal\\eclipse-workspace\\SeleniumGenericProject\\screenshort1\\"+testFailName+".png");
	    try
	    {
	    	FileUtils.copyFile(srcImag, destImg);
	    }
	    catch(IOException e)
	    {
	    	
	    }

		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
	
	
