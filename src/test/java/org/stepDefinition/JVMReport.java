package org.stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	private void reportGeneration(String jsonpath) {
	//1. Mention the file location 
	File f= new File( System.getProperty("user.dir")+"\\Allreports\\JVMReport");
	
	//File f= new File("C:\\Users\\zubee\\ClassWorkSpace\\Cucumber\\Allreports\\JVMReport");

	//2) additional details	
		Configuration c=new Configuration(f, "Facebook");
		
		c.addClassifications("OS", "Windows 10");
		c.addClassifications("JDK Vesrion", "1.8");
	//3 add json path
		
		List<String> l= new ArrayList<String>();
		l.add(jsonpath);
		
		
		ReportBuilder  r= new  ReportBuilder(l, c);
		
		
	}
	
	
	
	
	
}
