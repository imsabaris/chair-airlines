package com.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;

import com.pojo.SignUpPojo;
import com.utilities.BaseClass;

import io.cucumber.java.en.*;

public class SignUpStepDef extends BaseClass {
	SignUpPojo signPojo;

	@Given("User need to be in home_page")
	public void user_need_to_be_in_home_page() {
		//browserLaunch();
		//loadUrl("https://www.chair.ch/en");
	}

	@Given("user clicks the customer login")
	public void user_clicks_the_customer_login() throws AWTException {
		signPojo = new SignUpPojo();
		btnClick(signPojo.getCustomerSignin());
		Robot r = new Robot();
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_MINUS);
		}
	}

	@Given("user clicks signup from customer login")
	public void user_clicks_signup_from_customer_login() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", signPojo.getSignUpButton());
		js.executeScript("arguments[0].click()", signPojo.getSignUpButton());
	}

	@When("user enters the first name")
	public void user_enters_the_first_name() {
		typeInput(signPojo.getFirstName(), "Raghu");
		//btnClick(signPojo.getPhoneCode());
		//actionClick(signPojo.getPhoneCode());
		//btnClick(signPojo.getArgentina());
	}

	@When("user enters the last name")
	public void user_enters_the_last_name() {
		typeInput(signPojo.getLastName(), "Vara");
	}

	@When("user enters the company name")
	public void user_enters_the_company_name() {
		typeInput(signPojo.getCompanyName(), "sapphire");
	}

	@When("user enters the street name")
	public void user_enters_the_street_name() {
		typeInput(signPojo.getStreetName(), "No.12/47E");
	}

	@When("user enters the city name")
	public void user_enters_the_city_name() {
		typeInput(signPojo.getCityName(), "Argentine");
	}

	@When("user selects the country")
	public void user_selects_the_country() {
		btnClick(signPojo.getCountry());
		selectByText(signPojo.getCountry(), "Argentina");
		
	}

	@When("user enters the zip code")
	public void user_enters_the_zip_code() {
		typeInput(signPojo.getZipCode(), "992341");
	}

	@When("user enters the phone number")
	public void user_enters_the_phone_number() {
		typeInput(signPojo.getPhoneNo(), "9900234567");
		
	}

	@When("user enters the email")
	public void user_enters_the_email() {
		typeInput(signPojo.getEmail(), "raghuvara@gmail.com");
	}

	@When("user enters the password")
	public void user_enters_the_password() {
		typeInput(signPojo.getPassword(), "raghuvara123");
	}

	@When("user re_enters the password")
	public void user_re_enters_the_password() {
		typeInput(signPojo.getRePassword(), "raghuvara123");
	}

	@When("user clicks the signup button")
	public void user_clicks_the_signup_button() {
		System.out.println("Sign_Up succesful");
	}


	
	
	
	

}
