package com.tns.threads;

public class MyRunnableMain {

	public static void main(String[] args) {
		
		Thread r1 = new Thread(new MyRunnable());
		r1.start();
		
	}
	
}
