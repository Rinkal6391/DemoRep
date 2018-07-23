package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Selenium_Workspace\\FreeCRMBDDFramework\\src\\main\\java\\Features",
		glue= {"stepDefination"},
		plugin= {"pretty:target/cucumber.pretty.txt"},
		//format={"pretty","html:test-output"}
		dryRun=true
		)



public class TestRunner {

}