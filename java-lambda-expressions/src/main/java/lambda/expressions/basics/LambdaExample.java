package lambda.expressions.basics;

/**
 * Lambda expressions is used to express the instances of functional interfaces.
 * A Lambda expression is just an anonymous function, i.e., a function with no
 * name and without being bounded to an identifier. An interface with single
 * abstract method is called functional interface.
 */

/*
 * @FunctionalInterface annotation is used to ensure that the functional
 * interface can't have more than one abstract method.
 */
@FunctionalInterface
interface DisplayInterface {

	void display(String name);

}

public class LambdaExample {

	public static void main(String[] args) {

		DisplayInterface displayInterface = (String name) -> System.out.println("Hello! " + name);
		displayInterface.display("Jhon");

	}

}
