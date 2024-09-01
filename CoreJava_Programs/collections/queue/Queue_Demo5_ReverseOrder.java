package com.evergent.corejava.collections.queue;
import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

public class Queue_Demo5_ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(8);
		pq.add(10);
		pq.offer(2);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

	}

}
