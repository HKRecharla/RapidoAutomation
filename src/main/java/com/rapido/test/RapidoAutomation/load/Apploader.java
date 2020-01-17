package com.rapido.test.RapidoAutomation.load;

import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

/**
 * @author Harikrishna Recharla
 *
 */

public class Apploader {
	
	public static ExtentReports report = CommonExtent.returnInstance();
	public static ExtentTest test;
	

	@BeforeSuite
	public void beforesuite(ITestResult result) {
		
	}
	
	
	@AfterSuite 
	public void afterSuite(ITestResult result) {
		
	
	}
}
