package by.academy.lesson17.classwork;

public class LambdaDemo {

	@FunctionalInterface
	interface Searchable {

		default int defaultMethod() {
			return 0;
		}

		boolean test(String s);
	}

	@FunctionalInterface
	interface Saleable {

		default int defaultMethod() {
			return 0;
		}

		boolean approve(String s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Searchable s1 = c -> c.isBlank();
		Saleable s2 = c -> c.isBlank();

		System.out.println(s1.test(""));
		s1.defaultMethod();
		System.out.println(s2.approve("asdasd"));
		s2.defaultMethod();

	}

}
