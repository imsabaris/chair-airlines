package com.steps;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.hc.client5.http.psl.PublicSuffixMatcherLoader;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.pojo.HomepagePojo;
import com.utilities.BaseClass;

public class StepDefinitionClass extends BaseClass {
	static HomepagePojo homePojo;
	public static void main(String[] args) throws AWTException, InterruptedException {
		browserLaunch();
		loadUrl("https://www.chair.ch/en");
		homePojo = new HomepagePojo();
		String languageType = homePojo.getLanguage().getText();
		System.out.println(languageType);
		/*if(!homePojo.getLanguage().equals("English")) {
		btnClick(homePojo.getGerman());
		btnClick(homePojo.getLanguageSelect());
		}*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", homePojo.getScrollDown());
		js.executeScript("arguments[0].click()",homePojo.getOneWay());
		js.executeScript("arguments[0].click()", homePojo.getFlightFrom());
		

		
		typeInput(homePojo.getFlightFrom(), "B");
		Robot r = new Robot();
		for (int i = 0; i < 1; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String locateFrom = homePojo.getFlightFrom().getAttribute("value");
		System.out.println("Locate :"+locateFrom);

		js.executeScript("arguments[0].click()",homePojo.getFlightTo());
		//js.executeScript("arguments[0].setAttribute('value','Zurich')",homePojo.getFlightTo());
		typeInput(homePojo.getFlightTo(), "Zurich");
		js.executeScript("arguments[0].click()",homePojo.getFlightDepart());
		
		WebElement moth = driver.findElement(By.xpath("//div[@id='dateFrameDepart']/div[1]/ul[2]"));
		System.out.println(moth.getText());
		
		/*List<WebElement> pickDate  = driver.findElements(By.xpath("//div[@id='dateFrameDepart']/div[1]/ul[2]"));
		int totalSize = pickDate.size();
		for (int i = 0; i <totalSize ; i++) {
			WebElement date = pickDate.get(i);
			String txt = date.getText();
			System.out.println(txt);
		*/
		
		
		//datePickJs("26-8-2021", pickDate);
		
		
		
		
		//btnClick(homePojo.getCloseSubscribe());
		//waitElementToLoacte("//div[@class='dateFrame']");
		/*js.executeScript("arguments[0].click()", homePojo.getSelectDate());
		//actionClick(homePojo.getSelectDate());

		//js.executeScript("arguments[0].click()", homePojo.getFlightReturn());
		//js.executeScript("arguments[0].click()", homePojo.getReturnDate());
		
		
		js.executeScript("arguments[0].click()", homePojo.getSelectPassengers());
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", homePojo.getAddAdult());
		//for (int i = 0; i < 2; i++) {
			//js.executeScript("arguments[0].click()",homePojo.getAddKids());
		//}
		js.executeScript("arguments[0].click()",homePojo.getAddKidsLessTwo());
		System.out.println("over");
*/


	}



	public static void datePickJs(String dateVal,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"')", element);

	}
}
