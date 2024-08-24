package com.evergent.corejava.oops;

class MyBigData{
	public void myData() {
		System.out.println("MyBigData: class Method");
	}
}

public class MethodOverridingDemo1 extends MyBigData{
	public void myData() {
		System.out.println("myData");
	}
	public void show() {
		System.out.println("Local Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingDemo1 mor=new MethodOverridingDemo1();
		mor.myData();
		mor.show();

	}

}
