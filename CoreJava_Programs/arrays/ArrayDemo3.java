package com.evergent.corejava.arrays;

public class ArrayDemo3 {
//initializing values to array through for loop and printing them using for loop.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}

	}

}
