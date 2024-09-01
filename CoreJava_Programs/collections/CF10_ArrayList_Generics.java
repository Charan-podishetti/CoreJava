package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CF10_ArrayList_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList myList=new ArrayList<Integer>();
		myList.add(100);
		myList.add(10);
		myList.add(20);
		System.out.println(myList);
		Iterator i=myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
