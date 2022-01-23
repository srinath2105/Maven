package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	public WebDriver driver;
	
	@FindBy (id = "cgv")
	private WebElement agree;
	
	@FindBy (xpath =  "(//span [contains (text() , 'Proceed ')]) [2]")
	private WebElement proceed;

	public Shipping(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getProceed() {
		return proceed;
	}
	

}
