package com.for_loop;

public class Incre_Decre {

public static void main(String[] args) {
		
		System.out.println("Output for ForLoop1 using increment\n=======================\ni   j\n-----");
		
		for (int i = 0; i < 2; i++) {//outer loop = i++ post increment
			
			for (int j = 0; j < 2; ++j) {//inner loop = ++j pre increment
				
				System.out.println(i +"   "+ j);
				
			}
			
		}
		
		System.out.println("\nOutput for ForLoop2 using decrement\n=======================\ni   j\n-----");
		for (int i = 2; i > 0; i--) {//outer loop = i-- post decrement
			for (int j = 2; j > 0; --j) {//Inner loop = --j pre decrement
				
				System.out.println(i +"   "+ j);
				
			} 
		}
		
	}
}
