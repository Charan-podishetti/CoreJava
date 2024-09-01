package com.evergent.corejava.arrays;

public class ArrayDemo4 {
	//initializing values to array through for loop and printing them using for loop. without using "arr.length".
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[5];
		
		for(int i=0;i<5;i++) {
			arr[i]=i;
		}
		
		for(int i=0;i<5;i++) {
			System.out.print(" "+arr[i]);
		}

	}

}
