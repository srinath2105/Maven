package com.array;

public class Array_Addition {
	
	public static void main(String[] args) {
		
		int a[] = new int [5];
		a[0] =25;
		a[1] =30;
		a[2] =40;
		a[3] =45;
		a[4] =50;
		
		int b[] = new int [5];
		b[0] =10;
		b[1] =20;
		b[2] =30;
		b[3] =40;
		b[4] =50; 
		
		int c[] = new int [5];
		
		for (int i = 0; i < a.length; i++) {
			
				c[i] =a[i]+b[i];
				System.out.println("Sum of array a + array b is C[" +i +"] = " + c[i]);
				
		}
	}

}
