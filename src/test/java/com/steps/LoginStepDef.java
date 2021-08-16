package com.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.pojo.LoginPojo;
import com.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseClass{
	LoginPojo loginPojo;
	@Given("user clicks customer login from Homepage")
	public void user_clicks_customer_login_from_Homepage() throws AWTException {
		loginPojo = new LoginPojo();
		btnClick(loginPojo.getCustomerSignin());
		Robot r = new Robot();
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_MINUS);
		}

	}

	@When("user enters the valid username")
	public void user_enters_the_valid_username() throws Exception {
	    typeInput(loginPojo.getLoginEmail(), readExcel(3, 0));
	}

	@When("user enters the valid password")
	public void user_enters_the_valid_password() throws Exception {
	    typeInput(loginPojo.getLoginPassword(), readExcel(3, 1));
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	   System.out.println("click LOgin");
	}

	@When("user enters invalid {string}")
	public void user_enters_invalid_username(String user) {
	    typeInput(loginPojo.getLoginEmail(), user);
	}


	@When("user enters invalid_pass{string}")
	public void user_enters_invalid_pass(String pass) {
		typeInput(loginPojo.getLoginPassword(), pass);
	}

	@When("user clicks the login")
	public void user_clicks_the_login() {
	    System.out.println("Invalid login");
	}

}
