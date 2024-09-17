package com.evergent.corejava.collections.task3;

import java.util.HashSet;
import java.util.Set;

public class BikeImp implements BikeInterface {
	Set<Bike> bikeSet=null;
	public BikeImp() {
		bikeSet=new HashSet<Bike>();
	}
	
	@Override
	public String addBike(Bike b) {
		bikeSet.add(b);
		return b.getIsbn();
	} 

	@Override
	public void searchByIsbn(String isbn) {
		boolean b=false;
		if(bikeSet.size()>0 && bikeSet!=null){
			for(Bike bike:bikeSet){
				if(bike.getIsbn().equals(isbn)){
					System.out.println(bike.getIsbn()+" "+bike.getBikeName()+" "+bike.getPrice());	
					b=true;
					break;	
				}
			}
		}
		if(!b)
			System.out.println("The bike is not found");
			
	}

	@Override
	public void  getAllBikes() {
			if(bikeSet.size()>0){
				for(Bike bike:bikeSet){
					System.out.println(bike.getIsbn()+" "+bike.getBikeName()+" "+bike.getPrice());
				}
					
			}else{
				System.out.println("No bikes are available");
			}
	}
	
	public boolean removeBikeByIsbn(String isbn) {
		boolean b=false;
		if(bikeSet.size()>0 && bikeSet!=null){
			for(Bike bike:bikeSet){
				if(bike.getIsbn().equals(isbn)){
					bikeSet.remove(bike);	
					b=true;
					break;	
				}
			}
		}
		if(!b)
			{System.out.println("The bike is not found for removal");}
		else {
			System.out.println("the bike with isbn "+ isbn + " has been removed.");
		}
		return b;
			
	}
	
	

}
