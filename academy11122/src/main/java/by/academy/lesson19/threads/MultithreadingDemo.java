package by.academy.lesson19.threads;

public class MultithreadingDemo {

	public static int counter = 0;

	public static void incrementCounter() {
		counter++;
		System.out.println("Global counter: " + counter);
	}

	public static void main(String... args) {

//		Thread t1 = new Thread(new MyRunnableImpl());
//		Thread t2 = new Thread(new MyRunnableImpl());
//		Thread t3 = new Thread(new MyRunnableImpl());

		Thread t1 = new MyCustomThread("Hello there 1");
		Thread t2 = new MyCustomThread("Hello there 2");
		Thread t3 = new MyCustomThread("Hello there 3");

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {

		}
		System.out.println("RESULT: " + counter);
		System.out.println("END!");
	}
}
