package com.evergent.corejava.oops;

public class InheritanceDemo1 extends Calculations {
	public void show() {
		System.out.println("Local method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceDemo1 id=new InheritanceDemo1();
		id.show();
		id.addition();
		

	}

}
