package com.evergent.corejava.collections.stack;
import java.util.Stack;
public class Stack_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack myStack=new Stack();
		myStack.add("red");
		myStack.add("black");
		myStack.add("white");
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}
