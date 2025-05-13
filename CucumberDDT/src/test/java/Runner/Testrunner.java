package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\ashwin.murugan\\eclipse-workspace\\CucumberDDT\\Features\\DDTSteps.feature", glue = {
		"StepDefinition" },  plugin = {"pretty", "junit:target/JUnitReports/report.xml",
				   "json:target/JSONReports/report.json",
				   "html:target/HtmlReports.html"}, monochrome = false, dryRun = false

)
public class Testrunner {

}
