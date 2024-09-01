package com.evergent.corejava.javabeans;
//initialization is done through setter method. retriving is done through getter method.
import java.io.Serializable;
public class Employee implements Serializable{
	private int eno;
	private String ename;
	private double sal;
	
	public void setEno(int eno) {
		this.eno=eno;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public void setEsal(double sal) {
		this.sal=sal;
	}
	
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public double getEsal() {
		return sal;
	}
}
