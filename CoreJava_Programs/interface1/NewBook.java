package com.evergent.corejava.interface1;
//one interface can extends other interface.
public interface NewBook extends MyDataInfo{
public void addNewBook();
public void bookPrice(); //we have the same method in Book interface. Therefore we can say that
//interface supports multiple inheritance.
}
