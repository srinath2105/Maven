package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_1 {
	
public static void main(String[] args) {
		
		Set<Object> se = new LinkedHashSet<Object>();
		
		se.add(54321);// to add values inside the variable
		se.add("Java");
		se.add(543.21);
		se.add("Java"); // set doesnt allow duplicate values
		System.out.println("Values inside se are = " +se);
		
		int size = se.size(); //size()
		System.out.println(size);
		
		se.remove(1); //remove()
		System.out.println(se);
		
		boolean contains = se.contains("Java"); //contains()
		System.out.println(contains);
		
//		se.clear(); //clear()
//		System.out.println(se);
		
		Set<Object> se1 = new LinkedHashSet<Object>();
		se1.add("Selenium");
		se1.add("Maven");
		se1.add("Java");
		
//		se.addAll(se1);
//		System.out.println(se);
		
		se.retainAll(se1);
		System.out.println(se);
		
		se.removeAll(se1);
		System.out.println(se);
					
		//get(), set() and indexof() doesnt work in Set
		
	}

}
