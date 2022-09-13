package by.academy.lesson19;

public class IsAliveDemo {
	public static void main(String[] args) throws InterruptedException {
		
		int[] array = {1,2,3};
		MyRunnable myRunnable = new MyRunnable(array);

		Thread thread = new Thread(myRunnable);
		System.out.println("Before starting: " + thread.isAlive());
		thread.start();
		System.out.println("After starting: " + thread.isAlive());
		thread.join();
		System.out.println("After thread completed: " + thread.isAlive());
	}
}