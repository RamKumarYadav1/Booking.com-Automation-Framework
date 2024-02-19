package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features = ".//Features/",
	glue = "StepDefinitions",
	tags = "@sanity or @regression",
	plugin = {"pretty", "html:Test Reports/Latest Test Report"},
	monochrome = true,
	dryRun = false
	
	//tags="@sanity"  						// This will execute scenarios tagged with @sanity only
	//tags="@regression"					// This will execute scenarios tagged with @regression only
	//tags="@sanity and @regression" 		//Scenarios tagged with both @sanity and @regression
	//tags="@sanity and not @regression" 	//Scenarios tagged with @sanity but not tagged with @regression
	//tags="@sanity or @regression" 		//Scenarios tagged with either @sanity or @regression		
)
public class TestRunnerTags 
{
	
}