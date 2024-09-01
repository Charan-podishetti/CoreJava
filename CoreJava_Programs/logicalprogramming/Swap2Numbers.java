package com.evergent.corejava.logicalprogramming;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=3;
		System.out.println("before swaping a: "+ a+" b: "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping a: "+ a + " b: " + b);

	}

}
