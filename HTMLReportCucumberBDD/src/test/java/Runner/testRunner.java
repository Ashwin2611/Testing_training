package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\ashwin.murugan\\eclipse-workspace\\HTMLReportCucumberBDD\\Features" }, glue = {
				"StepDefinition" }, plugin = { "json:target/cucumber.json" })

public class testRunner {

}
