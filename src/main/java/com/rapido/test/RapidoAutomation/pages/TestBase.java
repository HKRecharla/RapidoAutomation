package com.rapido.test.RapidoAutomation.pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Harikrishna Recharla
 *
 */

public class TestBase  {
	
	
	@BeforeSuite
	public void beforesuite(ITestResult result) {
		
	}
	
	
	@AfterSuite 
	public void afterSuite(ITestResult result) {
		
	
	}


}
