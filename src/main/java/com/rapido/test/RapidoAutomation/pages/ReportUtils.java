package com.rapido.test.RapidoAutomation.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.IExecutionListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.IResultListener;
import org.testng.log4testng.Logger;
import org.testng.xml.XmlSuite;

import com.rapido.test.RapidoAutomation.load.Apploader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




@SuppressWarnings("unused")
public class ReportUtils extends Apploader implements ITestListener{

	
	@Override
	public void onFinish(ITestContext test) {
		// TODO Auto-generated method stub
		System.out.println("Test Case finished "+test.getName());
	}

	@Override
	public void onStart(ITestContext test) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Test Case started "+test.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult testResult) {
		// TODO Auto-generated method stub
		test.log(LogStatus.FAIL, testResult.getMethod()+" FAIL");
//		try {
//			test.log(LogStatus.FAIL, test.addScreenCapture(commonUtil.getScreenshot(testResult.getName())));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		report.endTest(test);
		report.flush();
		 
	}

	@Override
	public void onTestSkipped(ITestResult testResult) {
		test.log(LogStatus.SKIP, testResult.getMethod().getMethodName() + " SKIPPED");
		
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=report.startTest(result.getName());
		test.log(LogStatus.PASS, "Test Case started");
	 
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		test.log(LogStatus.PASS, arg0.getMethod().getMethodName()+" PASS");
		report.endTest(test);
		report.flush();
		
		
	}


}
	