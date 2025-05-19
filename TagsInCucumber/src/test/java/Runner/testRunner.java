package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\ashwin.murugan\\eclipse-workspace\\TagsInCucumber\\Features", glue = {
		"StepDefination" },/*tags="(@smoke or @regression) and @important"*/tags="@regression and not @smoke", plugin = { "pretty", "html:test-outout", "json:target/json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, monochrome = false, dryRun = false

)
public class testRunner {

}
