package by.academy.lesson19.threads;

public class MyCustomThreadDemo {

	public static void main(String[] args) {

		MyThread thread = new MyThread();
//		thread.run();
		thread.start();

		Runnable runnable = new MyRunnableImpl();
		Thread thread1 = new Thread(runnable);
		thread1.start();

		Thread thread21 = new Thread(() -> {
			// do something
		});

	}

}
