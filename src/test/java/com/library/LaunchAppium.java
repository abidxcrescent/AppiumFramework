package com.library;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


/**
 * @author Abid Ali
 * 
 * LaunchAppium is a class where we launch appium client
 * File location of appium client is needed which is
 * externalized to properties file.
 *
 * To launch appium this class must be instantiated
 *
 */
public class LaunchAppium {
	
	
	public static String appium = Configuration.getAppium();
	
	public static void launchAppium() {
		System.out.println("In Lauch Appium");
		Desktop desktop = Desktop.getDesktop();
		
		File file = new File(appium);
		
		if(!Desktop.isDesktopSupported()) {
			Log.info("Failed to lauch appium");
			
		}
		
		if(file.exists()) {
			Log.info("Appium is located at the file");
			try {
				desktop.open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
