package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition",
monochrome = true, 
dryRun = false, 
strict = true, 
tags = ("@module1, @module2, @module3, @module4"),
plugin = {"html:Report/Html_Report",
"pretty",
"json:Report/Jason_Report.json",
"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"}
)

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver = Base_Class.getBrowser(browser);
	}
	
	@AfterClass
	public static void tear_Down() {
		Base_Class.closeBrowser();
	}
}
