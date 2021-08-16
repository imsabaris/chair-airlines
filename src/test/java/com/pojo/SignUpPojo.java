package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class SignUpPojo extends BaseClass{
	public SignUpPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[text()='Customer Login'])[1]")
	private WebElement customerSignin;
	
	@FindBy(xpath="(//a[text()='Sign up'])[1]")
	private WebElement signUpButton;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyName;
	
	@FindBy(xpath="//input[@name='address']")
	private WebElement streetName;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement cityName;
	
	@FindBy(xpath="//select[@id='countrySelect']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='zip code']")
	private WebElement zipCode;
	
	@FindBy(xpath="//a[@aria-controls='passengersDetails_extPop_100']")
	private WebElement phoneCode;
	
	@FindBy(xpath="//strong[text()='Argentina']")
	private WebElement argentina;
	
	@FindBy(xpath="//input[@class='inputBD inputVal']")
	private WebElement phoneNo;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='repassword']")
	private WebElement rePassword;

	public WebElement getCustomerSignin() {
		return customerSignin;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getStreetName() {
		return streetName;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getPhoneCode() {
		return phoneCode;
	}

	public WebElement getArgentina() {
		return argentina;
	}
	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRePassword() {
		return rePassword;
	}
	
	
}
