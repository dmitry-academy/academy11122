package by.academy.lesson17.function;

import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String[] args) {

		Function<Double, Integer> function = d -> d.intValue();

		System.out.println(function.apply(5.7));
	}
}