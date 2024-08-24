package com.evergent.corejava.javabeans;

public class ProductBean {
	private int pno;
	private String pname;
	private double price;
	public ProductBean(int pno, String pname, double price) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
	}
	public int getpno() {return pno;}
	public String getpname() {return pname;}
	public double getsal() {return price;}
}
