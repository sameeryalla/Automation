package com.basic.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         monochrome=true,
		         //dryRun=true,
		        		 
		         features= {"src/test/resources/com/basic/HooksFFPKG/"}
                 ,glue= {"com.basic.HooksSDPKG"}
		      		,plugin= {"pretty","html:target/cucumber-htmlreport.html","json:target/cucumber-report.json"
		      				//"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"} 
		                    //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/report.html"
		      				}
		         ,tags= "@sanity or @Sameer"
		         
		)

public class Hooksrunner {
	

}