package com.evergent.StudentApplication;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int studentId=0;
		String name="";
		float score=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter student ID");
		studentId=sin.nextInt();
		System.out.println(("Enter student Name"));
		name = sin.next();
		System.out.println("Enter student Score");
		score = sin.nextFloat();
		
		StudentService studentService = new StudentService();
		
		int updeateCount=studentService.addStudentService(studentId,name,score);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record ram Success");
		
		
		
		
	}

}
