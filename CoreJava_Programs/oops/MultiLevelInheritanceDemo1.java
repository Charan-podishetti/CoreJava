package com.evergent.corejava.oops;

class MyPerson {
	public void personInfo() {
		System.out.println("charan");
	}
}
class PersonDetails extends MyPerson{
	public void personData() {
		System.out.println("Hyderabad");
	}
}
	
public class MultiLevelInheritanceDemo1 extends PersonDetails{
	public void show() {
		System.out.println("Local method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritanceDemo1 mi=new MultiLevelInheritanceDemo1();
		mi.personInfo();
		mi.personData();
		mi.show();

	}

}
