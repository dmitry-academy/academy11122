package by.academy.lesson15;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		int[] array = new int[3];

		try {
			System.out.println("1");
			System.out.println(array[2]);
			System.out.println("2");
			int i = 10 / 0;
			System.out.println("3");
			String n = "asd";
			n.chars();
			System.out.println("4");
			createRuntimeException();
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Вот так " + e);
		} catch (RuntimeException e) {
			System.out.println("Exception " + e);
		}
		System.out.println("End!");
	}

	private static void createRuntimeException() {
		throw new RuntimeException("Hello there!");
	}
}