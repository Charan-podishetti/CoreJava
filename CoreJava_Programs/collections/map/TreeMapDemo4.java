package com.evergent.corejava.collections.map;

import java.util.Map;
import java.util.TreeMap;


public class TreeMapDemo4 {

	public static void main(String[] args) {
		TreeMap<Integer, String> myMap=new TreeMap<>();

		myMap.put(10,"Delhi");
		myMap.put(20, "Washington DC");
		myMap.put(30, "Berlin");
		myMap.put(40,"Delhi");
		
		System.out.println(myMap);
		for(Map.Entry<Integer, String> entry: myMap.entrySet()) {
			System.out.println("Id: "+entry.getKey()+", Name "+entry.getValue());
		}

	}

}
