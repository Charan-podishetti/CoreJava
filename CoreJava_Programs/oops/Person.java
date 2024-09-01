package com.evergent.corejava.oops;

public class Person {
	String name="charan";
	int age=23;
	String address="Hyderabad";
	
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("age :"+age);
		System.out.println("address :"+address);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person();
		p.display();

	}

}
