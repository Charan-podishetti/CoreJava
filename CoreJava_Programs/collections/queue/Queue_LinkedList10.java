package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
public class Queue_LinkedList10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> pq=new LinkedList<>();
		pq.add("Ravi");
		pq.add("Charan");
		pq.offer("Gopal");
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.offer("Bunny"));
		
	}
}
