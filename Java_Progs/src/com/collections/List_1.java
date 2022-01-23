package com.collections;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
	
	public static void main(String[] args) {
		
		List<Object> ls = new ArrayList<Object>();
		
		ls.add(1234);// to add values inside the variable
		ls.add("sri");
		ls.add("sri"); //list accepts duplicate values
		ls.add(123.45);
		ls.add('N');
		System.out.println("Values inside ls are = " +ls);
		
		int s = ls.size(); //size() is used to get the length of variable ls
		System.out.println("Size of ls is = " +s);
		
		Object g = ls.get(3); //used to get a value of an index by giving index number
		System.out.println("Value inside given index number is = " +g);
		
		ls.set(2, "nath"); //used to replace an index value with new value that is given
		System.out.println("Value of ls after modification in index = " +ls);
		
		ls.remove(3); //used top remove an index by giving its index number
		System.out.println("Value of ls after removing an index is = " +ls);
		
		int inof = ls.indexOf(1234); //used to fetch the index number of given value, it is opposite of get
		System.out.println("The index number of given value is = " +inof);
		
		boolean contains = ls.contains('N'); //to check if a value is present in the variable ls
		System.out.println("value after contains = " +contains);
		
//		ls.clear(); //it clears all values inside given variable - ls
//		System.out.println("Value of ls after clear() =" +ls);
		
		List<Object> ls1 = new ArrayList<Object>();
		ls1.add(1234);
		ls1.add(123.45);
		ls1.add('s');
		
		ls.retainAll(ls1); //used to get the common values between arraylist ls and ls1
		System.out.println("Common values between ls and ls1 are = " +ls);
		
		ls.addAll(ls1);// used to add all values of ls, ls1 and assign it to ls
		System.out.println("The addition of ls and ls1 = " +ls);
		
		ls.removeAll(ls1);//used to remove all the values of ls and ls1 and assign it to ls
		System.out.println("Value after giving removeall() = " +ls);
		
	}

}
