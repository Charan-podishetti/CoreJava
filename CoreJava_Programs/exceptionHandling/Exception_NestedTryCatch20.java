package com.evergent.corejava.exceptionHandling;
public class Exception_NestedTryCatch20 {
	//String name="null";
	String name=null; //exception1.  //only first exception will occurs.(abnormal termination).
	int k=0;          //exception 2.
	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length());
			try {
				int t=10/k;
				
			}
			catch(ArithmeticException e) {
				System.out.println("Nested try: "+e);
			}
			finally {
				System.out.println("finally block:  inner try");
			}
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
		Exception_NestedTryCatch20 ed3=new Exception_NestedTryCatch20();
		ed3.myData();
	}
}
