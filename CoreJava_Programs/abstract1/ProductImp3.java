package com.evergent.corejava.abstract1;
//we can create constructor to abstract class.
//we can access abstract class constructor through sub class object creation.
public class ProductImp3 extends Product3{
	
	ProductImp3(){
		System.out.println("productImp3 : constructor");
	}
	public void show() {
		System.out.println("Local Show Method");
	}
	
	public void newProduct() {
		System.out.println("New Product");
	}

	public static void main(String[] args) {
//we cannot create object to abstract class, but we can create reference to abstract class.
		ProductImp3 pi1=new ProductImp3();
		//if we create reference to abstract class then only abstract methods are called.
		pi1.show();
		pi1.newProduct();
		pi1.allProducts();
	}

}
