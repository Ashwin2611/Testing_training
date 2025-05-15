package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\ashwin.murugan\\eclipse-workspace\\POMHybridFWCucumberBDD\\Features\\Customers.feature", glue = {
		"StepDefination" }, plugin = { "pretty", "html:test-outout", "json:target/json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, monochrome = false, dryRun = false

)
public class testRunner {

}
