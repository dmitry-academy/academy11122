package by.academy.lesson7;

public class Recursion2 {

	static long test(long stop, int n) {

		if (stop-- == 0) {
			return 0;
		}
		if (n < 2) {
			return n;
		}
		return n + test(stop, n - 1);
	}

	public static void main(String[] args) {

		int stop = 10000;
		long l = test(10000, 10);
	}
}
