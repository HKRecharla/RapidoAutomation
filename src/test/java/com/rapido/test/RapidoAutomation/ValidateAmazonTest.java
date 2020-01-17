package com.rapido.test.RapidoAutomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.rapido.test.RapidoAutomation.load.Apploader;
import com.rapido.test.RapidoAutomation.pages.HomePage;
import com.rapido.test.RapidoAutomation.pages.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Harikrishna Recharla
 *
 */

public class ValidateAmazonTest extends Apploader  {
	WebDriver driver;
	
	@Test
	public void testAmazon() {
		
		BasePage base = new BasePage(driver);
		driver = base.launchBrowser();
		
		
		HomePage home = new HomePage(driver);
		home.enter_ItemsDetails().clickon_Search();
		
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	
	
	
}
