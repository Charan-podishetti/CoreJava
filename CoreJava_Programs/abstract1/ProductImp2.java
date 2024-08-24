package com.evergent.corejava.abstract1;
//if a class extends abstract class the class should be override 
//all the abstract methods otherwise that class will show compile time error.
public class ProductImp2 extends Product{
	
	public void show() {
		System.out.println("Local Show Method");
	}
	
	public void newProduct() {
		System.out.println("New Product");
	}

	public static void main(String[] args) {
//we cannot create object to abstract class, but we can create reference to abstract class.
		Product pi1=new ProductImp2();
		//if we create reference to abstract class then only abstract methods are called.
		//pi1.show();
		pi1.newProduct();
		pi1.allProducts();
	}

}
