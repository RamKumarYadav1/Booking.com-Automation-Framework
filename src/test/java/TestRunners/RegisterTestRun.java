package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features = {".//Features/Register.feature"},
	glue = {"StepDefinitions"},
	plugin = {"pretty", "html:Test Reports/Register Test Report"},
	monochrome = true,
	dryRun = false
)
public class RegisterTestRun 
{

}
