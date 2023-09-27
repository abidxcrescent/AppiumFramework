package com.testRunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.library.Configuration;
import com.library.LaunchAppium;
import com.library.SetUp;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
					features = ".//Features",
					glue = "stepDefinitions",
					dryRun = false,
					monochrome = true,
					plugin = {"pretty","html:test-outputs"}
				)

public class TestRunner {
	
	@BeforeClass
	public static void intantiate() {
		/*
		LaunchAppium.launchAppium();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		new Configuration();
	}
}
