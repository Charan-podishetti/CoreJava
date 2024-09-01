package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
public class Queue_LinkedList11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> pq=new LinkedList<>();
		pq.add("Banana");
		pq.addFirst("Pineapple");
		pq.add("Watermelon");
		pq.addLast("mango");
		System.out.println(pq);
		System.out.println(pq.poll());
		
		System.out.println(pq.size());
		boolean b=pq.isEmpty();
		System.out.println(b);
		pq.clear();
		System.out.println(pq);	
		
	}

}
