package by.academy.lesson15.exceptions;

import by.academy.lesson15.MyException;

class Main {
	public static void main(String[] args) {
		System.out.println(test1(2, 1));
	}

	private static String test1(int a, int b) {
		try {
			return test2(a, b);
		} catch (MyException e) {
			return "catch";
		}
	}

	private static String test2(int a, int b) throws MyException {
		throw new MyException(1, "test");
	}
}