package com.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilities.BaseClass;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	@Before
	public static void launch() {
		browserLaunch();
		loadUrl("https://www.chair.ch/en");
	}
	@After
	public static void close(Scenario s) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshot, "image/png");
		pageQuit();
	}

}
