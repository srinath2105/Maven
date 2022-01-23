package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dresses {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//img [@title='Printed Dress']")
	private WebElement dress;
	
	@FindBy (xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]")
	private WebElement addtocart;
	
	@FindBy (xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
	private WebElement proceed;

	public Casual_Dresses(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	
	public WebElement getProceed() {
		return proceed;
	}

}
