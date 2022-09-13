package by.academy.lesson19;

public class SleepRunnableDemo {
	public static void main(String[] args) {
		SleepRunnable sleepRunnable = new SleepRunnable();
		Thread one = new Thread(sleepRunnable);
		Thread two = new Thread(sleepRunnable);
		Thread three = new Thread(sleepRunnable);

		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Rick");

		one.start();
		two.start();
		three.start();
	}
}