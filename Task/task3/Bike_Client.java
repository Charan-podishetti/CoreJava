package com.evergent.corejava.collections.task3;


import java.util.Scanner;
 
public class Bike_Client {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BikeInterface bike=new BikeImp();
		for(;;){
			System.out.println("1. Add Bike 2.Search by isbn 3.displayAll 4. Remove bike 5. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the isbn");
				   String isbn=sc.next();
				   System.out.println("Enter the bike name");
				   String name=sc.next();
				   System.out.println("Enter the price");
				   int price=sc.nextInt();
				   Bike b=new Bike();
				   b.setIsbn(isbn);
				   b.setBikeName(name);
				   b.setPrice(price);
				   String message=bike.addBike(b);
				   System.out.println(message);
				   break;
			case 2:System.out.println("Enter the isbn");
			   	   String isb=sc.next();
			   	   bike.searchByIsbn(isb);
			   	   break;
			  			
			case 3:bike.getAllBikes();
				break;
			case 4:
					System.out.println("Enter the ISBN to remove");
					String isbnToRemove=sc.next();
					
					bike.removeBikeByIsbn(isbnToRemove);
				break;
			case 5:
				System.exit(0);
			}
			
		}
	}
}

