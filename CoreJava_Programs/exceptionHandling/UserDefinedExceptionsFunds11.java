package com.evergent.corejava.exceptionHandling;
class InvalidScoreException extends Exception {
	public InvalidScoreException(String msg) {
		super(msg);
	}
}
public class UserDefinedExceptionsFunds11
{
	int pno=150;
	public void validScore(int score) throws InvalidScoreException{
		if(score >0 || score<100) {
			throw new InvalidScoreException("invalid score");
		}
		else {
			System.out.println("valid score");
		}
	}
	public static void main(String args[]) {
		try {
			UserDefinedExceptionsFunds11 ud=new UserDefinedExceptionsFunds11();
			ud.validScore(110);
		}
		catch(Exception e) {
			System.out.println("I can handle : "+e);
			System.out.println("caught InvalidScoreException: "+e.getMessage());
		}
		System.out.println("program continues after handling the exception.");
	}
}
