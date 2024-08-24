package com.evergent.corejava.string;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("initia string: "+sb);
		
		sb.append(" world");
		System.out.println("After append: "+sb);
		
		sb.insert(6,  "beautiful ");
		System.out.println("After inserting: "+sb);
		
		sb.replace(0, 5, "Hi");
		System.out.println("After replace: "+sb);
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println("After reverse: "+sb);
		
		System.out.println("capacity: "+sb.capacity());
		System.out.println("length: "+sb.length());
	}

}
