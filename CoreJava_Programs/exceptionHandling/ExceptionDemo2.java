package com.evergent.corejava.exceptionHandling;
//1. All exceptions are executed while abnormal conditions only.
//2. Normal flow it wont execute any exceptions.
//3. java.lang.throwable is super class for exception and errors.

public class ExceptionDemo2 {
	String name="null"; //normal flow it wont execute any exception.
	//String name=null;
	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length()); //for line no.8 it is abnormal condition.
			                              //( All exceptions are executed while abnormal conditions only.)
			System.out.println("END");
		}
		catch(NullPointerException e) {
			System.out.println("I can handel : "+e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo2 ed2=new ExceptionDemo2();
		ed2.myData();
	}
}
