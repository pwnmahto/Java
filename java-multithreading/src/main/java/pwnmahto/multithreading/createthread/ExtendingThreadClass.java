package pwnmahto.multithreading.createthread;

/**
 * Thread class provide constructors and methods to create and perform
 * operations on a thread.Thread class extends Object class and implements
 * Runnable interface.
 */
public class ExtendingThreadClass extends Thread {

	@Override
	public void run() {
		System.out.println("A thread has been created by extending Thread class.");
	}

	public static void main(String args[]) {
		ExtendingThreadClass thread = new ExtendingThreadClass();
		thread.start();
	}

}
