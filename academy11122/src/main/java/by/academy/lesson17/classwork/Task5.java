package by.academy.lesson17.classwork;

import java.util.function.Predicate;

//5.	Написать программу, которая проверяет, 
//что строка начинается буквой “J”или “N” и заканчивается “A”. 
//Используем функциональный интерфейс Predicate.
public class Task5 {
	public static void main(String... args) {

		Predicate<String> startsWithJ = str -> str != null && str.startsWith("J");
		Predicate<String> startsWithN = str -> str != null && str.startsWith("N");
		Predicate<String> endsWithA = str -> str != null && str.endsWith("A");
		System.out.println(endsWithA.and(startsWithJ.or(startsWithN)).test("NANANA"));
	}
}
