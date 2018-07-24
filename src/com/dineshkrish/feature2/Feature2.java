package com.dineshkrish.feature2;

/**
 * 
 * @author Dinesh Krishnan
 *
 */

public class Feature2 {

	public static void main(String[] args) {

		MyInterface myInterface = new MyInterfaceImpl();
		
		myInterface.doSomething();
		
		myInterface.doSomething_1();
		
		MyInterface.doSomething_2();
		
	}
}
