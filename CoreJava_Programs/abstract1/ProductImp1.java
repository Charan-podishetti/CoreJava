package com.evergent.corejava.abstract1;
//if a class extends abstract class the class should be override 
//all the abstract methods otherwise that class will show compile time error.
public class ProductImp1 extends Product{
	
	public void show() {
		System.out.println("Local Show Method");
	}
	
	public void newProduct() {
		System.out.println("New Product");
	}

	public static void main(String[] args) {
		ProductImp1 pi1=new ProductImp1();
		pi1.show();
		pi1.newProduct();
		pi1.allProducts();
	}

}
