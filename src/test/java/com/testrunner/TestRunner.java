package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\java\\com\\features\\"},
		glue="stepdefinitions",
		dryRun=false,
		monochrome=true,
		tags= "@test",
		
		plugin= {
				
				"pretty",
				"html:target/cucumber-html-report",
				"json:target/cucumber.json",
				"junit:target/cucumber.xml"

				
				
				
		}
		
		
		
		)



public class TestRunner {

}
