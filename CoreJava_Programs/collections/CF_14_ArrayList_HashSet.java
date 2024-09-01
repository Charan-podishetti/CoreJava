package com.evergent.corejava.collections;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class CF_14_ArrayList_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("corejava");
		list.add("J2EE");
		list.add("J2SE");
		list.add("myjava");
		System.out.println(list);
		Set<String> s=new HashSet<String>();
		s.addAll(list);
		System.out.println(s);
		Set<String> s1=new HashSet<String>();
		s1.add("corejava");
		list.add("J2EE");
		list.add("J2SE");
		list.add("myjava");
		s1.add("hello");
		if(s.equals(s1)) {
			System.out.println("same");
		}
		else {
			System.out.println("Not Same");
		}
		System.out.println(s.containsAll(s1));

	}

}
