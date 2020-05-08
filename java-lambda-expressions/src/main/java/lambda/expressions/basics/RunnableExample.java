package lambda.expressions.basics;

public class RunnableExample {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("***** run() method inside Runnable*****");
			}
		});
		thread1.run();

		Thread thread2 = new Thread(() -> System.out.println("****Operation inside Lambda Runnable block****"));
		thread2.run();

	}

}
