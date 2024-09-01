package com.evergent.corejava.collections.map;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> myMap=new HashMap<>();
		//duplicate values are allowed.
		//multiple null values are allowed.
		//single null key is allowed, if we have more than single null value then it will reassign.
		myMap.put(100,"Ramu");
		myMap.put(200, "chinnu");
		myMap.put(300, "chinnu");
		myMap.put(null, "abc");
		myMap.put(400, null);
		myMap.put(null,"rakshith");
		myMap.put(80, null);
		System.out.println(myMap);

	}

}
