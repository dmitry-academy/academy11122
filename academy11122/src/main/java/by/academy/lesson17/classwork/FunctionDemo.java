package by.academy.lesson17.classwork;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<Integer, String> func = n -> {

			Integer i = n.compareTo(0);

			switch (i) {
			case -1:
				return "Число отрицательное";
			case 1:
				return "Число положительное";
			case 0:
				return "Ноль";
			}

			return "wat???????????";
		};

		System.out.println(func.apply(4));
		System.out.println(func.apply(1));
		System.out.println(func.apply(-1));
		System.out.println(func.apply(Integer.MIN_VALUE));
		System.out.println(func.apply(0));
		System.out.println(func.apply(Integer.MAX_VALUE));

	}

}
