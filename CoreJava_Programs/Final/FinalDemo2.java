package com.evergent.corejava.Final;

class MyClass {
	final public void myData() {
		//name="Bunny";
		System.out.println("myData");
	}
}
public class FinalDemo2 extends MyClass{
	final String name="India";
	
	//final methods cannot be override.
	/*public void myData() {
		System.out.println();
	}*/
	
	public void myProduct() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		FinalDemo2 fd2=new FinalDemo2();
		//fd2.myData();
		fd2.myProduct();
	}
}
