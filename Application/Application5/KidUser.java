package com.evergent.corejava.charan.Application5;

public class KidUser implements LibraryUser{
	
	int age;
	String bookType;
	
	public void registerAccount(int age)throws InvalidAgeException {
		this.age=age;
		if(age < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			throw new InvalidAgeException("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	
	public void requestBook(String bookType) throws InvalidBookTypeException {
		this.bookType=bookType;
		if(bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			throw new InvalidBookTypeException("Oops, you are allowed to take only kids books");
		}
	}

}
