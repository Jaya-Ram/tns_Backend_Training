package com.tns.inheritance;

public class HierarchialMain {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		
		b1.drive();
		b1.applyBreak();
		
		Car c1 = new Car();
		c1.drive();
		c1.applyBreak();
		
	}
	
}
