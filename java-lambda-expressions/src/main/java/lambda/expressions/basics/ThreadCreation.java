package lambda.expressions.basics;

public class ThreadCreation {

	public static void main(String[] args) {
		
		// Thread Example without lambda
		Runnable r1 = new Runnable() {
			public void run() {
				for(int i=1; i <= 5; i++) {
		            System.out.println("Thread1: "+ i);
		            try {
		               Thread.sleep(500);
		            } catch(Exception e) {
		               e.printStackTrace();
		            }
		         }
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		// Thread Example with lambda
		Runnable r2 = () -> {
			for(int i=1; i <= 5; i++) {
	            System.out.println("Thread2: "+ i);
	            try {
	               Thread.sleep(500);
	            } catch(Exception e) {
	               e.printStackTrace();
	            }
	         }
		};
		Thread t2 = new Thread(r2);
		t2.start();

	}

}
