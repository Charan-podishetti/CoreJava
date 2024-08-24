package com.evergent.corejava.charan.Application5;
import java.util.Scanner;
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter age for KidUser: ");
			int kidAge=sc.nextInt();
			sc.nextLine();
			KidUser kid1=new KidUser();
			
			kid1.registerAccount(kidAge);
			
			System.out.println("Enter book type for kidUser: ");
			String kidBookType = sc.nextLine();
			kid1.requestBook(kidBookType);
		}
		catch(InvalidAgeException | InvalidBookTypeException e) {
			System.out.println("caught an Invalid age exception : "+e.getMessage());
		}
		
		try {
			System.out.println("Enter age for AdultUser: ");
			
			AdultUser adult=new AdultUser();
			adult.registerAccount(sc.nextInt());
			System.out.println("Enter book type for Adult: ");
			adult.requestBook(sc.nextLine());
		}
		catch(InvalidAgeException | InvalidBookTypeException e) {
			System.out.println("caught Invalid age and Invalid book type exception : "+e.getMessage());
		}
		
		

	}

}
