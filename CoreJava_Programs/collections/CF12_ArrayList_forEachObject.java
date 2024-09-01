package com.evergent.corejava.collections;

import java.util.ArrayList;

public class CF12_ArrayList_forEachObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> myList=new ArrayList<>();
		myList.add(100);
		myList.add("charan");
		myList.add("podishetti");
		for(Object o:myList) {
			System.out.println(o);
		}

	}

}
