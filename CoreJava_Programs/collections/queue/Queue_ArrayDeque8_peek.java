package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;
public class Queue_ArrayDeque8_peek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> pq=new ArrayDeque<>();
		pq.add("Banana");
		pq.addFirst("Pineapple");
		pq.add("Watermelon");
		pq.addLast("Watermelon");
		pq.addFirst("Watermelon");
		pq.addLast("mango");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peekLast());
		System.out.println(pq.peekFirst());
		
	}

}
