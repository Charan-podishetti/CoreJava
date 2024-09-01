package com.evergent.corejava.interface1;
//Interface supports multiple inheritance.
public class BookImp3 implements Book,NewBook{
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
	//these are the methods from "NewBook interface".
	public void myData() {
		System.out.println("Java new version");
	}
	public void addNewBook() {
		System.out.println("My Data Interface");
	}
	public static void main(String[] args) {
		BookImp3 bi=new BookImp3();
		bi.bookName();
		bi.bookAuthor();
		bi.bookPrice();
		bi.show();
		bi.myData();
		bi.addNewBook();	
	}
}
