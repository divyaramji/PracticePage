package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features  = {"src/test/resources/cucumber"},
		glue = {"Stepdefinitioncucumber"},
		plugin = {"pretty", "html:reports/cucumber.html"}
		)


public class CucumberRunner{
	}

