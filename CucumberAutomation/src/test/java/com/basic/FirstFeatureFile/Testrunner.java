package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features= {"src/test/resources/com/basic/FirstFeatureFile/"},
                 glue= {"com.basic.FirstFeatureFile"},   
		      		plugin= {"pretty",
		      				  "html:target/cucumber-htmlreport.html",
		      				  "json:target/cucumber-report.json"
		      				  
		      		        }
		          
		
		)

public class Testrunner {
	

}
