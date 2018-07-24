package com.dineshkrish.feature3;

public class Feature3 {

	public static void main(String[] args) {

		Arithmatic<Integer> addition = (values) -> {
			int sum = 0;
			for (Integer value : values) {
				sum = sum + value;
			}
			return sum;
		};

		Arithmatic<Integer> subtraction = (values) -> {
			int sum = 0;
			for (Integer value : values) {
				sum = sum - value;
			}
			return sum;
		};

		Arithmatic<Integer> multiplication = (values) -> {
			int sum = 1;
			for (Integer value : values) {
				sum = sum * value;
			}
			return sum;
		};

		Integer result1 = addition.operation(10, 20, 30, 40, 50);
		Integer result2 = subtraction.operation(10, 20, 30, 40, 50);
		Integer result3 = multiplication.operation(10, 20, 30, 40, 50);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}
}
