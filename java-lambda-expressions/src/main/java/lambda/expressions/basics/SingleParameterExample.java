package lambda.expressions.basics;

interface HelloInterface {

	public String sayHello(String name);

}

public class SingleParameterExample {

	public static void main(String[] args) {

		HelloInterface sayHello = (name) -> {
			return "Hello! " + name;
		};

		System.out.println(sayHello.sayHello("Jhon"));

	}

}
