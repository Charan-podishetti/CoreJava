package com.evergent.corejava.exceptionHandling;
//
public class ExceptionDemo7 {
	String name="null";          
	public void myData() throws Exception{
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
		try {
			ExceptionDemo7 ed3=new ExceptionDemo7();
			ed3.myData();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
