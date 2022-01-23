package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In {
	public WebDriver driver;
	
	@FindBy (id = "email_create")
	private WebElement email;
	
	@FindBy (id = "SubmitCreate")
	private WebElement createacc;
	
	@FindBy (xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li")
	private WebElement error;

	@FindBy (id = "email")
	private WebElement signinemail;
	
	@FindBy (id = "passwd")
	private WebElement signinpass;
	
	@FindBy (id = "SubmitLogin")
	private WebElement signin;

	public Sign_In(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCreateacc() {
		return createacc;
	}
	
	public WebElement getError() {
		return error;
	}

	public WebElement getSigninemail() {
		return signinemail;
	}

	public WebElement getSigninpass() {
		return signinpass;
	}

	public WebElement getSignin() {
		return signin;
	}

}
