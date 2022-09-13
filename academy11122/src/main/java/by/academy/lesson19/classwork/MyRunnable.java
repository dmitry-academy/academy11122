package by.academy.lesson19.classwork;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("My priority: " + Thread.currentThread().getPriority());
	}

}
