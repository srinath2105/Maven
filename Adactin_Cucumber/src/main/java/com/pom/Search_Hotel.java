package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;

	@FindBy (id = "location")
	private WebElement location;
	
	@FindBy (id = "hotels")
	private WebElement hotels;
	
	@FindBy (id = "room_type")
	private WebElement room_Type;
	
	@FindBy (id = "room_nos")
	private WebElement room_Num;
	
	@FindBy (id = "datepick_in")
	private WebElement check_In;
	
	@FindBy (id = "datepick_out")
	private WebElement check_out;
	
	@FindBy (id = "adult_room")
	private WebElement adults_Room;

	@FindBy (id = "child_room")
	private WebElement child_Room;
	
	@FindBy (id = "Submit")
	private WebElement submit;
	

	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getRoom_Num() {
		return room_Num;
	}

	public WebElement getCheck_In() {
		return check_In;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdults_Room() {
		return adults_Room;
	}
	
	public WebElement getChild_Room() {
		return child_Room;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
