package com.dineshkrish.feature4;

public class Feature4 {

	public static void main(String[] args) {

		MyInterface myInterface = MyClass::new;
		System.out.println(myInterface.myMethod());
		
		MyInterface myInterface2 = MyClass::getInstance;
		System.out.println(myInterface2.myMethod());
		
		MyClass myClass = new MyClass();
		MyInterface myInterface3 = myClass::getObject;
		System.out.println(myClass);
		System.out.println(myInterface3.myMethod());
		
	}
}
