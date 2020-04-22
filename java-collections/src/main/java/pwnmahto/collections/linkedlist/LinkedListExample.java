package pwnmahto.collections.linkedlist;

/**
 * Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();// creating an LinkedList
		list.add("Apple");// Adding object in LinkedList
		list.add("Ball");
		list.add("Cat");
		list.add("Dog");

		// Invoking LinkedList object
		System.out.println(list);
	}

}
