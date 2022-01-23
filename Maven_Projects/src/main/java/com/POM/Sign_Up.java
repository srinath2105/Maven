package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Up {
	public WebDriver driver;
	
	@FindBy (xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div/span")
	private WebElement gender;
	
	@FindBy (id = "customer_firstname")
	private WebElement fname;

	@FindBy (id = "customer_lastname")
	private WebElement lname;
	
	@FindBy (id = "passwd")
	private WebElement pass;
	
	@FindBy (id = "days")
	private WebElement day;
	
	@FindBy (id = "months")
	private WebElement month;
	
	@FindBy (id = "years")
	private WebElement year;
	
	@FindBy (id = "firstname")
	private WebElement firstname;
	
	@FindBy (id = "lastname")
	private WebElement lastname;
	
	@FindBy (id = "address1")
	private WebElement address;
	
	@FindBy (name = "city")
	private WebElement city;
	
	@FindBy (id = "id_state")
	private WebElement state;
	
	@FindBy (id = "postcode")
	private WebElement postcode;
	
	@FindBy (id = "phone_mobile")
	private WebElement mob;
	
	@FindBy (xpath = "//span [text() = 'Register' ]")
	private WebElement register;
	
	
	public Sign_Up(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getMob() {
		return mob;
	}

	public WebElement getRegister() {
		return register;
	}

	
}
