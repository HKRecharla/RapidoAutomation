package com.rapido.test.RapidoAutomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.rapido.test.RapidoAutomation.load.Apploader;
import com.rapido.test.RapidoAutomation.pages.HomePage;
import com.rapido.test.RapidoAutomation.pages.ReportUtils;
import com.rapido.test.RapidoAutomation.pages.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Harikrishna Recharla
 *
 */

public class ValidateAmazonTest  {
	WebDriver driver;
	
	
	
	@Test
	public void testAmazon() {
		BasePage base = new BasePage(driver);
		driver = base.launchBrowser();
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver); 
		ReportUtils report = new ReportUtils();
		eventHandler.register(report);
		driver = eventHandler;
		//test.log(LogStatus.INFO, "Successfukky");
		
		HomePage home = new HomePage(driver);
		home.enter_ItemsDetails().clickon_Search();
		
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
}
