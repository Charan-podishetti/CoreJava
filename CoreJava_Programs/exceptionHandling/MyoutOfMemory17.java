package com.evergent.corejava.exceptionHandling;

public class MyoutOfMemory17 {

	public static void main(String[] args) throws Exception{
		try {
		Integer[] array=new Integer[1000000000 * 1000000000];
		System.out.println(array);
		}
		catch(NegativeArraySizeException e) {
			System.out.println("caught Exception "+e);
		}
		

	}

}
