package com.evergent.corejava.exceptionHandling;
//throws an exception will be executed method by methods.
public class ExceptionDemo8throws {
	String name=null;
	public void myData() throws NullPointerException//4 //6
	{
		System.out.println("ONE");
		System.out.println(name.length());//5
		System.out.println("END");
	}
	public void myInfo() throws NullPointerException //2  //7
	{
		myData();//3
		System.out.println("MY Info methods");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionDemo8throws ed8=new ExceptionDemo8throws();
			ed8.myInfo(); //1
		}
		catch(Exception e)//8
		{
			System.out.println("I can handle : "+e);
		}
	}
}
