package com.utility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import org.apache.commons.io.FileUtils;
import com.library.CreateDriver;
import com.library.Log;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.appium.java_client.windows.WindowsDriver;

public class UIExecutor {
	
	
	
	public static WindowsDriver driver;
	
	public UIExecutor() {
		 try {
			driver = CreateDriver.getInstance().getDriver();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void uploadFileAutoIt(String filePath) {
		try {
			Runtime.getRuntime().exec(filePath);
		} catch (IOException e) {
			Log.info("File failed to upload");
			e.printStackTrace();
		}
	}
	
	
	public static void executeSprit(String filePath) {
		try {
			Runtime.getRuntime().exec(filePath);
		} catch (IOException e) {
			Log.info("File failed to execute");
			e.printStackTrace();
		}
	}
	
	
	
	public static void captureScreenShot(String fileLocation, String screenShotName) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenshot, new File(fileLocation+'\\'+screenShotName));
		} catch (IOException e) {
			Log.info("Screenshot failed to capture");
			e.printStackTrace();
		}
		
	}

}
