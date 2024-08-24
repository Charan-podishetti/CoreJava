package com.evergent.corejava.javabeans;

public class ProductImpl2 {

	public static void main(String[] args) {
		ProductBean pb=new ProductBean(100,"laptop",55000);
		System.out.println(pb.getpno());
		System.out.println(pb.getpname());
		System.out.println(pb.getsal());
	}
}
