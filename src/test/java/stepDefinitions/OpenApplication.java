package stepDefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.library.Configuration;
import com.library.CreateDriver;
import com.library.WindowPropertiesSetup;

import cucumber.api.java.en.Given;
import io.appium.java_client.windows.WindowsDriver;

public class OpenApplication {
	
	private static String URL = Configuration.getUrl();
	private static DesiredCapabilities capabilities = WindowPropertiesSetup.getCapabilities();
	public static WindowsDriver driver;
	
	@Given("^I want to open application$")
	public void i_want_to_open_application() throws Throwable {
		try {
			driver = CreateDriver.getInstance().getDriver();
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		try {
			driver = CreateDriver.openApplication(URL, capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public static WindowsDriver getDriver() {
		return driver;
	}
}
