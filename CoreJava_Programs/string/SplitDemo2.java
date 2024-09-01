package com.evergent.corejava.string;
//split the given string and print them using for loop.
public class SplitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Java is a programming language";
		String[] words=name.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}

	}

}
