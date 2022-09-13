package by.academy.lesson19;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {

		JoinRunnable a = new JoinRunnable("A");
		JoinRunnable b = new JoinRunnable("B");
		JoinRunnable c = new JoinRunnable("C");

		a.start();
//		try {
		a.join();
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println(Thread.currentThread().getState());
//		a.join();

		b.start();
//		try {
//		b.join();
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
		c.start();
		c.join();
		System.out.println("test");
		System.out.println(Thread.currentThread().getState());
	}
}