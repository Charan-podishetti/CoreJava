package com.evergent.corejava.collections.task3;
import java.util.Set;
public interface BikeInterface {
	String addBike(Bike b);
	void searchByIsbn(String isbn);
	void getAllBikes();
	boolean removeBikeByIsbn(String isbn);

}
