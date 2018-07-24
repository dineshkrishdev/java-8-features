package com.dineshkrish.feature2;

public interface MyInterface {

	default void doSomething_1() {
		System.out.println("I am a default method...");
	}

	static void doSomething_2() {
		System.out.println("I am a static method...");
	}

	void doSomething();

}
