package com.rapido.test.RapidoAutomation.load;

import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Harikrishna Recharla
 *
 */

public class Apploader {
	
	public static ExtentReports report = CommonExtent.returnInstance();
	public static ExtentTest test;
	

	@BeforeSuite
	public void besuite(ITestResult result) {
		test.log(LogStatus.INFO, "Successfukky launched browser");
	}
	
	
	@AfterSuite 
	public void afSuite(ITestResult result) {
		
	
	}
}
