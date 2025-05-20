package com.tns.exceptionhandling;

public class BankMain {

	public static void main(String[] args) throws InvalidAmountException, InsufficientFundsException {

		BankAccount ba = new BankAccount(6210, 5000);
		
		try {
			//withdrawing money
			ba.withdraw(4100);
			
			//withdrawing money
			ba.withdraw(41e000);
			
			// depositing money
			ba.deposit(1500); 
			
			// depositing money
			ba.deposit(15000);
		}
		catch(InsufficientFundsException | InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Transaction Ended");
		}
		
	}

}
