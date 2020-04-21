package pwnmahto.arrays.copying;

/**
 * A program to copy one element from source array to destination array by
 * iterating each element of the source array at a time. Any modification to
 * either of the arrays will not affect the other one. Use "Arrays.copyOf",
 * "Arrays.asList", "Collections.addAll" or "System.arraycopy" instead.
 */

public class UsingIteration {

	public static void main(String args[]) {

		int[] source = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// creating an array destination[] of same size as source[]
		int[] destination = new int[source.length];

		// copying elements of source[] to destination[]
		for (int i = 0; i < source.length; i++) // Use "Arrays.copyOf", "Arrays.asList", "Collections.addAll" or
												// "System.arraycopy" instead.
			destination[i] = source[i];

		System.out.println("Values of source[]");
		for (int i = 0; i < source.length; i++)
			System.out.print(source[i] + " ");

		System.out.println("\nValues of destination[]");
		for (int i = 0; i < destination.length; i++)
			System.out.print(destination[i] + " ");

		source[0]++;
		destination[1]++;

		System.out.println("\n\nAfter Modification of both Arrays:");

		System.out.println("Values of source[]");
		for (int i = 0; i < source.length; i++)
			System.out.print(source[i] + " ");

		System.out.println("\nalues of destination[]");
		for (int i = 0; i < destination.length; i++)
			System.out.print(destination[i] + " ");

	}

}
