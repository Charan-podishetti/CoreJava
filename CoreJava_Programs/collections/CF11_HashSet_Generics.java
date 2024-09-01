package com.evergent.corejava.collections;
import java.util.HashSet;
import java.util.Iterator;
public class CF11_HashSet_Generics {

	public static void main(String[] args) {
		HashSet<Integer> myset=new HashSet<>();
		myset.add(100);
		myset.add(10);
		//myset.add("Hello");
		myset.add(100);
		System.out.println(myset);
		
		Iterator<Integer> i=myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		for(Integer s : myset) {
			System.out.println(s);
		}
		

	}

}
