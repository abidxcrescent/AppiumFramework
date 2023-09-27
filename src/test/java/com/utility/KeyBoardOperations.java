package com.utility;

import java.net.MalformedURLException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import com.library.CreateDriver;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;




/**
 * @author Abid Ali
 * 
 * KeyBoardOperations has pre defined custom written methods
 * Some Frequently used methods can be written here.
 *
 */
public class KeyBoardOperations {
	
	
	public static WindowsDriver driver;
	
	public KeyBoardOperations() {
		 try {
			driver = CreateDriver.getInstance().getDriver();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	private static Actions action = new Actions(driver);
	
	
	/**
	 * selectTextElement allows us to select text value from an element
	 * It stimulates keyboard action to perform this operation
	 * @param element
	 */
	public static void selectTextFrom(WindowsElement element) {
		action.moveToElement(element).perform();
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
	}
	
	
	
	/**
	 * pasteTextTo allows us to paste text to the webelement
	 * @param element
	 */
	public static void pasteTextTo(WindowsElement element) {
		action.moveToElement(element).perform();
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
	}
	
	
	
	/**
	 * @param element
	 * switchTabs() will switch tabs using short key ALT TAB
	 */
	public static void switchTabs() {
		action.keyDown(Keys.ALT);
		action.keyDown(Keys.TAB);
		action.keyUp(Keys.ALT);
		action.keyUp(Keys.TAB);
	}
	
	
	
	
	/**
	 * @param element
	 * close application using short key ALT + F4
	 */
	public static void closeApplication() {
		action.keyDown(Keys.ALT);
		action.keyDown(Keys.F4);
		action.keyUp(Keys.ALT);
		action.keyUp(Keys.F4);
	}
	
	
}
