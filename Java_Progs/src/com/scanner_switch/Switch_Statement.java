package com.scanner_switch;

import java.util.Scanner;

public class Switch_Statement {


	public static void main(String[] args) {
		
		System.out.println("Please enter a Iphone 13 variant name to check its price");
		Scanner obj = new Scanner(System.in);
		String a = obj.nextLine();
				
		switch (a) {
		case "iphone 13 pro":
			
			System.out.println("Please enter a storage variant: 128GB or 256GB");
			String b = obj.next();
			
			switch (b) {
			case "128GB":
				System.out.println("Price of Iphone 13 Pro, 128GB variant is = Rs.1,19,900");
				break;
			case "256GB":
				System.out.println("Price of Iphone 13 Pro, 256GB variant is = Rs.1,29,900");
				break;
			default:
				System.out.println("Entered Storage variant is not available");
				break;
			}
			break;
			
		case "iphone 13 pro max":
				
			System.out.println("Please enter a storage variant: 128GB or 256GB");
			String c = obj.next();
				
			switch (c) {
			case "128GB":
				System.out.println("Price of Iphone 13 Pro Max, 128GB variant is = Rs.1,29,900");
				break;
			case "256GB":
				System.out.println("Price of Iphone 13 Pro Max, 256GB variant is = Rs.1,39,900");
				break;
			default:
				System.out.println("Entered Storage variant is not available");
				break;
			}
			break;
				
		case "iphone 13":
					
			System.out.println("Please enter a storage variant: 128GB or 256GB");
			String d = obj.next();
					
			switch (d) {
			case "128GB":
				System.out.println("Price of Iphone 13, 128GB variant is = Rs.79,900");
				break;
			case "256GB":
				System.out.println("Price of Iphone 13, 256GB variant is = Rs.89,900");
				break;
			default:
				System.out.println("Entered Storage variant is not available");
				break;
			}
			break;
				
		case "iphone 13 mini":
						
			System.out.println("Please enter a storage variant: 128GB or 256GB");
			String e = obj.next();
						
			switch (e) {
			case "128GB":
				System.out.println("Price of Iphone 13 Mini, 128GB variant is = Rs.69,900");
				break;
			case "256GB":
				System.out.println("Price of Iphone 13 Mini, 256GB variant is = Rs.79,IPHONE 13 M900");
				break;
			default:
				System.out.println("Entered Storage variant is not available");
				break;
			}
			break;	
			
		default:
			System.out.println("Entered Iphone 13 variant name is invalid");
			break;
		}
	}

}
