package com.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_1 {

	@Test
	@Parameters ({ "name", "password" })
	private void employee(@Optional("Sri")String name, @Optional ("Test")String password) {
		
		System.out.println(name);
		System.out.println(password);
	}
}
