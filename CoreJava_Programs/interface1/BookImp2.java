package com.evergent.corejava.interface1;
//We cannot create objects to interface but we can create reference to interface.
//if we create reference to interface only interface methods will visible. but not local class methods.
public class BookImp2 implements Book{
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
		Book bi=new BookImp2();
		bi.bookName();
		bi.bookAuthor();
		bi.bookPrice();
		//bi.show();
	}
}
