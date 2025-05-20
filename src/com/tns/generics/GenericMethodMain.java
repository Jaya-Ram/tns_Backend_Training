package com.tns.generics;

public class GenericMethodMain {

	public static void main(String[] args) {
		
		
		Integer[] intArray = {1, 2, 3};
		String[] stringArray = {"Allen", "Dolly", "Candy"};
		
		// calling the static method
		
		GenericMethodDemo.displayArray(intArray);
		GenericMethodDemo.displayArray(stringArray);
	}
	
}