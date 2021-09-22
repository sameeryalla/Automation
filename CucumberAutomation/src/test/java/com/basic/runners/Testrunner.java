package com.basic.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         monochrome=true,
		         dryRun=false,
		         features= {"src/test/resources/com/basic/FeatureFile/"},
                 glue= {"com.basic.StepDefinitions"},   
		      		plugin= {"pretty",
		      				  "html:target/cucumber-htmlreport.html",
		      				  "json:target/cucumber-report.json"
		      				  
		      		        }
		          
		
		)

public class Testrunner {
	

}
