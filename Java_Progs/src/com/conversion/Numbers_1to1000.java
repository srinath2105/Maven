package com.conversion;

public class Numbers_1to1000 {

	public static void main(String[] args) {
		
		char a = 'd';   //char a will be assigned with ascii value of d
		char b = 'd';	//char b will be assigned with ascii value of d
		int c = a/b;	//char c will be assigned with the value of ascii value of a/d
		String d = "aaaaaaaaaa";  //length of d = 10
		int e = a*d.length();  //value of a multiplied with length of d
		
		do {
			System.out.println(c);
			c++;
		} while (c<=e);
	}
}
