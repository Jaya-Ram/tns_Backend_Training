package com.tns.inheritance;

public class MultiLevelMain {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 5;
		
		VeryAdvCalc vac = new VeryAdvCalc();
		
		System.out.println("Sum: " + vac.add(num1, num2));
		System.out.println("Difference: " + vac.sub(num1, num2));
		System.out.println("Multiplication: " + vac.mul(num1, num2));
		System.out.println("Division: " + vac.div(num1, num2));
		System.out.println("Power: " + vac.power(num1, num2));
		System.out.println("Square of num1: " + vac.square(num1));
		System.out.println("Square of num2: " + vac.square(num2));


	}

}
