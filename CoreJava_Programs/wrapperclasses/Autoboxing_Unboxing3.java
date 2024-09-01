package com.evergent.corejava.wrapperclasses;

public class Autoboxing_Unboxing3 {

	public static void main(String[] args) {
		
		//--------------jdk 1.44----------------
		//auto boxing
		char ch1='a';
		Character myc=new Character(ch1);
		//auto unboxing
		char ch=myc.charValue();
		System.out.println("value of ch: "+ch);
		System.out.println("value of ch1: "+myc);
		

	}

}
