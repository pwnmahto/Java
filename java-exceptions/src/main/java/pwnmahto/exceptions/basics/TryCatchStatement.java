package pwnmahto.exceptions.basics;

/**
 * A program to demonstrate how to use a try-catch statement to handle the
 * exception in Java.
 */

public class TryCatchStatement {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c;

		try {
			c = a / b; // java code that may raise an exception
		} catch (ArithmeticException e) {
			System.out.println("Exception occured.");
			System.out.println(e);
		}finally{
			System.out.println("Finally block executed.");			
		}    
		// rest code of the program after catch block
		System.out.println("Rest of the code is executed if Exception is handled in the catch block.");			
	}

}