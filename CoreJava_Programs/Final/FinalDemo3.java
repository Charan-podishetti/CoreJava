package com.evergent.corejava.Final;
//we cannot access final class through inheritance.
//final class MyClass
class MyFinalClass {
	final public void myData() {
		//name="Bunny";
		System.out.println("myData");
	}
}
public class FinalDemo3 extends MyFinalClass{
	final String name="India";
	//final methods cannot be override.
	/*public void myData() {
		System.out.println();
	}*/
	public void myProduct() {
		System.out.println(name);
		}
	public static void main(String[] args) {
		FinalDemo3 fd2=new FinalDemo3();
		//fd2.myData();
		fd2.myProduct();
	}
}
