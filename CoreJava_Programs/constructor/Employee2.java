package com.evergent.corejava.constructor;

public class Employee2 {
	String ename;
	int eno;
	Employee2(){
		System.out.println("Default constructor");
	}
	Employee2(String ename1, int eno1){
		ename=ename1;
		eno=eno1;
	}
	public void display() {
		System.out.println("Employee name: "+ename);
		System.out.println("Employee number: "+eno);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee2();
		Employee2 e2=new Employee2("charan",694);
		e2.display();
		
		

	}

}
