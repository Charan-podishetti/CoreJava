package com.evergent.corejava.oops;

public class MethodsFlow {
	
	public void show() {
		System.out.println("No parameters with No return type");
	}
	
	public void myData(int a, int b) {
		System.out.println(a+b);
	}
	public int myMul(int a, int b) {
		return a*b;
	}
	public int myChange() {
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsFlow mf=new MethodsFlow();
		mf.show();
		mf.myData(10,20);
		System.out.println(mf.myMul(1, 2));
		System.out.println(mf.myChange());

	}

}
