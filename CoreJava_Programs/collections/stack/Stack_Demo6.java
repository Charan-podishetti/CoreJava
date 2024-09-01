package com.evergent.corejava.collections.stack;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
public class Stack_Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> myStack=new Stack<>();
		myStack.add("red");
		myStack.add("black");
		myStack.add("white");
		System.out.println(myStack);
		System.out.println();
		
		System.out.println("Enumeration");
		Enumeration en=myStack.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println();
		
		System.out.println("Iterator");
		Iterator i=myStack.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
		System.out.println("for each loop");
		for(String s:myStack) {
			System.out.println(s);
		}	
	}
}
