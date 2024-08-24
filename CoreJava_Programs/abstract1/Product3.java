package com.evergent.corejava.abstract1;
//abstract class having abstract methods and concrete methods.
//if a class having one abstract methods that class should be declared as abstract class. 
//otherwise that will be showing compile time error.
abstract public class Product3 {
	//constructor.
	public Product3() {
		System.out.println("Product2 constructor : abstract class");
	}
	abstract public void newProduct();
	public void allProducts()
	{
		System.out.println("All Product");
	}

}
