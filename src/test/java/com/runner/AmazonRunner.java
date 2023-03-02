package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.jvm.Jvm;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\src\\test\\resources\\Feature\\AmazonTrial1.feature",
glue= "com.step", dryRun = false, plugin = "json:JsonReport\\report.json")

public class AmazonRunner {
	
	@AfterClass
	
	public static void generateJvmReport() {
	     Jvm.generateJvm("C:\\Users\\yuvaraj\\eclipse-workspace\\AmazonTrial\\JsonReport\\report.json");

	}

}
 