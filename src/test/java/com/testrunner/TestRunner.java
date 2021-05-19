package com.testrunner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Acer\\eclipse-workspace\\AdactinPage\\src\\test\\resources",glue="com.stepdefinition",
plugin= {"json:C:\\Users\\Acer\\eclipse-workspace\\AdactinPage\\src\\test\\resources\\report.json"},
tags= {"@smoke"},dryRun=false,monochrome=true)
public class TestRunner {
	
	@AfterClass
	public static void report() {
		Reporting.generateReport("C:\\Users\\Acer\\eclipse-workspace\\AdactinPage\\src\\test\\resources\\report.json");
	}
	
	

}

