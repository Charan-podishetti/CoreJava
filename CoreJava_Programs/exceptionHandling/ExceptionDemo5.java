package com.evergent.corejava.exceptionHandling;
//finally is a block, if exceptions is occurs or not finally block will be executed.
public class ExceptionDemo5 {
	String name="null"; 
	int k=0;          
	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
			System.out.println("END");
		}
		catch(NullPointerException e) {
			System.out.println("I can handel : "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handel : "+e);
		}
		catch(Exception e) {
			System.out.println("I can handle : "+e);
		}
		finally {
			System.out.println("finally block for closing db connections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 ed3=new ExceptionDemo5();
		ed3.myData();
	}
}
