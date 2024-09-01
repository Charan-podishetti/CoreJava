package com.evergent.corejava.wrapperclasses;

public class WrapperClassesDemo1 {

	public static void main(String[] args) {
	
		int a=10;
		//Automatic int to object.
		Integer i1=new Integer(a);
		System.out.println(i1);
		//object values converts to int.
		int a1=i1.intValue();
		System.out.println(a1);
		

	}

}
