package com.overloading;

public class Over_Loading {

	private void example(String a, String b, String c) {
       System.out.println(a + "\n" + b +"\n" +c);
	}
	
	private void example(double a,float b) {
        
		System.out.println(a + "     "+ b+"      ");
	}

	private void example(float a, double b) {

		System.out.println(a+b+ "   " );
	}
	
	public static void main(String[] args) {
		
		Over_Loading obj = new Over_Loading();
		obj.example("Kishore", "Prabu", "Rahul");
//		obj.example(23, "Srinath", 'S');
//		obj.example(11, 30, "Answer");
		obj.example(2f,3.5);
	}
}
