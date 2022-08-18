package by.academy.lesson17.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
	public static void main(String[] args) {

		UnaryOperator<String> uo = s -> {
			s = s.toUpperCase();
			s = s.substring(0, 3);
			return s;
		};

		UnaryOperator<String> uo1 = s -> s.toUpperCase().substring(0, 3);
		System.out.print(uo.apply("Java 8"));

	}
}