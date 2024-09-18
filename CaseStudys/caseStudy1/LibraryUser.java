package com.evergent.corejava.charan.Application5;

public interface LibraryUser {
void registerAccount(int age) throws InvalidAgeException;
void requestBook(String btype) throws InvalidBookTypeException;
}
