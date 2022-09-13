package by.academy.lesson19;

public class MyThreadDemo {
	public static void main(String[] args) {

		MyThread myThread = new MyThread();
//		myThread.setDaemon(true);
		myThread.start();
//		myThread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("hello from main thread " + i);
		}
		System.out.println("hello there I  don't care about daemon");
	}
}