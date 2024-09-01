package com.evergent.corejava.io.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializableData {

	public static void main(String[] args) {
		
		  try {
			  Product  p=new Product();
			 // FileInputStream fis= new FileInputStream("product.txt");
			  FileInputStream fis= new FileInputStream("D:\\CoreJAVA_Workspace\\CoreJAVA_Development\\myData_Files");
			  
			  ObjectInputStream ois=new ObjectInputStream(fis);
			  
			  while((p=(Product)ois.readObject())!=null){				  
				  
				  System.out.println("Product Data :"+p.getPid()+p.getPname()+p.getPrice());
				  
			  }
			  
			  
		  }
		catch(Exception e) {
			//System.out.println("End of the file");
			if(e.getMessage() == null) {
				System.exit(0);
			}
		}
	}

}
