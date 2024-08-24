package com.evergent.corejava.Static;

public class StaticDemo5 {
	static String name;
	//we can initialize "final" variables in static block but that variable should be "static" also.
	static final int a;
	
static{
	name="charan";
	a=10;
}
public void display() {
	System.out.println(StaticDemo5.name);
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticDemo5 sd=new StaticDemo5();
		sd.display();
	
		
	}
}
