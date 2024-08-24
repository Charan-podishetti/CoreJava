package com.evergent.corejava.javabeans;

public class StudentBean {
	private int sno;
	private String sname;
	private double sal;
	
	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "StudentBean [sno=" + sno + ", sname=" + sname + ", sal=" + sal + "]";
	}
	
}
