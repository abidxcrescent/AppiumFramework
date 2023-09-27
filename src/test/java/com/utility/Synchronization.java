package com.utility;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.library.CreateDriver;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;




/**
 * @author Abid Ali
 * 
 * Sychronization class is use to make the execution synchronus
 * It has custom written waits for the driver thread.
 * Instead of explicitly using thread wait these wait will
 * 
 * a. Wait only for required time before throwing exceptions
 * b. Takes care of StaleElementReferenceException
 * 
 *
 */
public class Synchronization {
	
	
	
	public static WindowsDriver driver;
	
	public Synchronization() {
		 try {
			driver = CreateDriver.getInstance().getDriver();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * waitFor method to wait up to a designated period before
	 * throwing an exception (static locator)
	 * 
	 * @param element
	 * @param timer
	 * @throws exception
	 */
	
	public static void waitFor(WindowsElement element, int timer) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver, timer);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
	}
	
	/**
	 * Overloaded waitFor method to wait up to a designated period before
	 * throwing an exception (dynamic locator)
	 * 
	 * @param element
	 * @param timer
	 * @throws exception
	 */
	
	public static void waitFor(By by, int timer) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,timer);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOfElementLocated(by)));
		
	}
	
	/**
	 *waitForGone method to wait up to a designated period before
	 *throwing an exception if element still exists
	 * 
	 * @param element using by
	 * @param timer
	 * @throws exception
	 */
	
	public static void waitForGone(By by, int timer) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver, timer);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}
	
	/**
	* waitForURL method to wait up to a designated period before
	* throwing exception if URL is not found
	*
	* @param url
	* @param timer
	* @throws Exception
	*/
	
	public static void waitForURL(String url, int seconds) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.urlContains(url)));
	}
	
	
	/**
	 * waitForTitle waits for the title to appear for designated period of time
	 * before throwing an exception.
	 * @param title
	 * @param seconds
	 * @throws Exception
	 */
	public static void waitForTitle(String title, int seconds) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.titleContains(title)));
	}
}
