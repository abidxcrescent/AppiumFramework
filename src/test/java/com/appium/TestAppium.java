package com.appium;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.windows.WindowsDriver;

public class TestAppium {
	
		WindowsDriver driver = null;	
		
		
		public void setUp() throws MalformedURLException {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", "Microsoft.WindowsMaps_8wekyb3d8bbwe!App");
			
			driver = new WindowsDriver(new URL("http://127.0.0.1:4723"),capabilities);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
	
		public void tearDown() {
			System.out.println("done");
		}
		
		
		public void findofficeroute() {
			
		}
	
		
		
}
