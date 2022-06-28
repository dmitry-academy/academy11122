package by.academy.lesson6.wrappers;

public class CounterInteger {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
		}
		long end = System.currentTimeMillis();

		for (Integer i = 0; i < Integer.MAX_VALUE; i++) {
		}
		long end1 = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(end1 - end);
	}

}
