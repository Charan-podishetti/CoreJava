package com.evergent.corejava.exceptionHandling;
//we should follow exception hierarchy.
public class ExceptionDemo4 {
	//String name="null";
	String name="null"; 
	int k=0;          
	public void myData() {
		try {
			System.out.println("ONE");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
			System.out.println("END");
		}
		//we need to follow exception hierarchy.
		/*catch(Exception e) {
			System.out.println("I can handle : "+e);
		}*/
		catch(NullPointerException e) {
			System.out.println("I can handel : "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handel : "+e);
		}
		catch(Exception e) {
			System.out.println("I can handle : "+e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo4 ed3=new ExceptionDemo4();
		ed3.myData();
	}
}
