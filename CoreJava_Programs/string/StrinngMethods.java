package com.evergent.corejava.string;

import java.util.Arrays;

public class StrinngMethods {

	public static void main(String[] args) {
		String a;
		String b;
		System.out.println('a'+'b');
		System.out.println((char)('a'+3));
		System.out.println("a"+"b");
		//printing alphabets
		String series="";
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			series=series+ch;
		}
		System.out.println(series);
		
		//printing alphabets using append() and stringBuilder().
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			sb.append(ch);
		}
		System.out.println(sb);
		
		String name="java";
		//System.out.println(name.toCharArray()); //output: java
		System.out.println(Arrays.toString(name.toCharArray())); // [j, a, v, a]
		System.out.println(name.indexOf('a'));
		System.out.println("  java ".strip());
		// TODO Auto-generated method stub

	}

}
