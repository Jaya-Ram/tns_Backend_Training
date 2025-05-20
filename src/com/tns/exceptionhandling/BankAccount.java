package com.tns.exceptionhandling;

public class BankAccount {

	private static final double DEPOSIT_LIMIT = 50_000;
	private static final double WITHDRAW_LIMIT = 40_000;
	private double balance;
	private double amount;

	public BankAccount(int accountNumber, double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) throws InvalidAmountException{

		if(amount >0 && amount <DEPOSIT_LIMIT) {
			balance = balance + amount;
			System.out.println("Money Deposited: " +amount);
			checkBalance();
		}
		else {
			throw new InvalidAmountException("Enter a Valid Amount");
		}
		
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		
		if(amount >0 && amount <WITHDRAW_LIMIT) {
			balance = balance - amount;
			System.out.println("Money Withdrawn: " + amount);
			checkBalance();
		}
		else {
			throw new InsufficientFundsException("Insufficient Funds");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance is: " + balance);
	}
}
