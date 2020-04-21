package pwnmahto.arrays.copying;

/**
 * A program to demonstrate how to copy values from one array into another array
 * efficiently using Object Clone. Object cloning means to create an exact copy
 * of the original object.
 */

public class UsingClone {

	public static void main(String args[]) {

		int[] source = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// copying elements of source[] to destination[]
		int[] destination = source.clone();

		System.out.println("Values of source[]");
		for (int i = 0; i < source.length; i++)
			System.out.print(source[i] + " ");

		System.out.println("\nValues of destination[]");
		for (int i = 0; i < destination.length; i++)
			System.out.print(destination[i] + " ");

		source[0]++;
		destination[1]++;

		System.out.println("\n\nAfter cloning of both Arrays:");

		System.out.println("Values of source[]");
		for (int i = 0; i < source.length; i++)
			System.out.print(source[i] + " ");

		System.out.println("\nalues of destination[]");
		for (int i = 0; i < destination.length; i++)
			System.out.print(destination[i] + " ");

	}

}
