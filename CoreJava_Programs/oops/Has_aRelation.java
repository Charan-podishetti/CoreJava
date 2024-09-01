package com.evergent.corejava.oops;

public class Has_aRelation {
	public void myData() {
		System.out.println("Has-a myData");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Has_aRelation has = new Has_aRelation();
		has.myData();
		Person p=new Person();
		p.display();

	}

}
