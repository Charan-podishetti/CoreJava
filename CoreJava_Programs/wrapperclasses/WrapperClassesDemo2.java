package com.evergent.corejava.wrapperclasses;
public class WrapperClassesDemo2 {
	public static void main(String[] args) {
		float f1=4.5f;
		//auto boxing
		int i1=100;
		Integer t1=new Integer(i1);
		//auto unboxing
		int i2=t1.intValue();
		
		double d1=799.89;
		Double d2=new Double(d1);
		double d3=d2.doubleValue();
		
		byte b1=10;
		Byte b2=new Byte(b1);
		byte b3=b2.byteValue();
		
		//intValue
		System.out.println("Int value is: "+i1);
		System.out.println("int object value is: "+t1);
		System.out.println("convert integer object value to primitive: "+i2);
		
		//DoubleValue
		System.out.println("Double value is: "+d1);
		System.out.println("Double object value is: "+d2);
		System.out.println("convert Double object value to primitive: "+d3);
		
		//byteValue
		System.out.println("byte value is: "+b1);
		System.out.println("byte object value is: "+b2);
		System.out.println("convert byte object value to primitive: "+b3);
	}
}
