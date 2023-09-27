package com.utility;


/**
 * @author Abid Ali
 * 
 * Global variables are generally static in nature, can be initialized at the start of a
 * test, and remain available throughout the entire test run. 
 * Variables for application defaults, timeouts, property file locations, paths, and so on can be stored in this
 * To be clear, test data is not stored in this class.
 * Here is an example of some default global variables:
 *
 */
public class GlobalVariables {
	public static final String PLATFORM = "Windows Local";
	public static final String ENVIRONMENT = "Dev";
	public static final String BROWSER = "Windows";
	public static final String URL = "http://127.0.0.1:4723/";
	public static final String AUMID = "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App";
	public static final String PLATFROM = "Windows";
	public static final String DEVICENAME = "Windows 10";
	
	
	// test output path defaults
	public static final String TEST_OUTPUT_PATH = "testOutput/";
	public static final String LOGFILE_PATH = TEST_OUTPUT_PATH + "Logs/";
	public static final String REPORT_PATH = TEST_OUTPUT_PATH + "Reports";
	
	
	// timeout defaults
	public static final int TIMEOUT_MINUTE = 60;
	public static final int TIMEOUT_SECONDS = 1;
	public static final int TIMEOUT_ZERO = 0;
}
