package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	public static WebDriver driver;
	
	@FindBy (id = "first_name")
	private WebElement fname;
	
	@FindBy (id = "last_name")
	private WebElement lname;
	
	@FindBy (id = "address")
	private WebElement address;
	
	@FindBy (id = "cc_num")
	private WebElement card_Num;
	
	@FindBy (id = "cc_type")
	private WebElement card_Type;
	
	@FindBy (id = "cc_exp_month")
	private WebElement exp_Month;
	
	@FindBy (id = "cc_exp_year")
	private WebElement exp_year;
	
	@FindBy (id = "cc_cvv")
	private WebElement card_Cvv;
	
	@FindBy (id = "book_now")
	private WebElement book_Now;
	
	public Book_A_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard_Num() {
		return card_Num;
	}

	public WebElement getCard_Type() {
		return card_Type;
	}

	public WebElement getExp_Month() {
		return exp_Month;
	}

	public WebElement getExp_year() {
		return exp_year;
	}

	public WebElement getCard_Cvv() {
		return card_Cvv;
	}

	public WebElement getBook_Now() {
		return book_Now;
	}

}
