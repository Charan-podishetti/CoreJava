package com.evergent.corejava.Static;

public class StaticDemo1 {
	static String name="charan";
	static public void myData() {
		System.out.println("myData");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo1.name);
		StaticDemo1.myData();
		
	}

}
