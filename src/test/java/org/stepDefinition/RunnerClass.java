package org.stepDefinition;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\zubee\\ClassWorkSpace\\Cucumber\\src\\test\\resources\\Files",dryRun=false,
plugin= {"rerun:C:\\Users\\zubee\\ClassWorkSpace\\Cucumber\\Rerun\\fail.txt",
		"json:C:\\Users\\zubee\\ClassWorkSpace\\Cucumber\\Allreports\\JsonReport\\a.json"
		
}
		 )
public class RunnerClass {
	
	
	@AfterClass
	public static void report() {
		Report.generateReport("C:\\Users\\zubee\\ClassWorkSpace\\Cucumber\\Allreports\\JsonReport\\a.json");

	}
	

}
