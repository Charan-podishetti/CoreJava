package com.evergent.corejava.string;
//creating our own immutable class
//PersonImmutable because once the interface is created the name and age cannot be changed.
public final class PersonImmutable {
	private final String name;
	private final int age;
	public PersonImmutable(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String myName() {
		return name;
	}
	public int myAge() {
		return age;
	}
	public static void main(String[] args) {
		PersonImmutable pi=new PersonImmutable("Raju",30);
		System.out.println(pi.name);
		System.out.println(pi.age);
	}
}
