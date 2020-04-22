package pwnmahto.collections.arraylist;

/**
 * ArrayList is a part of collection framework and is present in java.util package. It provides us dynamic arrays in Java.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();// creating an ArrayList
		list.add("Apple");// Adding object in ArrayList
		list.add("Ball");
		list.add("Cat");
		list.add("Dog");

		// Invoking arraylist object
		System.out.println(list);
	}

}
