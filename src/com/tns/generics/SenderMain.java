package com.tns.generics;

public class SenderMain {

	public static void main(String[] args) {

		Sender<String> ob = new Sender<String> ();
		ob.setMessage("Welcome to Generics");
		System.out.println(ob.getMessage());
		
		Sender<Integer> ob1 = new Sender<Integer> ();
		ob1.setMessage(56);
		System.out.println(ob1.getMessage());
		
	}

}
