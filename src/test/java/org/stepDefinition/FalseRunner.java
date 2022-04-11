package org.stepDefinition;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="@Rerun\\fail.txt",dryRun=false,
plugin= {"rerun:C:\\Users\\zubee\\ClassWorkSpace\\Cucumber\\Rerun\\fail.txt",
		
}
		 )

public class FalseRunner {

	
	
}
