package com.manager;

import org.openqa.selenium.WebDriver;

import com.POM.Address;
import com.POM.Casual_Dresses;
import com.POM.Confirm_Order;
import com.POM.Home_Page;
import com.POM.Payment;
import com.POM.Shipping;
import com.POM.Sign_In;
import com.POM.Sign_Up;
import com.POM.Summary;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Home_Page hp;
	private Casual_Dresses cd;
	private Summary sum;
	private Sign_In signin;
	private Sign_Up signup;
	private Address add;
	private Shipping ship;
	private Payment pay;
	private Confirm_Order confirm;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver= driver2;
	}
	
	public Home_Page getHp() {
		hp = new Home_Page(driver);
		return hp;
	}
	
	public Casual_Dresses getCd() {
		cd = new Casual_Dresses(driver);
		return cd;
	}
	
	public Summary getSum() {
		sum = new Summary(driver);
		return sum;
	}
	
	public Sign_In getSignin() {
		signin = new Sign_In(driver);
		return signin;
	}
	
	public Sign_Up getSignup() {
		signup = new Sign_Up(driver);
		return signup;
	}
	
	public Address getAdd() {
		add = new Address(driver);
		return add;
	}
	
	public Shipping getShip() {
		ship = new Shipping(driver);
		return ship;
	}
	
	public Payment getPay() {
		pay = new Payment(driver);
		return pay;
	}
	
	public Confirm_Order getConfirm() {
		confirm = new Confirm_Order(driver);
		return confirm;
	}
	
}
