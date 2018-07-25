package com.dineshkrish.feature4;

public class MyClass {

	public MyClass() {
		System.out.println("Object Cretaed");
	}
	
	public static MyClass getInstance() {
		
		return new MyClass();
	}
	
	public MyClass getObject() {
		
		return this;
	}
	
}
