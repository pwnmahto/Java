package lambda.expressions.basics;

/**
 * If there is only one statement, we may or may not use the return keyword. We
 * must use the return keyword when lambda expression contains multiple
 * statements.  
 */

interface Addable {
	int add(int a, int b);
}

public class LambdaReturnExample {

	public static void main(String[] args) {

		// Lambda expression without return keyword.
		Addable addable1 = (a, b) -> (a + b);
		System.out.println(addable1.add(100, 200));

		// Lambda expression with return keyword.
		Addable addable2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(addable2.add(200, 200));

		// Lambda expression with multiple statements.
		Addable addable3 = (int a, int b) -> {
			if (a > 0 && b > 0) {
				return (a + b);
			} else {
				return (Math.abs(a) + Math.abs(b));
			}

		};
		System.out.println(addable3.add(-200, 200));

	}

}
