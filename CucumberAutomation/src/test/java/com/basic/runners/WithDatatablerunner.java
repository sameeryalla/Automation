package com.basic.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         monochrome=true,
		         //dryRun=true,
		         features= {"src/test/resources/com/basic/DatatableFF/"},
                 glue= {"com.basic.DatatableSD"},   
		      		plugin= {"pretty",
		      				  "html:target/cucumber-htmlreport.html",
		      				  "json:target/cucumber-report.json"
		      				  
		      		        }          
		)

public class WithDatatablerunner {
	

}
