package com.library;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import io.appium.java_client.events.api.general.WindowEventListener;




/**
 * @author Abid Ali
 * 
 * EventImplementations will implements WindowsEventListener
 * 
 * In this class certain steps can be defined before and after
 * a certain event.
 * 
 * Examples include we can write Log statements before and after windows.
 * This can give a clear idea of what has happened in Logs in the event a test case fails
 *
 */
public class EventImplementations implements WindowEventListener{

	public void beforeWindowChangeSize(WebDriver driver, Window window, Dimension targetSize) {
		Log.info("Window size will be changed to "+targetSize);
		
	}

	public void afterWindowChangeSize(WebDriver driver, Window window, Dimension targetSize) {
		Log.info("Window size is changed to "+targetSize);
		
	}

	public void beforeWindowIsMoved(WebDriver driver, Window window, Point targetPoint) {
		Log.info("Window will be moved to "+targetPoint);
		
	}

	public void afterWindowIsMoved(WebDriver driver, Window window, Point targetPoint) {
		Log.info("Window has moved to "+targetPoint);
		
	}

	public void beforeWindowIsMaximized(WebDriver driver, Window window) {
		Log.info("Window will be maximized");
		
	}

	public void afterWindowIsMaximized(WebDriver driver, Window window) {
		Log.info("Window is maximized");
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		Log.info("Window will be switched to "+windowName);
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		Log.info("Window has switched to "+windowName);
		
	}

}
