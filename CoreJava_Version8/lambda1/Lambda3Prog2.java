package com.evergent.java8.lambda1;

 interface Person3a
 {
	abstract public void eat(String foodName);
 }

public class Lambda3Prog2 {

	public static void main(String[] args) {
		 
		Person3a p3= name -> { 
			
				System.out.println("Drink ..."+name);
			  			
		};
        p3.eat("Milk");
	}

}
