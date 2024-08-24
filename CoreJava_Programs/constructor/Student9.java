package com.evergent.corejava.constructor;

public class Student9 {
	String name;
	int age;
	public Student9(String name, int age){
		this.name=name;
		this.age=age;
	}
	public Student9(Student9 s) {
		this.name=s.name;
		this.age=s.age;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student9 st1=new Student9("charan",23);
		Student9 st2=new Student9(st1);
		st1.display();
		st2.display();
		
		

	}

}
