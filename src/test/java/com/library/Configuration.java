package com.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * @author Abid Ali
 * Configuration class reads data from property files
 *
 */
public class Configuration {
public static Properties properties;
	
	

	/**
	 * These variables are specific Appium
	 * Will be used set Capablities
	 */
	private static String platformName;
	private static String url;
	private static String aumid;
	private static String deviceName;
	private static String appium;
	
	
	
	/**
	 * These variables are specific to Configuration class
	 */
	@SuppressWarnings("unused")
	private static String driverPath;
	private static String environment;
	
	
	/**
	 * These variables are specific to the UI
	 */
	public static String userName;
	public static String password;
	public static String headless;
	
	
	/**
	 * Configuration() this constructor when invoked will set up 
	 * Environment, Browser, DriverPath, URL
	 * 
	 * 
	 * --------------IMPORTANT NOTE-------------------
	 * THIS CONSTRUCTOR NEEDS TO BE INVOKED EXPLICITLY
	 * 
	 */
	public Configuration() {
		Configuration.setEnvironment();
		try {
			Configuration.setPlatform();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Configuration.setDriverPath();
		try {
			Configuration.setUrl();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(Configuration.getUserName());
		System.out.println(Configuration.getPassword());
		System.out.println(Configuration.getHeadless());
		System.out.println(Configuration.url);
		
	}

	
	/**
	 * @param propertyName
	 * @return
	 * @throws IOException
	 * 
	 * getProperty will take propertyName and return its respective property value
	 * from properties files.
	 * 
	 * This method takes a "property name" or "property key" as an input and
	 * return its respective "property value" from .properties file
	 * 
	 */
	public static String getProperty(String propertyName) throws IOException {
		
		/* File name that is to be opened
		The environments that can be selected are dev, test, prod*/
		String fileName = Configuration.environment+".properties";
		
		
		// Opening file using File class by passing location of the file
		File environmentFile = new File(System.getProperty("user.dir")+"/Config/"+fileName);
		FileInputStream fis = new FileInputStream(environmentFile);
		
 
		
		// Using the Properties references to create its object and pass FileInputStream to it 
		Configuration.properties = new Properties();
		Configuration.properties.load(fis);
		
		// Return the values using getProperty method	
		return Configuration.properties.getProperty(propertyName);
	}
	
	
	/**
	 * setEnviroment is where we can set up environments.
	 * Dev, Prod, Test are environments which have there properties folders
	 * 
	 * This method setup the environment
	 * To create new environments create a new file in "Config" folder
	 * with .properties extension
	 * 
	 */
	public static void setEnvironment() {
		
		// Fetching environment
		//Configuration.environment = System.getProperty("environment");
		
		//Environment will be null at first as we have not set it up
		//System.out.println(Configuration.environment);
		
		// This is where the test engineer will set up the environment
		if(Configuration.environment == null) {
			Configuration.environment = "Dev";
		}
		
		//System.out.println("Environment is  "+Configuration.environment);
		
	}
	
	
	
	/**
	 * @throws IOException
	 * setBrowser will set the browser recieved from properties file
	 */
	public static void setPlatform() throws IOException {
		
		// Fetching the value of browse.
		Configuration.platformName = System.getProperty("platformName");
		
		// The value of the browser will be null at first
		//System.out.println(Configuration.browser);
		
		if(Configuration.platformName == null) {
			Configuration.platformName = Configuration.getProperty("platformName");
		}
		
		System.out.println("platformName is "+Configuration.platformName);
		
	}
	

	
	/**
	 * @throws IOException
	 * setUrl will set retrieve url and set it
	 */
	public static void setUrl() throws IOException {
		
		// Fetching the value fo the url.
		Configuration.url = System.getProperty("url");
		
		//The Value of the url will be null at first
		//System.out.println(Configuration.url);
		
		if(Configuration.url == null) {
			Configuration.url = Configuration.getProperty("url");
		}
		
		//System.out.println("Url is "+Configuration.url);
	}
	
	
	
	
	/**
	 * @throws IOException
	 * setAumid() checks the if the value is null
	 * then set it from the value provided in properties file
	 */
	public static void setAumid() throws IOException {
		Configuration.aumid = System.getProperty("aumid");
		
		
		if(Configuration.aumid == null) {
			Configuration.aumid = Configuration.getProperty("aumid");
		}
		
		System.out.println("Aumid is "+Configuration.aumid);
		
	}
	
	
	
	/**
	 * @throws IOException
	 * setDeviceName() check if the value is null
	 * sets up a value give in properties file
	 */
	public static void setDeviceName() throws IOException {
		Configuration.deviceName = System.getProperty("deviceName");
		
		if(Configuration.deviceName == null) {
			Configuration.deviceName = Configuration.getProperty("deviceName");
		}
		
		System.out.println("Device Name is "+Configuration.deviceName);
	}
	
	
	public static void setAppium() throws IOException {
		Configuration.appium = System.getProperty("appium");
		
		if(Configuration.appium == null) {
			Configuration.appium = Configuration.getProperty("appium");
		}
		
	}
	

	/**
	 * setDriverPath will set the path of the Folders where drivers
	 * are located.
	 */
	public static void setDriverPath() {
		String path = System.getProperty("user.dir");
		String path1  = path + "/Drivers";
		Configuration.driverPath = path1;
		
	}
	
	
	
	/**
	 * The following getter methods are custom written.
	 * These methods double checks before returning "null" values.
	 * 
	 * 
	 * -----------------IMPORTANT NOTE-----------------
	 * Any new getter method must adhere to the same signature
	 * 
	 */
	
	
	public static String getUserName() {
		return Configuration.userName = Configuration.properties.getProperty("userName");
	}
	
	public static String getPassword() {
		return Configuration.password = Configuration.properties.getProperty("password");
		
	}
	
	public static String getHeadless() {
		return Configuration.headless = Configuration.properties.getProperty("headless");
	}
	
	
	public static String getDriverPath() {
		return Configuration.driverPath = Configuration.properties.getProperty("driverPath");
	}

	public static String getPlatformName() {
		return Configuration.platformName = Configuration.properties.getProperty("platformName");
	}
	
	public static String getAppium() {
		return Configuration.appium = Configuration.properties.getProperty("appium");
	}
	
	
	public static String getUrl() {
		return Configuration.url = Configuration.properties.getProperty("url");
	}
	
	public static String getAumid() {
		return Configuration.aumid = Configuration.properties.getProperty("aumid");
	}
	
	public static String getDeviceName() {
		return Configuration.deviceName = Configuration.properties.getProperty("deviceName");
	}

	public static String getEnvironment() {
		return Configuration.environment;
	}

	
	
}
