package com.evergent.corejava.objectClassMethods;

public class Person1 {
	String name;
	int age;
	public Person1(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1=new Person1("Raju",30);
		System.out.println(p1.toString());
	}
}
