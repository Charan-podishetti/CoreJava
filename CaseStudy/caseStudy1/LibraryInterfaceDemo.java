package com.evergent.corejava.charan.Application5;
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		try {
			KidUser kid1=new KidUser();
			kid1.registerAccount(10);
			kid1.requestBook("Kids");
		}
		catch(InvalidAgeException | InvalidBookTypeException e) {
			System.out.println("caught an Invalid age and Invalid book type exception : "+e.getMessage());
		}
		
		try {
			KidUser kid2=new KidUser();
			kid2.registerAccount(18);
			kid2.requestBook("Fiction");
		}
		catch(InvalidAgeException | InvalidBookTypeException e) {
			System.out.println("caught an Invalid age and Invalid book type exception : "+e.getMessage());
		}
		
		try {
			AdultUser adult1=new AdultUser();
			adult1.registerAccount(5);
			adult1.requestBook("Kids");
		}
		catch(InvalidAgeException | InvalidBookTypeException e) {
			System.out.println("caught Invalid age and Invalid book type exception : "+e.getMessage());
		}
		
		try {
			AdultUser adult2=new AdultUser();
			adult2.registerAccount(23);
			adult2.requestBook("Fiction");
		}
		catch(InvalidAgeException | InvalidBookTypeException e) {
			System.out.println("caught Invalid age and Invalid book type exception : "+e.getMessage());
		}
		
		

	}

}
