package com.evergent.corejava.oops;

public class MethodOverloading {
	public void loginDetails() {
		System.out.println("Login Details");
	}
	
	public void loginDetails(String name, String pass) {
		System.out.println("UserName : "+name);
		System.out.println("Password : "+pass);
	}
	
	public void loginDetails(String uname, String pass, int age) {
		System.out.println("User Name: "+uname);
		System.out.println("Password : "+pass);
		System.out.println("age : "+age);
	}
	public void loginDetails(int mobile, String pass) {
		System.out.println("MobileNo: "+mobile);
		System.out.println("Password: "+pass);
	}
	public void show() {
		System.out.println("Method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mol=new MethodOverloading();
		mol.loginDetails();
		mol.loginDetails("charan", "charan123");
		mol.loginDetails("Ramu", "Ramu123", 23);
		mol.loginDetails(57253865, "cbrg37");
		mol.show();
	}

}
