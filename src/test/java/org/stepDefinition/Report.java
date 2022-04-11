package org.stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	
	public static void generateReport(String  jsonpath) {
		
		
		File f= new File("C:\\Users\\zubee\\ClassWorkSpace\\Cucumber\\Allreports\\JVmreport");

		Configuration c= new Configuration(f, "facebok");
		
		
		List<String> l=  new ArrayList<String>();
		l.add(jsonpath);
	
		ReportBuilder r=new ReportBuilder(l,c);
		r.generateReports();
	}
	

}
