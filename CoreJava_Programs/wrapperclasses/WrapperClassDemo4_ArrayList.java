package com.evergent.corejava.wrapperclasses;
import java.util.ArrayList;
public class WrapperClassDemo4_ArrayList {
	public static void main(String[] args) {
		int a=100;
		Integer il=new Integer(a);
		ArrayList myList=new ArrayList();
		myList.add(il);
		System.out.println(myList);
		
		Integer i2=new Integer(200);
		myList.add(i2);
		System.out.println(myList);
		
		myList.add(new Integer(45));
		System.out.println(myList);
		System.out.println(myList.get(1));
		
		//----------jdk 1.5---------------
		ArrayList list=new ArrayList();
		//auto boxing
		list.add(100);
		list.add(123);
		//auto unboxing
		System.out.println(list.get(0));
	}
}
