package com.evergent.corejava.multiThreading;
class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
public class MultiThreading1 {

	public static void main(String[] args) {
		MyThread m1=new MyThread();
		m1.start();
		MyThread m2=new MyThread();
		m2.start();
	}

}
