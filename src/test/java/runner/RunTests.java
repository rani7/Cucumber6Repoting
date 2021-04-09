package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"F:\\Eclipse-selenium\\workspace\\Cucumber6Reporting\\src\\test\\resources\\features\\Reporting.feature"},
		glue = {"stepdefinitions"},
		plugin = {"pretty",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		monochrome=true				
		)

public class RunTests {
	
}
