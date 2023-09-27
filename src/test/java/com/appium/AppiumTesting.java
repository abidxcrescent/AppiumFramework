package com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class AppiumTesting {
	public static void main(String[] args) throws MalformedURLException {
		
		
		WindowsDriver driver = null;
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app","Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("deviceName", "WindowsPC");
		driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);
		
	}
}
