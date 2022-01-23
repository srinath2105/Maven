package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	private void setPropety() {
		System.out.println("setproperty");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("browser");
	}
	@BeforeClass
	private void url() {
		System.out.println("url");
	}
	@BeforeMethod
	private void signin() {
		System.out.println("signin");
	}
	@Ignore
	@Test 
	private void women() {
		System.out.println("woman");
	}
	@Test (enabled = false)
	private void dress() {
		System.out.println("dress");
	}
	@Test
	private void tshirt() {
		System.out.println("tshirt");
	}
	@Test
	private void men() {
		System.out.println("men");
	}
	@AfterMethod
	private void signout() {
		System.out.println("signout");
	}
	@AfterClass
	private void homepage() {
		System.out.println("homepage");
	}
	@AfterTest
	private void close() {
		System.out.println("close");
	}
	@AfterSuite
	private void deletecookies() {
		System.out.println("delete cookies");
	}
}
