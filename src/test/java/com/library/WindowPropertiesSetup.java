package com.library;

import org.openqa.selenium.remote.DesiredCapabilities;




/**
 * @author Abid Ali
 * 
 * WindowsPropertiesSetup will set the desired capabilities.
 * 
 * Three most crucial capabilities must include AUMID, platformName, deviceName
 * These capabilities come from properties file.
 * 
 * Any new capabilities must also come from properties file.
 *
 */
public class WindowPropertiesSetup {
	
	private static String AUMID = Configuration.getAumid();
	private static String platformName = Configuration.getPlatformName();
	private static String deviceName = Configuration.getDeviceName();
	
	
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	
	
	
	/**
	 * @return capabilities
	 * 
	 * getCapabilities() will first set the capabilities
	 * This form will make sure all the capabilities are always set throughout 
	 * project life cycle
	 * 
	 * Alternatively a seperate setCapabilities and getCapabilities methods can 
	 * be written which achieves the same purpose but looses flexibility to 
	 * change it later
	 * 
	 */
	public static DesiredCapabilities getCapabilities() {
		
		capabilities.setCapability("app",AUMID);
		capabilities.setCapability("platformName", platformName);
		capabilities.setCapability("deviceName", deviceName);

		return capabilities;
	}
	
		
	
	
}
