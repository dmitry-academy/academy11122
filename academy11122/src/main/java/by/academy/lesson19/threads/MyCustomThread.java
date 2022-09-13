package by.academy.lesson19.threads;

public class MyCustomThread extends Thread {

	private int innerCounter = 0;
	private String test;

	public MyCustomThread(String test) {
		super();
		this.test = test;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			innerCounter++;
			System.out.println("InnerCounter: " + innerCounter + test);
			MultithreadingDemo.incrementCounter();
		}
	}

}
