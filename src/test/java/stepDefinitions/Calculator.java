package stepDefinitions;

import cucumber.api.java.en.Given;
import io.appium.java_client.windows.WindowsDriver;

public class Calculator {
	

	
	
	
	
	


	@Given("^I want to add two numbers$")
	public void i_want_to_add_two_numbers() throws Throwable {
		WindowsDriver driver = OpenApplication.getDriver();
		driver.findElementByName("Seven").click();
		driver.findElementByName("Plus").click();
		driver.findElementByName("Seven").click();
		driver.findElementByName("Equals").click();
	}

}
