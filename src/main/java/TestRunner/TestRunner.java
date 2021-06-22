package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\features\\Login.feature",
		glue = { "StepDefinitions" },
		format = { "pretty", "html:test-output", "json:report_json/cucumber.json","junit:report_xml/cucumber.xml" }, 
		dryRun = false, 
		monochrome = true, 
		strict = true

)

public class TestRunner {

}
