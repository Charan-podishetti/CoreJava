package com.evergent.corejava.Static;

public class StaticDemo4 {
	String name="charan";
    static String sname="CHARAN";
	public void myData() {
		System.out.println("myData");
		
	}
	static public void show() {
		//myData(); //we cannot access non-static methods and variables in static methods.
		//System.out.println(name);
		System.out.println(sname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo4.sname);
		//StaticDemo3.myData();
		StaticDemo4.show();
		
	}

}
