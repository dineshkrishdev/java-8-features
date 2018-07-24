package com.dineshkrish.feature1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author Dinesh Krishnan
 *
 */

public class Feature1 {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();

		nameList.add("Dinesh");
		nameList.add("Krishnan");
		nameList.add("John");

		nameList.forEach(new Consumer<String>() {

			@Override
			public void accept(String item) {
				System.out.println(item);
			}
		});
	}
}
