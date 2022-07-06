package by.academy.lesson7;

public class BadRecursion {

	static void recursion(int counter, int n) {
		counter++;
		System.out.println("Counter: " + counter);
		if (counter > 100) {
			return;
		}
		recursion(counter, n);
	}

	public static void main(String[] args) {
		recursion(0, 5);
	}
}