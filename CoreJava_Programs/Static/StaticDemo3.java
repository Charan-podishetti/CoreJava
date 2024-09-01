package com.evergent.corejava.Static;

public class StaticDemo3 {
	String name="charan";
    static String sname="CHARAN";
	public void myData() {
		//non-static methods can access both static variables and methods.
		show();
		System.out.println(sname);
	}
	static public void show() {
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo3 sd3=new StaticDemo3();
		sd3.myData();
	}
}
