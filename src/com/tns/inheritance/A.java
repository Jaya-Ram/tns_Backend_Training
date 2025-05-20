package com.tns.inheritance;

public interface A {
	void show(); 
}

interface B{
	void show();
}

class C implements A, B{
	@Override
	public void show() {
		System.out.println("In Show");
	}
}
