package by.academy.lesson19.threads;

public class MyRunnableImpl implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("RunnableCounter: " + i);
//			MultithreadingDemo.incrementCounter();
		}
	}

}