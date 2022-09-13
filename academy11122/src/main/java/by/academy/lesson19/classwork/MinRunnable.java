package by.academy.lesson19.classwork;

import java.util.Arrays;

public class MinRunnable implements Runnable {

	private Integer[] array;

	public MinRunnable(Integer[] array) {
		this.array = array;
	}

	@Override
	public void run() {
		System.out.println("Min: " + Arrays.stream(array).min(Integer::compareTo));
	}

}
