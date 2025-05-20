package com.tns.inheritance;

public class SingleLevelMain {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 3;
		
		AdvCalc ac = new AdvCalc();
		
		System.out.println("Sum: " + ac.add(num1, num2));
		System.out.println("Difference: " + ac.sub(num1, num2));
		System.out.println("Multiplication: " + ac.mul(num1, num2));
		System.out.println("Division: " + ac.div(num1, num2));
		System.out.println("Power: " + ac.power(num1, num2));
		
		
	}

}
