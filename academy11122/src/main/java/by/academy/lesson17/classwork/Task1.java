package by.academy.lesson17.classwork;

import java.util.function.Predicate;

public class Task1 {
//	5.	Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается 
//	“A”. Используем функциональный интерфейс Predicate.
	public static void main(String[] args) {
		Printable pr = s -> System.out.println(s);
//		pr.print("alalala");

		Predicate<String> pred = s -> s != null;
//		System.out.println(pred.test("rerer"));

		Predicate<String> predIs = s -> !s.isEmpty();
//		System.out.println(predIs.test(""));
//		System.out.println(predIs.test("ewe"));
//		System.out.println(predIs.test(null));

//		System.out.println(pred.and(predIs).test("swsww"));

		Predicate<String> chekJ = s -> s.startsWith("J");
		Predicate<String> chekN = s -> s.startsWith("N");
		Predicate<String> chekA = s -> s.endsWith("A");

		Predicate<String> chekAll = s -> (s.startsWith("J") || s.startsWith("N")) && s.endsWith("A");

		System.out.println(chekAll.test("JavA"));
		System.out.println(chekAll.test("nava"));
		System.out.println(chekAll.test("NavA"));

		System.out.println(chekJ.or(chekN).and(chekA).test("JavA"));
		System.out.println(chekJ.or(chekN).and(chekA).test("nava"));
		System.out.println(chekJ.or(chekN).and(chekA).test("NavA"));

	}

}
