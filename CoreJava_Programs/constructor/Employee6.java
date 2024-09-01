package com.evergent.corejava.constructor;

class Employee{
	int eno;
	Employee(){
		
	}
	Employee(int eno){
		System.out.println(eno);
	}
	
}
class Employee6 extends Employee {
	String ename;
	int eno;
	double sal;
	Employee6(){
		System.out.println("default constructor");
	}
	Employee6(String ename,double sal, int eno){
		super(eno);
		this.ename=ename;
		this.eno=eno;
		this.sal=sal;
	}
	public void display() {
		System.out.println(ename);
		System.out.println(sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee6();
		Employee6 e2=new Employee6("charan",55000, 694);
		e2.display();
	}
}
