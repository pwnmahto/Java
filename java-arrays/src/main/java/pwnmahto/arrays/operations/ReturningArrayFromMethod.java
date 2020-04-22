package pwnmahto.arrays.operations;

/**
 * A program to demonstrate how to return an array from a method in Java.
 */

public class ReturningArrayFromMethod {

	// method which returns an array
	static int[] createEvenNumbers() {
		int numbers[] = new int[5];

		for (int i = 0; i < 5; i++) {
			numbers[i] = i * 2;
		}
		return numbers;

	}

	public static void main(String[] args) {

		int[] evenNumbers = createEvenNumbers();

		for (int number : evenNumbers) {
			System.out.println(number);
		}
	}
}
