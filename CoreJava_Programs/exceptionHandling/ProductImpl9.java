package com.evergent.corejava.exceptionHandling;
class ProductNotFoundException extends Exception {
	public ProductNotFoundException(String msg) {
		System.out.println("Hello : "+msg);
	}
}
public class ProductImpl9
{
	int pno=150;
	public void myData() throws ProductNotFoundException{
		if(pno>100) {
			throw new ProductNotFoundException("This code is not there : ");
		}
		else {
			System.out.println("product is there");
		}
	}
	public static void main(String args[]) {
		try {
			ProductImpl9 pdl=new ProductImpl9();
			pdl.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle : "+e);
		}
	}
}
