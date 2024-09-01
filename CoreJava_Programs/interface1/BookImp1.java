package com.evergent.corejava.interface1;

public class BookImp1 implements Book{
	public void bookName() {
		System.out.println("core java");
	}
	public void bookAuthor() {
		System.out.println("oracle corp");
	}
	public void bookPrice() {
		System.out.println("Rs : 550");
	}
	public void show() {
		System.out.println("show is local method");
	}
	public static void main(String[] args) {
		BookImp1 bi=new BookImp1();
		bi.bookName();
		bi.bookAuthor();
		bi.bookPrice();
		bi.show();
	}
}



