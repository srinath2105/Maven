package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//input [@class='cart_quantity_input form-control grey']")
	private WebElement qty;

	@FindBy (xpath = "//span [text () = 'Proceed to checkout']")
	private WebElement proceed;

	public Summary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	public WebElement getQty() {
		return qty;
	}

	
}
