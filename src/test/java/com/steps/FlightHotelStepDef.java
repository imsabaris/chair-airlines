package com.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import com.pojo.FlightHotelPojo;
import com.utilities.BaseClass;

public class FlightHotelStepDef extends BaseClass {
	//FlightHotelPojo flightPojo;
	public static void main(String[] args) throws AWTException {
		
		browserLaunch();
		loadUrl("https://www.chair.ch/en");
		FlightHotelPojo flightPojo = new FlightHotelPojo();
		//btnClick(flightPojo.getCustomerSignin());
		pageDownSCrollJs(flightPojo.getScrollDownElement());
		clickJs(flightPojo.getFlightHotelPage());
		
		String parId = driver.getWindowHandle();
		System.out.println(parId);
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		for (String eachId: allId) {
			if(!parId.equals(allId)) {
				driver.switchTo().window(eachId);
			}
		}
		btnClick(flightPojo.getDepartureAirport());
		
		inputTypeJs(flightPojo.getDepartureAirport(), "Hamburg");
		Robot r = new Robot();
		/*for (int i = 0; i < 1; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
*/		r.keyPress(KeyEvent.VK_ENTER);
		inputTypeJs(flightPojo.getDepartureAirport(), "f");
		/*for (int i = 0; i < 1; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}*/
		r.keyPress(KeyEvent.VK_ENTER);
		btnClick(flightPojo.getArrivalPlace());
		inputTypeJs(flightPojo.getArrivalPlace(), "h");
	
	}

}
