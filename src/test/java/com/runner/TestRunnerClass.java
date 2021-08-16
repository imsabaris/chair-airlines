package com.runner;

import org.apache.commons.lang.math.JVMRandom;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.jvm.JvmReport;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",glue="com.steps",dryRun=false,monochrome=true,strict=true,
plugin= {"pretty",
		"html:C:/Users/riyaz/eclipse-workspace/eclipse/ChairAirlines/src/test/resources/Reports/HTMLReport",
		"json:C:/Users/riyaz/eclipse-workspace/eclipse/ChairAirlines/src/test/resources/Reports/JSONReport/jsonreports.json",
		"junit:C:/Users/riyaz/eclipse-workspace/eclipse/ChairAirlines/src/test/resources/Reports/JunitReport/junitreports.xml",
		"rerun:C:/Users/riyaz/eclipse-workspace/eclipse/ChairAirlines/src/test/resources/FailedScenario/failed.txt"
		})

public class TestRunnerClass {
	@AfterClass
	public static void jvm() {
		JvmReport.jvmReportGenerate("C:/Users/riyaz/eclipse-workspace/eclipse/ChairAirlines/src/test/resources/Reports/JSONReport/jsonreports.json");
	}

}
