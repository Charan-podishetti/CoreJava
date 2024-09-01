package com.evergent.corejava.collections.stack;
import java.util.Stack;
public class Stack_Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> myStack=new Stack<>();
		myStack.add("Apple");
		myStack.add("Banana");
		myStack.add("Cherry");
		myStack.add("Date");
		System.out.println("stack : "+myStack);
		
		String topElement=myStack.peek();
		System.out.println("Top Element: "+topElement);
		String removedElement=myStack.pop();
		System.out.println("pop element: "+removedElement);
		System.out.println("stack after poping : "+myStack);
		boolean isEmpty=myStack.isEmpty();
		System.out.println("is the stack is empty: "+isEmpty);
		int position = myStack.search("Banana");
		if(position != -1) {
			System.out.println("position of 'banana' from top : "+position);
		}
		else {
			System.out.println("banana is not in the search");
		}
		myStack.clear();
		System.out.println("stack after clearing : "+myStack);
	}
}
