package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class FlightHotelPojo extends BaseClass {
	public FlightHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='Customer Login'])[1]")
	private WebElement customerSignin;
	
	
	@FindBy(xpath="//a[@id='engineTab_flight']")
	private WebElement scrollDownElement;
	
	@FindBy(xpath="//a[@id='engineTab_flightAndHotel']")
	private WebElement flightHotelPage;

	@FindBy(xpath="(//div[@class='Select Select--multi is-searchable'])[1]")
	private WebElement departureAirport;
	
	@FindBy(xpath="(//div[@class='Select Select--multi is-searchable'])[2]")
	private WebElement arrivalPlace;
	
	@FindBy(xpath="//div[@class='b-input travel-period-input']")
	private WebElement selectDates;
	
	@FindBy(xpath="//span[text()='Exact dates']")
	private WebElement exactDate;
	
	@FindBy(xpath="//span[text()='Flexible dates']")
	private WebElement flexDate;
	
	@FindBy(xpath="(//span[@aria-label='Previous Month'])[1]")
	private WebElement previousMonth;

	@FindBy(xpath="(//span[@aria-label='Next Month'])[1]")
	private WebElement nextMonth;
	
	@FindBy(xpath="(//span[@class='Select-arrow'])[3]")
	private WebElement personTotal;
	
	@FindBy(xpath="//div[text()='More options...']")
	private WebElement moreOptions;
	
	@FindBy(xpath="(//button[@class='undefined travellers--roomBtn counterControl--btn counterControl--btn-more btn btn-default'])[1]")
	private WebElement roomAdd;
	
	@FindBy(xpath="(//button[@class='undefined travellers--roomBtn counterControl--btn btn btn-default'])[1]")
	private WebElement roomLess;
	
	@FindBy(xpath="(//button[@class='undefined travellers--roomBtn counterControl--btn btn btn-default'])[2]")
	private WebElement adultsLess;
	
	@FindBy(xpath="(//button[@class='undefined travellers--roomBtn counterControl--btn btn btn-default'])[3]")
	private WebElement kidsLess;
	
	@FindBy(xpath="(//button[@class='undefined travellers--roomBtn counterControl--btn counterControl--btn-more btn btn-default'])[2]")
	private WebElement adultsAdd;
	
	@FindBy(xpath="(//button[@class='undefined travellers--roomBtn counterControl--btn counterControl--btn-more btn btn-default'])[3]")
	private WebElement kidsAdd;

	@FindBy(xpath="//a[@class='flyout--submit btn btn-primary']")
	private WebElement selectPersons;
	
	@FindBy(xpath="//button[@class='flyout--close icon-close']")
	private WebElement closeOptions;
	
	@FindBy(xpath="//a[@class='btn-search btn btn-primary']")
	private WebElement searchFlightAndHotel;

	public WebElement getCustomerSignin() {
		return customerSignin;
	}

	public WebElement getScrollDownElement() {
		return scrollDownElement;
	}

	public WebElement getFlightHotelPage() {
		return flightHotelPage;
	}

	public WebElement getDepartureAirport() {
		return departureAirport;
	}

	public WebElement getArrivalPlace() {
		return arrivalPlace;
	}

	public WebElement getSelectDates() {
		return selectDates;
	}

	public WebElement getExactDate() {
		return exactDate;
	}

	public WebElement getFlexDate() {
		return flexDate;
	}

	public WebElement getPreviousMonth() {
		return previousMonth;
	}

	public WebElement getNextMonth() {
		return nextMonth;
	}

	public WebElement getPersonTotal() {
		return personTotal;
	}

	public WebElement getMoreOptions() {
		return moreOptions;
	}

	public WebElement getRoomAdd() {
		return roomAdd;
	}

	public WebElement getRoomLess() {
		return roomLess;
	}

	public WebElement getAdultsLess() {
		return adultsLess;
	}

	public WebElement getKidsLess() {
		return kidsLess;
	}

	public WebElement getAdultsAdd() {
		return adultsAdd;
	}

	public WebElement getKidsAdd() {
		return kidsAdd;
	}

	public WebElement getSelectPersons() {
		return selectPersons;
	}

	public WebElement getCloseOptions() {
		return closeOptions;
	}

	public WebElement getSearchFlightAndHotel() {
		return searchFlightAndHotel;
	}


	

	
}
