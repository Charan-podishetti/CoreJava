package com.evergent.corejava.string;
//creating our own immutable class
public final class ImmutableString {
	private final String value;
	public ImmutableString(String value)
	{
		this.value=value;
	}
	public String myValue() {
		return value;
	}
	public String toString() {
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableString ims=new ImmutableString("Hello, String");
		System.out.println(ims.myValue());
		System.out.println(ims.toString());
	}
}
