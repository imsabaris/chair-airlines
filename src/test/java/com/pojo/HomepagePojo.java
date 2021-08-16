package com.pojo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class HomepagePojo extends BaseClass{
	public HomepagePojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='fa fa-times']")
	private WebElement closeSubscribe;
	
	
	@FindBy(xpath="//span[text()='English']")
	private WebElement language;
	
	@FindBy(xpath="//span[text()=' German']")
	private WebElement german;
		
	
	@FindBy(xpath="(//span[text()='English'])[1]")
	private WebElement languageSelect;
	
	@FindBy(xpath="//span[@id='type_OW']")
	private WebElement oneWay;
	
	@FindBy(xpath="//span[@id='type_RT']")
	private WebElement roundTrip;
	
	@FindBy(xpath="//span[text()='Book Flight']")
	private WebElement scrollDown;
	
	@FindBy(xpath="//input[@id='flightFrom']")
	private WebElement flightFrom;
	
	@FindBy(xpath="//input[@id='flightTo']")
	private WebElement flightTo;
	
	@FindBy(xpath="//input[@id='flightDepart']")
	private WebElement flightDepart;
	
	@FindBy(xpath="//input[@id='flightReturn']")
	private WebElement flightReturn;
	
	
	@FindBy(xpath="//a[@class='flightForm_datePrevMonth disabled']")
	private WebElement previousMonth;
	
	
	@FindBy(xpath="//a[@class='flightForm_dateNextMonth']")
	private WebElement nextMonth;
	
	@FindBy(xpath="(//a[@data-daynumber='13'])[1]")
	private WebElement selectDate;
	
	@FindBy(xpath="(//a[@data-daynumber='2'])[2]")
	private WebElement returnDate;
	
	
	@FindBy(xpath="//input[@id='flightForm_passengers']")
	private WebElement selectPassengers;
	
	@FindBy(xpath="(//a[@class='passPop_plus '])[1]")
	private WebElement addAdult;
	
	@FindBy(xpath="(//a[@class='passPop_minus'])[1]")
	private WebElement decAdult;
	
	@FindBy(xpath="(//a[@class='passPop_minus'])[2]")
	private WebElement decKids;
	
	@FindBy(xpath="(//a[@class='passPop_minus'])[3]")
	private WebElement decKidsLessTwo;
	
	@FindBy(xpath="(//a[@class='passPop_plus'])[1]")
	private WebElement addKids;
	
	@FindBy(xpath="(//a[@class='passPop_plus'])[2]")
	private WebElement addKidsLessTwo;
	
	@FindBy(xpath="(//input[@value='OK'])[41]")
	private WebElement okButton;
	
	
	@FindBy(xpath="//input[@value='SEARCH >']")
	private WebElement searchButton;

	@FindBy(xpath="//span[text()='I agree']")
	private WebElement policyAgree;
	
	public WebElement getCloseSubscribe() {
		return closeSubscribe;
	}
	public WebElement getLanguage() {
		return language;
	}

	public WebElement getGerman() {
		return german;
	}

	public WebElement getLanguageSelect() {
		return languageSelect;
	}

	public WebElement getOneWay() {
		return oneWay;
	}

	public WebElement getRoundTrip() {
		return roundTrip;
	}

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getFlightFrom() {
		return flightFrom;
	}

	public WebElement getFlightTo() {
		return flightTo;
	}

	public WebElement getFlightDepart() {
		return flightDepart;
	}

	public WebElement getFlightReturn() {
		return flightReturn;
	}

	public WebElement getPreviousMonth() {
		return previousMonth;
	}

	public WebElement getNextMonth() {
		return nextMonth;
	}

	public WebElement getSelectDate() {
		return selectDate;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public WebElement getSelectPassengers() {
		return selectPassengers;
	}

	public WebElement getAddAdult() {
		return addAdult;
	}

	public WebElement getDecAdult() {
		return decAdult;
	}

	public WebElement getDecKids() {
		return decKids;
	}

	public WebElement getDecKidsLessTwo() {
		return decKidsLessTwo;
	}

	public WebElement getAddKids() {
		return addKids;
	}

	public WebElement getAddKidsLessTwo() {
		return addKidsLessTwo;
	}

	public WebElement getOkButton() {
		return okButton;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getPolicyAgree() {
		return policyAgree;
	}
	
	
}
