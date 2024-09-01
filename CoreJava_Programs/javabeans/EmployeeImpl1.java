package com.evergent.corejava.javabeans;

public class EmployeeImpl1 {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEno(100);
		e.setEname("charan");
		e.setEsal(55000);
		
		System.out.println(e.getEno());
		System.out.println(e.getEname());
		System.out.println(e.getEsal());
	}

}
