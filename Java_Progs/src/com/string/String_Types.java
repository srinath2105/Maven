package com.string;

public class String_Types {
	public static void main(String[] args) {
		
		StringBuilder a = new StringBuilder("Sri");
		StringBuilder b = new StringBuilder("Nath");
		
		int location_a = System.identityHashCode(a);
		System.out.println("Location of a is " +location_a);
		
		int location_b = System.identityHashCode(b);
		System.out.println("Location of b is "+ location_b);
		
		StringBuilder c = a.append(b);
		int location_c = System.identityHashCode(c);
		System.out.println("Location of c is "+ location_c);
		
	}
}
