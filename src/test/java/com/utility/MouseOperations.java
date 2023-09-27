package com.utility;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import com.library.CreateDriver;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;


/**
 * @author Abid Ali
 * 
 * This is a where all possible and required mouse operations are written.
 * Methods in this class will be static so ClassName.MethodName works.
 *
 */

public class MouseOperations {
	
	public static WindowsDriver driver;
	
	public MouseOperations() {
		 try {
			driver = CreateDriver.getInstance().getDriver();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
	private static Actions action = new Actions(driver);
	
	/**
	 * 
	 * 1.
	 * 
	 * rightClick method right click anywhere on the screen
	 */
	public static void rightClick() {
		action.contextClick().perform();
	}
	
	
	/**
	 * rightClick overloaded method performs right click operation by location element
	 * @param element
	 */
	public static void rightClick(WindowsElement element) {
		action.contextClick(element).perform();
	}
		
	
	/**
	 * rightClick overloaded method takes By by as an argument 
	 * @param by
	 */
	public static void rightClick(By by) {
		WindowsElement element = (WindowsElement) driver.findElements(by);
		action.contextClick(element).perform();
	}
	
	
	/**
	 * 
	 * 2.
	 * 
	 * doubleClick method double clicks on screen where the control is
	 */
	public static void doubleClick() {
		action.doubleClick().perform();
	}
	
	
	
	/**
	 * doubleClick overloaded method takes and element
	 * and double click on it.
	 * @param element
	 */
	public static void doubleClick(WindowsElement element) {
		action.doubleClick(element).perform();
	}
	
		
	/**
	 * doubleClick overloaded takes by as an argument and
	 * double clicks on it.
	 * @param by
	 */
	public static void doubleClick(By by) {
		WindowsElement element = (WindowsElement) driver.findElements(by);
		action.doubleClick(element).perform();
	}
	
	
	
	/**
	 * 
	 * 3. 
	 * 
	 * dragAndDrop drags a from source and drop at target
	 * @param source
	 * @param target
	 */
	public static void dragAndDrop(WindowsElement source, WindowsElement target) {
		action.dragAndDrop(source, target);
	}
	
	
	/**
	 * overloaded dragAndDrop locating element using By.
	 * @param source
	 * @param target
	 */
	public static void dragAndDrop(By source, By target) {
		WindowsElement sourceElement = (WindowsElement) driver.findElements(source);
		WindowsElement targetElement = (WindowsElement) driver.findElements(target);
		
		action.dragAndDrop(sourceElement, targetElement);
	}
	
	
	
	/**
	 * 
	 * 4.
	 * 
	 * hoverOn hovers the mouse on a given WebElement
	 * @param element
	 */
	public static void hoverOn(WindowsElement element) {
		action.moveToElement(element).perform();
	}
	
	
	/**
	 * overloaed hoverOn hover on element takes By by as
	 * an argument
	 * @param by
	 */
	public static void hoverOn(By by) {
		WindowsElement element = (WindowsElement) driver.findElements(by);
		action.moveToElement(element).perform();
	}

}
