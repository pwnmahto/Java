package pwnmahto.arrays.basics;

/**
 * A program to demonstrate how to declare, instantiate, and initialize an array
 * in Java.
 */

public class DeclareInitialize {

	public static void main(String[] args) {

		int x[] = new int[5]; // declaration and instantiation, also instantiation can be done separately
		x[0] = 1; // initialization
		x[1] = 2;
		x[2] = 3;
		x[3] = 4;
		x[4] = 5;

		for (int i = 0; i < 5; i++) {
			System.out.println(x[i]);
		}

		int y[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };// Array can be declared, instantiated and initialized together.

		// Use of Java For-Each Loop or Enhanced For Loop
		for (int temp : y) {
			System.out.println(temp);
		}
	}
}