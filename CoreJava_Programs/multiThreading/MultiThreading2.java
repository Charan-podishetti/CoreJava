package com.evergent.corejava.multiThreading;
class MyThread2 implements Runnable
{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
public class MultiThreading2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t1=new MyThread2();
		Thread t2=new Thread(t1);
		t2.start();
		Thread t3=new Thread(t1);
		t3.start();
	}
}
