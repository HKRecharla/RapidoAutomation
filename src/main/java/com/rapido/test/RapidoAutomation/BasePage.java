package com.rapido.test.RapidoAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rapido.test.RapidoAutomation.pages.ReportUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Harikrishna Recharla
 *
 */

public class BasePage  {



	public WebDriver driver;

	public BasePage(WebDriver driver)
	{
		this.driver= driver;
	}

	/**
	 * Launching ChromeBrowser
	 */
	public WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/harikrishna.r/Downloads/chromedriver");
		driver = new ChromeDriver(chromeOptions());
		return driver;
		//Can set Multiple browsers instamce with seitch case

	}

	/**
	 * Setting different chorme options
	 * @return
	 */
	public ChromeOptions chromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		return options;
	}


	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
	}
	
	public void waitUntilElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void getUrl() {
		driver.get(ReadProeprties.getProperty("url.web"));
		System.out.println("Launching URL  ==> "+ReadProeprties.getProperty("url.web"));
	}

	
	public WebDriver launchBrowser() {
		driver = getdriver();
		getUrl();
		maximizeBrowser();
		implicitWait();
		return driver;
	}
	
	
	public String getText(WebElement element) {
		String text = element.getText();
		System.out.println("text of Element  ==> "+text);
		return text;
	}
	
	
	
}
