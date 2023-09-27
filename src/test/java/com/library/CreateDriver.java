package com.library;


import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.windows.WindowsDriver;

/**
 * @author Abid Ali
 *
 */


/**
 * CreateDriver{} is a singleton class.
 * One one instance of a singleton class can be created.
 * It binds every object created to just one reference.
 * 
 * This class helps us to make sure only one instance of driver is created.
 * This is critical to maintain synchronization of the driver.
 * 
 * This is achieved by making the constructor private.
 *
 */
public class CreateDriver {
	
	
	private static CreateDriver instance = null;
	
	@SuppressWarnings("rawtypes")
	private static WindowsDriver driver;
	
	/*
	private static String URL = Configuration.getUrl();
	private static DesiredCapabilities capabilities = WindowPropertiesSetup.getCapabilities();
	*/
	
	
	/**
	 * This enforced private constructor makes sure that
	 * only one reference can be created through the project life cycle.
	 */
	private CreateDriver() {
		
	}
	
	
	
	/**
	 * getInstance will give the current instance of the CreateDriver class
	 * Only one object of CreateDriver will be create with all
	 * instances pointing to that SINGLE object.
	 * @return
	 */
	public static CreateDriver getInstance(){
		
		if(instance == null) {	
			instance = new CreateDriver();
		}
		
		return instance;
			
		
	}
	

	public static WindowsDriver openApplication(String URL, DesiredCapabilities capabilities) throws MalformedURLException {
		driver = new WindowsDriver(new URL(URL), capabilities);
		return driver;
	}
	
	
	
	/**
	 * This is the most important method to remember.
	 * This method returns the existing reference of the driver.
	 * This will be same through out the project.
	 * @return
	 * @throws MalformedURLException 
	 */
	@SuppressWarnings("rawtypes")
	public WindowsDriver getDriver() throws MalformedURLException {
		return driver;
	}
	
	
	
	
	/**
	 * 
	 * --------------WARNING--------------
	 * 
	 * Do not use this method unless no other way out 
	 * 
	 * It is not expected to be used ever.
	 * Since the whole idea of singleton class was to never be
	 * able to initialize another driver instance but it is here.
	 * @param webDriver
	 */
	@SuppressWarnings("rawtypes")
	public void setWindowsProperties(WindowsDriver windowsDriver) {
		driver = windowsDriver;
		
	}
	

	
	/**
	 * @param seconds
	 */
	public void driverWait(long seconds) {
		try {
			Thread.sleep(TimeUnit.SECONDS.toMillis(seconds));
		} catch (InterruptedException e) {
			System.out.println("To be replaced by log4j statements");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * This method refresh the page
	 * @throws MalformedURLException 
	 */
	public void driverRefresh() throws MalformedURLException {
		
		getDriver().navigate().refresh();
	}
	
	
	/**
	 * This method closes the browser.
	 * It closed the whole window.
	 */
	public void closeDriver() {
		try {
			getDriver().quit();
		}
		catch (Exception e) {
			System.out.println("To be replaced by log4j statements");
			e.printStackTrace();
		}
		
		
	}

}
