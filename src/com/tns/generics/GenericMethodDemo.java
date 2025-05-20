package com.tns.generics;

public class GenericMethodDemo {

	public static<T> void displayArray(T[] array) {
		
		//for(returnType varName : arrayName)
		
		for(T i : array) {
			System.out.println("Array Elements " + i);
		}
		
	}
	
}
