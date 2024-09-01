package com.evergent.corejava.oops;

public class Calculations {
	int a=10;
	int b=20;
	int c;
	
	public void addition(){
		c=a+b;
		System.out.println(c);
	}
	
	public void multiplication() {
		c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calculations cal=new Calculations();
		cal.addition();
		cal.multiplication();
		
	}

}
