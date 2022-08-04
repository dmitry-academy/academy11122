package by.academy.lesson15;

public class ExceptionDemo1 {

	public static void main(String[] args) throws MyException {
		int d = 0;
		int a = 10 / d;
		String s = null;

		System.out.println(s.charAt(2));
//		System.out.println(a);
//		subRoutine();
	}

	public static void subRoutine() throws ArithmeticException {
		int d = 0;
		int a = 10 / d;
//		Double a = 1.0;
//		Double b = 0.0;
	}
}