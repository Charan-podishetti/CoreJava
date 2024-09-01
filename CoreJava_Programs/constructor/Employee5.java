package com.evergent.corejava.constructor;

public class Employee5 {
	String ename;
	int eno;
	String sal;
	Employee5(){
		System.out.println("Default constructor");
	}
	Employee5(String ename, int eno,String sal){
		this();
		this.ename=ename;
		this.eno=eno;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Employee name: "+ename);
		System.out.println("Employee number: "+eno);
		System.out.println("Employee salary: "+sal);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee5 e2=new Employee5("charan",694,"26000");
		e2.display();
		
		

	}

}
