package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;
public class Queue_ArrayDeque6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> pq=new ArrayDeque<>();
		pq.add("Ravi");
		pq.add("Charan");
		pq.offer("Gopal");
		System.out.println(pq);
		System.out.println(pq.peek());
	}

}
