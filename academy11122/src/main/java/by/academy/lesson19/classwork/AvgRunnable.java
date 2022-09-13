package by.academy.lesson19.classwork;

public class AvgRunnable implements Runnable {

	private Integer[] array;

	public AvgRunnable(Integer[] array) {
		this.array = array;
	}

	@Override
	public void run() {
		int result = 0;
		for (Integer i : array) {
			result += i;
		}
		System.out.println("AVG: " + result / array.length);
	}

}