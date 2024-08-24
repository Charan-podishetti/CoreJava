package com.evergent.corejava.exceptionHandling;

public class ArrayIndexOutOfBoundException13
{
	
	public static void main(String args[]) {
		int[] numbers= {1,2,3,4,5};
		try {
			System.out.println(numbers[10]);
		}
		catch(Exception e) {
			System.out.println("caught an array : "+e);
			System.out.println("error: "+e.getMessage());
		}
		System.out.println("program continues after handling the exception.");
	}
}
