package com.evergent.corejava.exceptionHandling;
//try followed by either catch block or finally block.
public class ExceptionDemo6 {
	String name="null";          
	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length());
			System.out.println("END");
		}
		finally {
			System.out.println("finally block for closing db connections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6 ed3=new ExceptionDemo6();
		ed3.myData();
	}
}
