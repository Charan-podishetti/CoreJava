package com.evergent.corejava.collections;

import java.util.ArrayList;

class Book5{
	String name;
	public Book5(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
}

public class CF9_ArrayList_BookObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book5 b1=new Book5("core java");
		Book5 b2=new Book5("let us c");
		Book5 b3=new Book5("java index book");
		
		ArrayList myList=new ArrayList();
		myList.add(b1);
		myList.add(b2);
		myList.add(b3);
		System.out.println(myList);
		

	}

}
