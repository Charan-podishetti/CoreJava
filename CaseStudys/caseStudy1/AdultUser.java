package com.evergent.corejava.charan.Application5;
public class AdultUser implements LibraryUser{
	
	int age;
	String bookType;
	
	public void registerAccount(int age) throws InvalidAgeException{
		this.age=age;
		if(age > 12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		else {
			throw new InvalidAgeException("Sorry, Age must be greater than 12 to register as an Adult");
		}
	}
	
	public void requestBook(String bookType) throws InvalidBookTypeException{
		this.bookType=bookType;
		if(bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			throw new InvalidBookTypeException("Oops, you are allowed to take only adult Fiction books");
		}
	}

}
