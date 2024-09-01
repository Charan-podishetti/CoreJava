package com.evergent.corejava.constructor;

public class Employee3 {
	String ename;
	int eno;
	String sal;
	Employee3(){
		System.out.println("Default constructor");
	}
	Employee3(String ename, int eno,String sal){
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
		new Employee3();
		Employee3 e2=new Employee3("charan",694,"26000");
		e2.display();
		
		

	}

}
