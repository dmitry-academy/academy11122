package by.academy.lesson19;

public class NameThreadDemo {
	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread tread1 = new Thread(nr);
		tread1.setName("First Thread");
		tread1.start();
		Thread tread2 = new Thread(nr, "Second Thread");
		Thread tread3 = new Thread(nr, "Third Thread");
		tread2.start();
		tread3.start();
	}
}