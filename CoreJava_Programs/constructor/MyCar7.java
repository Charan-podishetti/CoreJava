package com.evergent.corejava.constructor;

class Car{
	int maxSpeed;
	String color;
	Car(){
		maxSpeed=150;
		color="White";
	}
	Car(int maxSpeed,String color){
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	public void display() {
		System.out.println(color);
		System.out.println(maxSpeed);
	}
	
}
class MyCar7 extends Car {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car e1=new Car();
		Car e2=new Car(150,"Red");
		e1.display();
		e2.display();
		
		

	}

}
