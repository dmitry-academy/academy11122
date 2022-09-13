package by.academy.lesson19;

import cern.colt.Arrays;

public class MyRunnable implements Runnable {

	private int[] array;

	public MyRunnable() {
		super();
	}

	public MyRunnable(int[] array) {
		super();
		this.array = array;
	}

	@Override
	public void run() {
		System.out.println("Важная работа выполняется.");
		System.out.println(Arrays.toString(array));
		
	}
}