package test_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/test/java/Features/search.feature",
		glue = "step_Definitions",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:test-output"}
		
		
		)
public class test_Run_Search {

}
