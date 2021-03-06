package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.adactin.runner.Test_Runner;
import com.baseclass.Base_Class;
import com.pageobjectmanager.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static String username;
	public static String password;
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
	}
	
	@When("^user Enter \"([^\"]*)\" In Username Field$")
	public void user_Enter_In_Username_Field(String userName) throws Throwable {
		this.username = userName;
		sendKeyToElement(pom.getLp().getUsername(), username);
	}

	@When("^user Enter \"([^\"]*)\" In Password Field$")
	public void user_Enter_In_Password_Field(String Password) throws Throwable {
		this.password = Password;
		sendKeyToElement(pom.getLp().getPassword(), password);
	}
	
//	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" in username and password field$")
//	public void user_enters_and_in_username_and_password_field(String userName, String Password) throws Throwable {
//		this.username = userName;
//		sendKeyToElement(pom.getLp().getUsername(), username);
//		this.password = Password;
//		sendKeyToElement(pom.getLp().getPassword(), password);
//	}

	@Then("^user click Login Button$")
	public void user_click_Login_Button() throws Throwable {
		clickOnElement(pom.getLp().getLogin());
	}

	@When("^user Select Location From Location Dropdown$")
	public void user_Select_Location_From_Location_Dropdown() throws Throwable {
		dropDown("byvalue", pom.getSh().getLocation(), "Los Angeles");
	}

	@When("^user Select Name Of Hotel from Hotel Dropdown$")
	public void user_Select_Name_Of_Hotel_from_Hotel_Dropdown() throws Throwable {
		dropDown("byvalue", pom.getSh().getHotels(), "Hotel Sunshine");
	}

	@When("^user Select Room Type From Room Type Dropdown$")
	public void user_Select_Room_Type_From_Room_Type_Dropdown() throws Throwable {
		dropDown("byvalue", pom.getSh().getRoom_Type(), "Super Deluxe");
	}

	@When("^user Select Number Of Rooms From Number Of Rooms Dropdown$")
	public void user_Select_Number_Of_Rooms_From_Number_Of_Rooms_Dropdown() throws Throwable {
		dropDown("byvalue", pom.getSh().getRoom_Num(), "3");
	}

	@When("^user Enter Check In Date In Check In Date Field$")
	public void user_Enter_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		sendKeyToElement(pom.getSh().getCheck_In(), "10/12/2021");
	}

	@When("^user Enter Check Out Date In Check Out Date Field$")
	public void user_Enter_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		sendKeyToElement(pom.getSh().getCheck_out(), "15/12/2021");
	}

	@When("^user Select Number Of Adults Per Room From Adults Per Room Dropdown$")
	public void user_Select_Number_Of_Adults_Per_Room_From_Adults_Per_Room_Dropdown() throws Throwable {
		dropDown("byvalue", pom.getSh().getAdults_Room(), "2");
	}

	@When("^user Select Number Of Children Per Room From Children Per Room Dropdown$")
	public void user_Select_Number_Of_Children_Per_Room_From_Children_Per_Room_Dropdown() throws Throwable {
		dropDown("byvalue", pom.getSh().getChild_Room(), "1");
	}

	@Then("^user click Search Button$")
	public void user_click_Search_Button() throws Throwable {
		clickOnElement(pom.getSh().getSubmit());
	}

	@When("^user Select Hotel From List Of Hotels Radio Button$")
	public void user_Select_Hotel_From_List_Of_Hotels_Radio_Button() throws Throwable {
		clickOnElement(pom.getSelh().getRadio());
	}

	@Then("^user click Continue Button$")
	public void user_click_Continue_Button() throws Throwable {
		clickOnElement(pom.getSelh().getConfirm());
	}

	@When("^user Enter First Name In First Name Field$")
	public void user_Enter_First_Name_In_First_Name_Field() throws Throwable {
		sendKeyToElement(pom.getBah().getFname(), "Sri");
	}

	@When("^user Enter Last Name In Last Name Field$")
	public void user_Enter_Last_Name_In_Last_Name_Field() throws Throwable {
		sendKeyToElement(pom.getBah().getLname(), "Nath");
	}

	@When("^user Enter Address in Billing Address Field$")
	public void user_Enter_Address_in_Billing_Address_Field() throws Throwable {
		sendKeyToElement(pom.getBah().getAddress(), "#1, WallStreet, NY City, New York");
	}

	@When("^user Enter Credit Card Number in Credit Card Number Field$")
	public void user_Enter_Credit_Card_Number_in_Credit_Card_Number_Field() throws Throwable {
		sendKeyToElement( pom.getBah().getCard_Num(), "1234567891234567");
	}

	@When("^user Select Credit Card Type From Credit Card Type Dropdown$")
	public void user_Select_Credit_Card_Type_From_Credit_Card_Type_Dropdown() throws Throwable {
		dropDown("byvalue", pom.getBah().getCard_Type(), "VISA");
	}

	@When("^user Select Credit Cardt Expiration Month From Expiration Month Dropdown$")
	public void user_Select_Credit_Cardt_Expiration_Month_From_Expiration_Month_Dropdown() throws Throwable {
		dropDown("byvalue", pom.getBah().getExp_Month(), "1");
	}

	@When("^user Select Credit Card Expiration Year From Expiration Year Dropdown$")
	public void user_Select_Credit_Card_Expiration_Year_From_Expiration_Year_Dropdown() throws Throwable {
		dropDown("byvalue", pom.getBah().getExp_year(), "2022");
	}

	@When("^user Enter Credit Card CVV Number in CVV Field$")
	public void user_Enter_Credit_Card_CVV_Number_in_CVV_Field() throws Throwable {
		sendKeyToElement(pom.getBah().getCard_Cvv(), "999");
	}

	@Then("^user Click Book Now Button$")
	public void user_Click_Book_Now_Button() throws Throwable {
		clickOnElement(pom.getBah().getBook_Now());
	}

	@When("^user Click My Itinerary Button$")
	public void user_Click_My_Itinerary_Button() throws Throwable {
		implicitlyWait();
		clickOnElement(pom.getBc().getMy_Itinerary());
		takeScreenshot("Adactin_Cucumber");
	}

}
