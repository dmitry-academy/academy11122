package by.academy.lesson4.classwork;

public class TaskN {

	public static void main(String[] args) {
		someMethod();
	}

	private static void someMethod() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				return;
			}
			System.out.println(i);
		}
		System.out.println("After for loop");
	}

}
