package com.evergent.corejava.constructor;

class Animal{
	
	private String name;
	private int age;
	public Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
	
}
class Dog extends Animal {
	String breed;
	public Dog(String name, int age, String breed) {
		super(name,age);
		this.breed=breed;
	}
	public void display() {
		super.display();
		System.out.println(breed);
	}
}

public class Inheritance_Overriding8{
	public static void main(String[] args){
		Dog dog=new Dog("Buddy",10,"Golden Retrever");
		dog.display();
		
	}
}
