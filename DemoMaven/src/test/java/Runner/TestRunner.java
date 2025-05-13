package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\ashwin.murugan\\eclipse-workspace\\DemoMaven\\Features\\AddProductsHB.feature", glue = {
		"StepDefinition" }, plugin = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, monochrome = false, dryRun = false

)
public class TestRunner {

}
