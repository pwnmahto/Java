package pwnmahto.arrays.operations;

/**
 * 
 * A program to demonstrate how to pass an anonymous array to a method in Java.
 * 
 */

public class AnonymousArray {

	// method which receives the array as parameter
	static void findMaxMin(int[] numbers) {

		int min = numbers[0];
		int max = numbers[0];
		for (int number : numbers) {

			if (min > number) // to find the minimum value from the array passed
				min = number;

			if (max < number) // to find the maximum value from the array passed
				max = number;

		}
		System.out.println("Min is : " + min);
		System.out.println("Max is : " + max);

	}

	public static void main(String[] args) {
		findMaxMin(new int[] { 23, 65, 21, 9, 78, 65 }); // passing anonymous array to method
	}

}
