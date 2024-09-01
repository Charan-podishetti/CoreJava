package com.evergent.corejava.collections.stack;
import java.util.Stack;
public class Stack_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack myStack=new Stack();
		myStack.add("red");
		myStack.add("black");
		myStack.add("white");
		System.out.println(myStack);
		
		myStack.clear();
		boolean b=myStack.isEmpty();
		
		System.out.println(b);
		System.out.println(myStack);
	}

}
