package com.tns.exceptionhandling;

public class InsufficientFundsException extends Exception{

	public InsufficientFundsException(String msg) {
		super(msg);
	}
	
}

class InvalidAmountException extends Exception{

	public InvalidAmountException(String msg) {
		super(msg);
	}
	
}