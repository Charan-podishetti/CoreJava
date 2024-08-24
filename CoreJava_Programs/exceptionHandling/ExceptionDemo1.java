package com.evergent.corejava.exceptionHandling;
//1. Exception handling is a mechanism.
//2. Exceptions are inbuilt mechanism of java.
public class ExceptionDemo1 {

	public static void main(String[] args) {
		//String name=null;  //jvm will handle this exception, but this is not safe. 
		String name="null";
		System.out.println(name.length());
	}

}
