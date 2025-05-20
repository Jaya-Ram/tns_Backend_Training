package com.tns.encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		// setting values
		p1.setAge(-2);
		p1.setName("JayaRam Bellamkonda");
		p1.setpersonId(6210);
		
		//getting Values
		System.out.println("p1 Age: " + p1.getAge());
		System.out.println("p1 Name: " + p1.getName());
		System.out.println("p1 Person Id: " + p1.getPersonId());
		
		Person p2 = new Person();
		// setting values
		p2.setAge(20);
		p2.setName("Jaya");
		p2.setpersonId(6211);
		
		//getting Values
		System.out.println("p2 Age: " + p2.getAge());
		System.out.println("p2 Name: " + p2.getName());
		System.out.println("p2 Person Id: " + p2.getPersonId());
	}
	
}
