package com.evergent.corejava.collections;
import java.util.LinkedList;

public class CF8_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList fruits=new LinkedList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");
		
		System.out.println("Initial LinkedList: "+fruits);
		
		fruits.addFirst("Mango");
		System.out.println("After adding first element: "+fruits);
		
		fruits.addLast("Orange");
		System.out.println("After adding last element: "+fruits);
		
		fruits.removeFirst();
		System.out.println("After removing the first element: "+fruits);

		fruits.removeLast();
		System.out.println("After removing the last element: "+fruits);
		
		fruits.remove("Banana");
		System.out.println("After removing banana : "+fruits);
		
		System.out.println("size of the linked list: " + fruits.size());
		fruits.clear();
		System.out.println("After clearing the linkedList: " + fruits);
	}
}
