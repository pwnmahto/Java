package lambda.expressions.basics;

/**
 * A Java program to demonstrate how to use lambda expression with no parameter.
 */

interface Printable {

	public String print();

}

public class NoParameterExample {

	public static void main(String[] args) {

		Printable printable = () -> {
			return "The print action has been done.";
		};

		System.out.println(printable.print());

	}

}
