package com.evergent.corejava.collections.queue;
import java.util.Queue;
import java.util.PriorityQueue;
public class Queue_Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq=new PriorityQueue<>();
		pq.add(8);
		pq.add(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);	
	}
}
