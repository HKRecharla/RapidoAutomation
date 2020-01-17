package com.rapido.test.RapidoAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Harikrishna Recharla
 *
 */

public class ReadProeprties {

	
	private static String propertyPath = "./src/main/resources/rapido.properties";
	
	public static String getProperty(String key) {

		Properties pr = new Properties();
		try {
			pr.load(new FileInputStream(propertyPath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pr.getProperty(key);
		
	}
	
}
