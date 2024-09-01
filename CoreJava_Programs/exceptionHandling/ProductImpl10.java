package com.evergent.corejava.exceptionHandling;
class ProductNotFoundException1 extends Exception {
	public ProductNotFoundException1(String msg) {
		super(msg);
	}
}
public class ProductImpl10
{
	int pno=150;
	public void myData() throws ProductNotFoundException1{
		if(pno>100) {
			throw new ProductNotFoundException1("This code is not there : ");
		}
		else {
			System.out.println("product is there");
		}
	}
	public static void main(String args[]) {
		try {
			ProductImpl10 pdl=new ProductImpl10();
			pdl.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle : "+e);
			System.out.println("caught ProductNotFoundException1: "+e);
		}
		System.out.println("program continues after handling the exception.");
	}
}
