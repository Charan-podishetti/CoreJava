package com.evergent.corejava.collections.map;

import java.util.Hashtable;

public class HashtableDemo2 {

	public static void main(String[] args) {
		Hashtable<Integer, String> myMap=new Hashtable<>();
		//duplicate values are allowed.
		//null keys/values are not allowed.
		
		//single null key is allowed, if we have more than single null value then it will reassign.
		myMap.put(100,"Ramu");
		myMap.put(200, "chinnu");
		myMap.put(300, "chinnu");
		//myMap.put(null, "abc");
		//myMap.put(400, null);
		
		System.out.println(myMap);

	}

}
