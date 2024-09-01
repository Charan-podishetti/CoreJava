package com.evergent.corejava.exceptionHandling;
//if there is two exceptions in class, Developer should be handle 1st exception then after
//2nd exception will be handle.
public class ExceptionDemo3 {
	//String name="null";
	String name=null; //exception1.  //only first exception will occurs.(abnormal termination).
	int k=0;          //exception 2.
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo3 ed3=new ExceptionDemo3();
		ed3.myData();
	}
}
