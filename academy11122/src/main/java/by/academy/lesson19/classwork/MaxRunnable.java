package by.academy.lesson19.classwork;

import java.util.Arrays;

public class MaxRunnable implements Runnable {

	private Integer[] array;

	public MaxRunnable(Integer[] array) {
		this.array = array;
	}

	@Override
	public void run() {
		System.out.println("Max: " + Arrays.stream(array).max(Integer::compareTo));
	}

}
