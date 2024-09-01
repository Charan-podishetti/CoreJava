package com.evergent.corejava.collections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo4 {

	public static void main(String[] args) {
		HashSet<Integer> myset=new HashSet<Integer>();
		myset.add(100);
		myset.add(10);
		myset.add(100);
		System.out.println(myset);
		
		Iterator i=myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
