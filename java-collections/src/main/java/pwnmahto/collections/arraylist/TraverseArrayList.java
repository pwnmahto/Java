package pwnmahto.collections.arraylist;

/**
 * A programs to demonstrate various ways of iteration of elements of ArrayLisy in Java.
 * By Iterator interface, By for-each loop, By ListIterator interface, By for loop, By forEach() method, & By forEachRemaining() method. 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TraverseArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();// creating an ArrayList
		list.add("Apple");// Adding object in ArrayList
		list.add("Ball");
		list.add("Cat");
		list.add("Dog");
		list.add("Elephant");

		// By Iterator interface
		System.out.println("Traverse ArrayList elements using the Iterator interface : ");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// By for-each loop
		System.out.println("\nTraverse ArrayList elements using the for-each loop : ");
		for (String value : list) {
			System.out.println(value);
		}

		// By ListIterator interface
		System.out.println("\nTraverse ArrayList elements using the ListIterator interface : ");
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String value = listIterator.next();
			System.out.println(value);
		}

		// By for loop
		System.out.println("\nTraverse ArrayList elements using the for loop : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// By forEach() method
		System.out.println("\nTraverse ArrayList elements using the forEach() method : ");
		list.forEach(value -> { // use of lambda expression
			System.out.println(value);
		});

		// By forEachRemaining() method. Here, we are using lambda expression
		System.out.println("\nTraverse ArrayList elements using the forEachRemaining() method : ");
		Iterator<String> itr2 = list.iterator();
		itr2.forEachRemaining(a -> {
			System.out.println(a);
		});
	}

}
