package com.evergent.corejava.Static;

public class StaticDemo6 {
	static String name="charan";
	static String address="Hyderabad";
	public void display() {
		name="welcome";
		System.out.println(name);
		System.out.println(address);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo6 sd6=new StaticDemo6();
		System.out.println(StaticDemo6.name);
		sd6.display();
		
		
		System.out.println(StaticDemo6.name);
		
	}
}
