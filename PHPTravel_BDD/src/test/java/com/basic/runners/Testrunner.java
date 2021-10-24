package com.basic.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
        //dryRun=true,
        features= {"src/test/resources/FeatureFiles/"},
        glue= {"com.basic.StepDefinitions"},   
     		plugin= {"pretty",
     				  "html:target/cucumber-htmlreport.html",
     				  "json:target/cucumber-report.json",
     				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-extreport.html"
     				  },
     		tags= "@Flights"
		)
public class Testrunner {
	

}