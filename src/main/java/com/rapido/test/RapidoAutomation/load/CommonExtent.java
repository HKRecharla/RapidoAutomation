package com.rapido.test.RapidoAutomation.load;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

/**
 * @author Harikrishna Recharla
 *
 */

public class CommonExtent {

	public static ExtentReports extent;
	public static ExtentReports returnInstance() {
		if (extent == null) {
			extent = new ExtentReports( "./ExecutionReport.html", true,
					DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(
					new File(System.getProperty("user.dir") + "/src/main/resources/ExtentConfig/ReportsConfig.xml"));
		}

		return extent;
	}
}
