package com.library;

import org.apache.log4j.Logger;



/**
 * @author Abid Ali
 *
 *A custom written Loggin class.
 *Logs are classified in 4 levels
 *
 *Info
 *Warn
 *Error
 *Fatal
 *
 */
public class Log {
	
	/*
	 * This is to initialize log4j logs
	 */
	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	
	public static void startOfTestCaes(String startTestCaseName) {
		Log.info("--------------------------------------------------------");
		Log.info("--------START---OF-----"+startTestCaseName+"----------");
		Log.info("--------------------------------------------------------");
	}
	
	public static void endOfTestCase(String startTestCaseName) {
		Log.info("xxxxxxxxxxx"+startTestCaseName+"xxxxxxxxxxxxxxxxxxxxxxxxxx");
	}
	
	
	public static void info(String message) {
		Log.info(message);
	}
	
	public static void warn(String message) {
		Log.warn(message);
	}
	
	public static void error(String message) {
		Log.error(message);
	}
	
	public static void fatal(String message) {
		Log.fatal(message);
	}
}

