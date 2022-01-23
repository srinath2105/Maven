package com.fullabstraction_interface;

public class Inter_Class implements Inter_Parent1,Inter_Parent2 {

	@Override
	public void patient3() {

		System.out.println("Patient3 has Corona");
	}

	@Override
	public void patient4() {

		System.out.println("patient4 has Cancer");
	}

	@Override
	public void patient1() {

		System.out.println("Patient1 has Swine flu");
	}

	@Override
	public void patient2() {

		System.out.println("Patient2 has Thyroid");
	}

	public static void main(String[] args) {
		
		Inter_Class obj = new Inter_Class();
		obj.patient1();
		obj.patient2();
		obj.patient3();
		obj.patient4();
	}
}
