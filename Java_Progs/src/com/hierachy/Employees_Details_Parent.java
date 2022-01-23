package com.hierachy;

public class Employees_Details_Parent {
	
	public void suresh() {
     
		int ctc= 700008, basic= 280008, HRA= 140004, PF= 33600, Gratuity= 13440;
		int deductions= HRA+ PF+ Gratuity;
		int Annualgross= ctc - deductions;
		System.out.println("Employee name = Suresh");
		System.out.println("Basic Salary = " +basic);
		System.out.println("HRA = " +HRA);
		System.out.println("Provident Fund = " +PF);
		System.out.println("Gratuity = " +Gratuity);
		System.out.println("Annual Gross Salary = " +Annualgross);
		System.out.println("Total CTC = " +ctc);
	}

	public void kishore() {
        int CTC= 800000, bsal= 408000, tra= 163200, med= 10000, pf= 48960;
        int ded= med+ pf;
        int gross= CTC- ded;
        int mgross= gross/12;
        System.out.println("Employee name = Kishore");
		System.out.println("Basic Salary = " +bsal);
		System.out.println("Travel Allowance = " +tra);
		System.out.println("Provident Fund = " +pf);
		System.out.println("Medical Insurance = " +med);
		System.out.println("Annual Gross Salary = " +gross);
		System.out.println(("Monthly gross salary = " +mgross));
		System.out.println("Total CTC = " +CTC);
	}
}
