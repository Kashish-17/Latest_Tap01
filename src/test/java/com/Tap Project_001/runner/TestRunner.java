package com.Tap Project_001.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/com/Tap Project_001/features",
				 glue={"com/Tap Project_001/stepdefinitions","com/Tap Project_001/hook"},
				 publish=true,
				 plugin={"pretty","html:target/CucumberReports/CucumberReport.html"})
public class TestRunner {
	
	

}
