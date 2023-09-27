package com.library;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;


/**
 * @author Abid Ali
 * 
 * SetUp class is where we first create a driver thread.
 * This is the only instance of the driver through out the project.
 * 
 * This is easier to maintain and if and when TestNG is implement
 * it makes it very easy to manage all the threads
 *
 */
public class SetUp {
	
	private static String URL = Configuration.getUrl();
	private static DesiredCapabilities capabilities = WindowPropertiesSetup.getCapabilities();
	
	
	
	/**
	 * This is the way to instantiate a Windows Driver
	 * Next step is to bind it to the CreateDriver instance
	 */
	public static WindowsDriver driver;
	
	
	
	
//	try {
//		public static WindowsDriver driver = CreateDriver.getInstance().getDriver();
//	} catch (MalformedURLException e) {
//		e.printStackTrace();
//	}
	
	
	
	/**
	 * In order to open an application SetUp class has to be instantiated
	 * A reference can be kept if needed.
	 * 
	 * Simple instantiation must be enough to open application
	 * 
	 */

	public SetUp() {
		try {
			driver = CreateDriver.getInstance().getDriver();
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		try {
			driver = CreateDriver.openApplication(URL, capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		/**
		 * If cookies could be clear it will be. 
		 * Other wise a log message with explanation will be logged
		 */
		driver.manage().deleteAllCookies();
		
	}
	
	
	
	/**
	 * @return driver
	 * 
	 * getDriver() returns the current instance of windows driver
	 * 
	 */
	public static WindowsDriver getDriver() {
		return driver;
	}

}
