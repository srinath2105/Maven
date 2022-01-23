package com.abstraction;

public class Child2 extends Parent2 {

	@Override
	public void username() {
		System.out.println("Username is Srinathg");
	}

	@Override
	public void password() {
		
		System.out.println("Password is Test@123");
		
	}
	
	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		obj.username();
		obj.password();
	}

}
