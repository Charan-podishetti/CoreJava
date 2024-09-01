package com.evergent.corejava.collections;

import java.util.LinkedHashSet;

public class CF13_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		System.out.println(linkedHashSet);
		
		System.out.println("iterating over linkedHashSet : ");
		for(String fruit:linkedHashSet) {
			System.out.println(fruit);
		}
		System.out.println("contains banana : "+linkedHashSet.contains("Banana"));
		linkedHashSet.remove("Banana");
		System.out.println("After removing Banana: "+linkedHashSet);
		System.out.println("size of linkedHashSet : "+linkedHashSet.size());
		linkedHashSet.clear();
		System.out.println("After clearing : "+linkedHashSet);

	}

}
