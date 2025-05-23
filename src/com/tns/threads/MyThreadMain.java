package com.tns.threads;

public class MyThreadMain {
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		
		t1.start();
		
		t1.setPriority(10);
		System.out.println(t1.getPriority());
	}

}
