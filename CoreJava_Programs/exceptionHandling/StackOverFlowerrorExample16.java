package com.evergent.corejava.exceptionHandling;

public class StackOverFlowerrorExample16 {

	public static void main(String[] args) {
		try {
			recursiveMethod();
		}
		catch(StackOverflowError e) {
			System.out.println("stackOverFlowError caught: "+e.getMessage());
		}

	}
	public static void recursiveMethod() {
		recursiveMethod();
	}

}
