package com.evergent.corejava.exceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeFileDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("D:\\CoreJAVA_Workspace\\CoreJAVA_Development\\myData_Files\\file1.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
