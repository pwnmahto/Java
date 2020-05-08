package lambda.expressions.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * In Java 8, we can loop a Map with forEach and lambda expression.
 */
public class LambdaForeachLoop {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Ball");
		list.add("Cat");
		list.add("Dog");

		list.forEach((n) -> System.out.println(n));
	}

}
