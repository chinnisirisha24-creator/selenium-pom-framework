
package com.automation.runner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/Features", 
		glue = {"com.automation.stepdefinitions",
				"com.automation.hooks"
		},
		
		plugin = {
				"pretty",
				"html:target/cucumber-reports.html",
				"json:target/cucumber-reports.json",
				"rerun:target/failed_scenarios.txt"
		},
		//tags="@Regression",
		dryRun =  true,
		monochrome = true
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel= false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	

}
