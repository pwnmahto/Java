package pwnmahto.arrays.copying;

/**
 * A program to demonstrate how to copy values from one array into another array
 * efficiently. The System class has an arraycopy method to perform copy
 * operation.
 */

public class System_Arraycopy {

	public static void main(String args[]) {

		int[] source = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] destination = new int[5];

		// arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(source, 1, destination, 0, 5);

		for (int value : destination) {
			System.out.println(value); // Output : 2 3 4 5 6
		}
	}

}
