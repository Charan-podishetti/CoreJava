package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;
public class Queue_ArrayDeque9_poll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> pq=new ArrayDeque<>();
		pq.add("Banana");
		pq.addFirst("Pineapple");
		pq.add("Watermelon");
		pq.addLast("mango");
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.pollLast());
		System.out.println(pq.pollFirst());
		
	}

}
