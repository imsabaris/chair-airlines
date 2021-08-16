package com.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void jvmReportGenerate(String jsonPath) {
		File f = new File("C:/Users/riyaz/eclipse-workspace/eclipse/ChairAirlines/src/test/resources/Reports/JVMReport");
		Configuration c = new Configuration(f, "Chair Airlines SignUp Page");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Selenium version", "Selenium 3.141.59");
		List li = new LinkedList<String>();
		li.add(jsonPath);
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
	}
}
