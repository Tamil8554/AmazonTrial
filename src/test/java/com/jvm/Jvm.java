package com.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvm {
	
	public static void generateJvm( String jsonFile) {
		File f= new File("C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\JVMReport");
		
		Configuration c= new Configuration(f, "AmazonTrial");
		
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Platform Version", "7");
		c.addClassifications("BrowserName", "Chrome");
		c.addClassifications("Browser Version", "108");
		
		List<String> li= new ArrayList<String>();
		
		li.add(jsonFile);
		
		ReportBuilder r = new ReportBuilder(li, c);
		
		r.generateReports();
		

	}

}
