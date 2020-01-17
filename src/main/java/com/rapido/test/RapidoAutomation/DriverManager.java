package com.rapido.test.RapidoAutomation;

import org.openqa.selenium.WebDriver;

/**
 * @author Harikrishna Recharla
 *
 */

public class DriverManager {

public static ThreadLocal<WebDriver> webDriverMap = new ThreadLocal<WebDriver>();
	
	public static WebDriver getWebDriver(){
		return webDriverMap.get();
	}
}
