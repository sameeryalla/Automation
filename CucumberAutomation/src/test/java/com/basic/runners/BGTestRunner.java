package com.basic.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         monochrome=true,
		         //dryRun=true,
		         features= {"src/test/resources/com/basic/BackgroundFF/"},
                 glue= {"com.basic.DataTableSD"},   
		      		plugin= {"pretty",
		      				  "html:target/cucumber-htmlreport.html",
		      				  "json:target/cucumber-report.json"
		      				  
		      		        }          
		)

public class BGTestRunner {
	

}
