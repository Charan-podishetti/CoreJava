package com.evergent.corejava.collections.map;

import java.util.HashMap;

public class HashMapDemo3 {

	public static void main(String[] args) {
		HashMap<String, String> capitalcity=new HashMap<>();

		capitalcity.put("India","Delhi");
		capitalcity.put("USA", "Washington DC");
		capitalcity.put("Germany", "Berlin");
		capitalcity.put("India","Delhi");
		
		System.out.println(capitalcity);
		for(String s:capitalcity.keySet()) {
			System.out.println(s);
		}

	}

}
