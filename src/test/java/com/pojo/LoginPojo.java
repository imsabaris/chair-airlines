package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[text()='Customer Login'])[1]")
	private WebElement customerSignin;
	
	
	@FindBy(xpath="//input[@name='userPop01Email']")
	private WebElement loginEmail;
	
	@FindBy(xpath="//input[@name='userPop01Password']")
	private WebElement loginPassword;
	
	@FindBy(xpath="//input[@name='customerLogin']")
	private WebElement loginButtton;

	public WebElement getCustomerSignin() {
		return customerSignin;
	}
	public WebElement getLoginEmail() {
		return loginEmail;
	}

	public WebElement getLoginPassword() {
		return loginPassword;
	}

	public WebElement getLoginButtton() {
		return loginButtton;
	}
}
