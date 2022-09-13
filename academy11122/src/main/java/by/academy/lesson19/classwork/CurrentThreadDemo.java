package by.academy.lesson19.classwork;

import java.util.ArrayList;
import java.util.List;

public class CurrentThreadDemo {

	public static void main(String[] args) {
//		Thread t = Thread.currentThread();
//
//		System.out.println(t.getId());
//		System.out.println(t.getName());
//		System.out.println(t.getPriority());
//		System.out.println(t.isDaemon());

		MyRunnable mr = new MyRunnable();
		List<Thread> threads = new ArrayList<>();
		for (int j = 0; j < 100; j++) {
			for (int i = 1; i <= 10; i++) {
				Thread t = new Thread(mr);
				t.setPriority(i);
				threads.add(t);
			}
		}
		threads.parallelStream().forEach(t -> t.start());
	}

}
