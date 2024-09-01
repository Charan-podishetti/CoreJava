package com.evergent.corejava.string;
//split the given string and print them using forEach loop.
public class SplitDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Java is a programming language";
		String[] words=name.split(" ");
		for(String s:words) {
			System.out.println(s);
		}

	}

}
