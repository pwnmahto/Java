package pwnmahto.arrays.copying;

import java.util.Arrays;

/**
 * The java.util.Arrays.copyOf(int[] original,int newLength) method copies the
 * specified array, truncating or padding with zeros (if necessary) so the copy
 * has the specified length.
 * 
 * public static int[] copyOf(int[] original,int newLength) Parameters 1 :
 * original − This is the array to be copied & 2 : newLength − This is the
 * length of the copy to be returned.
 */

public class Arrays_CopyOf {

	public static void main(String args[]) {

		int[] source = { 1, 2, 3 };

		// copying elements of source[] to destination[]
		int[] destination = Arrays.copyOf(source, 5);

		System.out.println("Values of source[]");
		for (int i = 0; i < source.length; i++)
			System.out.print(source[i] + " ");

		System.out.println("\nValues of destination[]");
		for (int i = 0; i < destination.length; i++)
			System.out.print(destination[i] + " ");

		destination[3] = 4;
		destination[4] = 5;

		System.out.println("\n\nAfter Modification of destination[]:");

		System.out.println("values of destination[]");
		for (int i = 0; i < destination.length; i++)
			System.out.print(destination[i] + " ");

	}
}