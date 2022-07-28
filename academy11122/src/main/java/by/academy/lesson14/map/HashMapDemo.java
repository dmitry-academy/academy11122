package by.academy.lesson14.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Double> marks = new HashMap<>();
		Map<String, Double> marks1 = new HashMap<>();

		System.out.println(marks.isEmpty());
		marks.put("Петров", 9.0);
		marks.put("Сидоров", 8.0);
		marks.put("Баширов", 7.0);

		if (marks.containsKey("Петров")) {
			Double newValue = (marks.get("Петров") + 6.0) / 2;
			marks.put("Петров", newValue);
		} else {
			marks.put("Петров", 6.0);
		}

		for (String key : marks.keySet()) {
			System.out.println(key);
		}

		for (Double key : marks.values()) {
			System.out.println(key);
		}

		for (String key : marks.keySet()) {
			System.out.println(key + " : " + marks.get(key));
		}
		marks1.putAll(marks);
		System.out.println(marks.isEmpty());
		marks.remove("Петров");

		for (String key : marks.keySet()) {
			System.out.println(key + " : " + marks.get(key));
		}
//		System.out.println(marks.size());
//
//		System.out.println(marks.get("Петров"));

//		WrongHashCat cat1 = new WrongHashCat("вася");
//		WrongHashCat cat2 = new WrongHashCat("барсик");
//		WrongHashCat cat3 = new WrongHashCat("платон");
//		WrongHashCat cat4 = new WrongHashCat("кузя");
//		WrongHashCat cat5 = new WrongHashCat("вася");
//		WrongHashCat cat6 = new WrongHashCat("вася");
//
//		Map<WrongHashCat, Integer> hashMap = new HashMap<>();
//
//		hashMap.put(cat1, 1);
//		hashMap.put(cat2, 2);
//		hashMap.put(cat3, 3);
//		hashMap.put(cat4, 4);
//
////		hashMap.put("Иванов2", 1.0);
////		hashMap.put("Петров", 123.22);
////		hashMap.put("Сидоров", 1378.00);
//
//		Set<WrongHashCat> keys = hashMap.keySet();
//
//		for (WrongHashCat key : keys) {
//			System.out.print(key + ": ");
//			System.out.println(hashMap.get(key));
//		}

	}
}