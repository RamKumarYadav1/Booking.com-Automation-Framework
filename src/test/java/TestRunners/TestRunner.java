package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features= ".//Features/Login.feature",
	//features = ".//Features/",
	//features= ".//Features/Register.feature",
	//features= ".//Features/LoginOtherFunctions.feature",
	//features= ".//Features/RegisterOtherFunctions.feature",	
	//features= ".//Features/LoginDataDriven.feature",".//Features/Registration.feature",	
	//features= ".//Features/Login.feature, .//Features/Register.feature",	
	
	glue = "StepDefinitions",
	//tags = "@sanity",
	plugin = {"pretty", "html:Test Reports/Latest Test Report"},
	monochrome = true,
	dryRun = false
)
public class TestRunner
{
	
}
