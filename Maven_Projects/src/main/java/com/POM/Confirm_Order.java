package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order {
	public WebDriver driver;
	
	@FindBy (xpath = "//span [ contains (text() , 'I confirm')]")
	private WebElement confirm;

	public Confirm_Order(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirm() {
		return confirm;
	}
}
