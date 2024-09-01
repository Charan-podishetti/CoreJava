package com.evergent.corejava.Static;

public class StaticDemo2 {
	static String name="charan";
	static public void myData() {
		System.out.println("myData");
	}
	static public void show() {
		myData();
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo2.name);
		StaticDemo2.myData();
		StaticDemo2.show();
	}
}
