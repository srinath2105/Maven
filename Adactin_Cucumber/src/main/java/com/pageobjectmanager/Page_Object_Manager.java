package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.Book_A_Hotel;
import com.pom.Booking_Confirmation;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Manager {
	public static WebDriver driver;
	
	private Login_Page lp;
	private Search_Hotel sh;
	private Select_Hotel selh;
	private Book_A_Hotel bah;
	private Booking_Confirmation bc;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_Page getLp() {
		lp= new Login_Page(driver);
		return lp;
	}

	public Search_Hotel getSh() {
		sh = new Search_Hotel(driver);
		return sh;
	}
	
	public Select_Hotel getSelh() {
		selh = new Select_Hotel(driver);
		return selh;
	}
	
	public Book_A_Hotel getBah() {
		bah = new Book_A_Hotel(driver);
		return bah;
	}
	
	public Booking_Confirmation getBc() {
		bc = new Booking_Confirmation(driver);
		return bc;
	}


}
