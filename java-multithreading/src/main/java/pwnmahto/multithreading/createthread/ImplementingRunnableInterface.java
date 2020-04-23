package pwnmahto.multithreading.createthread;

/**
 * The Runnable interface should be implemented by any class whose instances are
 * intended to be executed by a thread. Runnable interface have only one method
 * named run().
 */
public class ImplementingRunnableInterface implements Runnable {

	public void run() {
		System.out.println("A thread has been created by implementing Runnable interface.");
	}

	public static void main(String args[]) {
		ImplementingRunnableInterface t1 = new ImplementingRunnableInterface();
		Thread thread = new Thread(t1);
		thread.start();
	}

}
