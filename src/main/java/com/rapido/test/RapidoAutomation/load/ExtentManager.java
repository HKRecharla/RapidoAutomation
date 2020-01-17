package com.rapido.test.RapidoAutomation.load;

import com.relevantcodes.extentreports.ExtentReports;

/**
 * @author Harikrishna Recharla
 *
 */

public class ExtentManager {
private static ExtentReports extent;
    
    public synchronized static ExtentReports getReporter(String filePath) {
        if (extent == null) {
            extent = new ExtentReports(filePath, true);
            
            extent
                .addSystemInfo("Host Name", "Hari")
                .addSystemInfo("Environment", "QA");
        }
        
        return extent;
    }
}
