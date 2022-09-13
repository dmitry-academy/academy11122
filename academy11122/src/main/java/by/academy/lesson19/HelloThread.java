package by.academy.lesson19;

public class HelloThread extends Thread {
	public void run() {
		System.out.println("Hello from a thread!" + getName());
	}
}
