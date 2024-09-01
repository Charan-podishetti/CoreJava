package com.evergent.corejava.exceptionHandling;
class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String msg) {
		super(msg);
	}
}
public class UserDefinedExceptionsFunds12
{
	int pno=150;
	public void withdraw(double amount) throws InsufficientFundsException{
		double balance=500.00;
		if(amount>balance) {
			throw new InsufficientFundsException("insufficient balance : ");
		}
		else {
			System.out.println("withdraw successful");
		}
	}
	public static void main(String args[]) {
		try {
			UserDefinedExceptionsFunds12 ud=new UserDefinedExceptionsFunds12();
			ud.withdraw(600.00);
		}
		catch(Exception e) {
			System.out.println("I can handle : "+e);
			System.out.println("caught InsufficientFundsException: "+e.getMessage());
		}
		System.out.println("program continues after handling the exception.");
	}
}
