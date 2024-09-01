package com.evergent.corejava.collections;
import java.util.*;
public class HashSetDemo3 {

	public static void main(String[] args) {
		HashSet mySet=new HashSet();
		mySet.add(100);
		mySet.add(10);
		mySet.add("Hello");
		mySet.add(100);
		System.out.println(mySet);
	}

}
