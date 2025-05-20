package com.tns.inheritance;

public class Calc {

	public int add(int x, int y) {
		return x + y;
	}
	
	public int sub(int x, int y) {
		return x - y;
	}
	
	public int mul(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
	
}
 
class AdvCalc extends Calc {
	public double power(int x, int y) {
		return Math.pow(x, y);
	}
}